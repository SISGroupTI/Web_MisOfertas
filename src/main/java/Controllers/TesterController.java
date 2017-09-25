
package Controllers;

import Entity.Consumidor;
import java.sql.SQLException;

public class TesterController {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
       ConsumidorController cont = new ConsumidorController();
       Consumidor con = cont.iniciarSesion("alonso@gmail.com", "alonso");
       if(con == null){
           System.out.println("nulo :c");
       } else{
           System.out.println(con.getNombre());
       }
       
                
    }
}
