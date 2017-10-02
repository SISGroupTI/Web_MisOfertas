
package Models;

import Entity.Consumidor;
import Entity.Oferta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestModel {
    public static void main(String[]args){
        
        try {
            Consumidor consumidor = new Consumidor();consumidor.setIdConsumidor(1);
            CuponModel model = new CuponModel();
            ResultSet set = model.selectCuponesGeneradorPorConsumidor(consumidor);
            if(set!= null){
                System.out.println("DATOS");
            }else{
                System.out.println("NO HAY DATOS");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
