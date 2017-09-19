
package Models;

import Entity.Oferta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;

public class OfertaModel {
    
    public ResultSet selectOfertas() throws ClassNotFoundException, SQLException{
        Connection con = BD.Conexion.getConnection();
        String spSelectOferta = "{call SP_LISTAR_FECHA_TRACK(?)}";
        CallableStatement stmt = con.prepareCall(spSelectOferta);
        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(1);
        if(set!=null){
            return set;
        }
        return null;
        
    }
    
}
