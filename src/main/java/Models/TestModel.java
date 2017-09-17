
package Models;

import Entity.Consumidor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestModel {
    public static void main(String[]args){
        
        try {
            Entity.Consumidor con = new Consumidor();
            con.setCorreo("alonso@gmail.com");
            ConsumidorModel model = new ConsumidorModel();
            ResultSet setC = model.consumidorIniciarSesion(con);
            if(setC == null){
                System.out.println("ES NULO :C");
            }else{
                while(setC.next()){
                    System.out.println(setC.getString("NOMBRE"));
                }
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
