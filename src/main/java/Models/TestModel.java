
package Models;

import Entity.Consumidor;
import Entity.Oferta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestModel {
    public static void main(String[]args) {
        try {
            OfertaModel model = new OfertaModel();
            Consumidor consumidor = new Consumidor();
            consumidor.setIdConsumidor(8);
            ResultSet set = model.selectOfertasConsumidor(consumidor);
            if(set!=null){
                System.out.println("datos");
            }else{
                System.out.println("nodatos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
