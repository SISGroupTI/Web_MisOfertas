
package Controllers;

import Models.HistorialCorreoModel;
import java.sql.SQLException;


public class HistorialCorreoController {
    
    public boolean RegistrarHistorialCorreo() throws ClassNotFoundException, SQLException{
        HistorialCorreoModel model = new HistorialCorreoModel();
        return model.RegistrarHistorialCorreo();
    }
     
}
