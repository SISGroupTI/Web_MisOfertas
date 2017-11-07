
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
            HistorialCorreoModel model = new HistorialCorreoModel();
            Boolean aux = model.RegistrarHistorialCorreo();
            if(aux){
                System.out.println("valido");
            }else{
                System.out.println("no valido");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
