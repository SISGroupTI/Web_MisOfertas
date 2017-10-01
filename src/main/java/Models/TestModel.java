
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
            Entity.Oferta oft = new Oferta();
            oft.setIdOferta(2);
            OfertaModel model = new OfertaModel();
            ResultSet set = model.selectOfertaPorId(oft);
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
