
package Tasks;

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
import static org.quartz.ee.servlet.QuartzInitializerListener.QUARTZ_FACTORY_KEY;
import org.quartz.impl.StdSchedulerFactory;

@WebListener
public class OfertasBIListener extends QuartzInitializerListener{
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        super.contextInitialized(sce);
        ServletContext ctx = sce.getServletContext();
        StdSchedulerFactory factory = (StdSchedulerFactory) ctx.getAttribute(QUARTZ_FACTORY_KEY);
        try {
            Scheduler scheduler = factory.getScheduler();
            JobDetail job = JobBuilder.newJob(OfertasBIJob.class).build();
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("bi").withSchedule(
                    CronScheduleBuilder.cronSchedule("0 0 7 ? * MON *")
            ).startNow().build();
            scheduler.scheduleJob(job, trigger);
            scheduler.start();  
        } catch (Exception e) {
            
        }
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        super.contextDestroyed(sce);
    }
    
}
