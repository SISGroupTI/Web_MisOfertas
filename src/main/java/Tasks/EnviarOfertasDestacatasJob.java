
package Tasks;

import Controllers.OfertaController;
import Entity.OfertaCorreo;
import static Tasks.TestMail.mensaje;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EnviarOfertasDestacatasJob implements Job{

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {

        final String username = "noreplymisofertas@gmail.com";
        final String password = "portafolio2017";

        Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

        
        Session session = Session.getInstance(props,
        new javax.mail.Authenticator() {
              @Override
              protected PasswordAuthentication getPasswordAuthentication() {
                      return new PasswordAuthentication(username, password);
              }
        });
        
        try {
                OfertaController controller = new OfertaController();
                List<OfertaCorreo> lista = controller.selectOfertasPorEnviarCorreo();   
                
                if(lista.size()>0){
                    for(int i=0;i<lista.size();i++){
                        OfertaCorreo oferta = lista.get(i);
                        
                        Message message = new MimeMessage(session);
                        message.setFrom(new InternetAddress("noreplymisofertas@gmail.com"));
                        message.setRecipients(Message.RecipientType.TO,
                                InternetAddress.parse(oferta.getCorreoConsumidor()));
                        message.setSubject("Tenemos una oferta especial para ti, "+oferta.getNombreConsumidor().toLowerCase());
                        
                        MimeMultipart multipart = new MimeMultipart("related");
                        BodyPart messageBodyPart = new MimeBodyPart();
                        messageBodyPart.setContent(mensaje(oferta), "text/html");
                        multipart.addBodyPart(messageBodyPart);
                        
                         messageBodyPart = new MimeBodyPart();
                        ClassLoader classLoader = TestMail.class.getClassLoader();
                        String toString = classLoader.getResource("MisOfertas-sinLetras.png").getPath();
                        System.out.println(toString);
                        DataSource fdsLogo = new FileDataSource(toString);
                        messageBodyPart.setDataHandler(new DataHandler(fdsLogo));
                        messageBodyPart.setHeader("Content-ID", "<imageLogo>");
                        multipart.addBodyPart(messageBodyPart);
                        
                        messageBodyPart = new MimeBodyPart();
                        DataSource fds = new FileDataSource(oferta.getRutaImagenPrincipal());
                        messageBodyPart.setDataHandler(new DataHandler(fds));
                        messageBodyPart.setHeader("Content-ID", "<image>");
                        multipart.addBodyPart(messageBodyPart);
                        
                        message.setContent(multipart);
                        Transport.send(message);

                    }
                } 
        } catch (MessagingException e) {
                throw new RuntimeException(e);      
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestMail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public static String mensaje(OfertaCorreo oferta){
        String mensaje=""
        + "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                        "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                        "<head>\n" +
                        "<meta name=\"viewport\" content=\"width=device-width\" />\n" +
                        "\n" +
                        "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                        "<title>Mis Ofertas</title>\n" +
                        "	\n" +
                        "<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/email.css\" />\n" +
                        "\n" +
                        "</head>\n" +
                        " \n" +
                        "<body bgcolor=\"#FFFFFF\">\n" +
                        "<!-- HEADER -->\n" +
                        "<table class=\"head-wrap\" \n" +
                        "	<tr>\n" +
                        "		<td></td>\n" +
                        "		<td class=\"header container\">\n" +
                        "			\n" +
                        "				<div class=\"content\">\n" +
                        "					<table>\n" +
                        "					<tr>\n" +
                        "						<td align=\"center\"><img src=\"cid:imageLogo\" /></td>\n" +
                        "					</tr>\n" +
                        "				</table>\n" +
                        "				</div>\n" +
                        "				\n" +
                        "		</td>\n" +
                        "		<td></td>\n" +
                        "	</tr>\n" +
                        "</table><!-- /HEADER -->"+
                        "\n" +
                        "\n" +
                        "\n" +
                        "<!-- BODY -->\n" +
                        "<table class=\"body-wrap\">\n" +
                        "	<tr>\n" +
                        "		<td></td>\n" +
                        "		<td class=\"container\" bgcolor=\"#FFFFFF\">\n" +
                        "\n" +
                        "			<div class=\"content\">\n" +
                        "			<table>\n" +
                        "				<tr>\n" +
                        "					<td>\n" +
                        "						\n" +
                        "						<h3>Hola, "+oferta.getNombreConsumidor().toLowerCase()+"</h3>\n" +
                        "						<p class=\"lead\">Queremos que sepas de esta oferta especial, la hemos seleccionado cuidadosamente</p>\n" +
                        "						\n" +
                        "						<h2>"+oferta.getTituloOferta()+"</h2>\n" +              
                        "						<!-- A Real Hero (and a real human being) -->\n" +
                        "						<p><img src=\"cid:image\" /></p><!-- /hero -->\n" +
                        "						\n" +
                        "						<h4>Caracteristicas y Condiciones</h2>\n" +              
                        "						<!-- Callout Panel -->\n" +
                        "						<p class=\"callout\">\n" +
                        "							&#9658; "+oferta.getDescripcionOferta()+" <a href=\"#\">Ver ahora!</a>\n" +
                        "						</p><!-- /Callout Panel -->\n" +
                        "						<p class=\"callout\">\n" +
                        "							&#9658; "+oferta.getCondiciones() +
                        "						</p><!-- /Callout Panel -->\n" +
                        "						\n" +
                        "						<h3>Si quieres ver más y nuevas ofertas visita cuando quieras nuestra página, áca está el link misofertas.cl</h3>\n" +
                        "												\n" +
                        "						<br/>\n" +
                        "						<br/>							\n" +
                        "												\n" +
                        "					\n" +
                        "					\n" +
                        "					</td>\n" +
                        "				</tr>\n" +
                        "			</table>\n" +
                        "			</div>\n" +
                        "									\n" +
                        "		</td>\n" +
                        "		<td></td>\n" +
                        "	</tr>\n" +
                        "</table><!-- /BODY -->\n" +
                        "\n" +
                        
                        "\n" +
                        "</body>\n" +
                        "</html>";
        return mensaje;
    }
}
