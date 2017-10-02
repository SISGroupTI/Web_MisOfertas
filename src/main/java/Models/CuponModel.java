
package Models;

import BD.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.internal.OracleTypes;
import oracle.jdbc.oracore.OracleType;



public class CuponModel {
    
    public ResultSet selectCuponesGeneradorPorConsumidor(Entity.Consumidor consumidor) throws ClassNotFoundException, SQLException{
        String spSelectCupones = "{call SP_SELECT_CUPONESGEN_CONSU(?,?)}";
        Connection con = BD.Conexion.getConnection();
        CallableStatement stmt = con.prepareCall(spSelectCupones);
        stmt.setInt(1, (int)consumidor.getIdConsumidor());
        stmt.registerOutParameter(2, OracleTypes.CURSOR);
        stmt.execute();
        ResultSet setCupones = (ResultSet) stmt.getObject(2);
        if(setCupones!=null){
            return setCupones;
        }          
        return null;
    }
}
