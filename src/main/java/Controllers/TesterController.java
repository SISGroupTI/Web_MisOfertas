
package Controllers;

import Entity.Consumidor;
import java.sql.SQLException;

public class TesterController {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
       ConsumidorController cont = new ConsumidorController();
        boolean con = cont.verificarCorreo("alonso@gmail.com");
        if(con){
            System.out.println("valido");
        }else{
            System.out.println("no valido");
        }
       
                
    }
}
