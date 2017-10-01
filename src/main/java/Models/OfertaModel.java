
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
    public ResultSet selectOfertaPorId(Oferta oferta) throws ClassNotFoundException, SQLException{
        Connection con = BD.Conexion.getConnection();
        String spSelectOfertaId = "{call SP_SELECT_OFERTA_POR_ID_CONS(?,?)}";
        CallableStatement stmt = con.prepareCall(spSelectOfertaId);
        stmt.setInt(1, (int) oferta.getIdOferta());
        stmt.registerOutParameter(2, OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(2);
        if(set != null){
            return set;
        }
        return null;
    }
    
}
