
package Controllers;

import Entity.Consumidor;
import java.sql.SQLException;

public class TesterController {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        ConsumidorController controller = new ConsumidorController();
        Consumidor test = controller.iniciarSesion("alonso@gmail.com", "alonso");
        System.out.println(test);
                
    }
}
