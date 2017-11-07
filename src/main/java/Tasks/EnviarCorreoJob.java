
package Tasks;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.ee.servlet.QuartzInitializerListener;
import org.quartz.impl.StdSchedulerFactory;

@WebListener
public class EnviarCorreoJob extends QuartzInitializerListener {
    
    //private static final Logger LOG =  LoggerFactory.getLogger(EnviarCorreoJob.class);
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        super.contextInitialized(sce);
        ServletContext ctx = sce.getServletContext();
        StdSchedulerFactory factory = (StdSchedulerFactory) ctx.getAttribute(QUARTZ_FACTORY_KEY);
        try {
            Scheduler scheduler = factory.getScheduler();
            JobDetail job = JobBuilder.newJob(EnviarOfertasDestacatasJob.class).build();
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("simple").withSchedule(
                    CronScheduleBuilder.cronSchedule("0 0 8 1/1 * ? *")
            ).startNow().build();
            scheduler.scheduleJob(job, trigger);
            scheduler.start();  
        } catch (Exception e) {
            //0 0/5 * 1/1 * ? *
            //0 0 8 1/1 * ? *
            Logger.getLogger(EnviarCorreoJob.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        super.contextDestroyed(sce);
    }
}
