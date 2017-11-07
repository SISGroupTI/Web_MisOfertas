
package Models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class HistorialCorreoModel {
    
    
    public boolean RegistrarHistorialCorreo() throws ClassNotFoundException, SQLException{
        String spRegistrarHistorial = "{call SP_REGISTRAR_HISTORIAL_CORREO()}";
        Connection con = BD.Conexion.getConnection();
        CallableStatement stmt = con.prepareCall(spRegistrarHistorial);
        return stmt.execute();
    }
    
}
