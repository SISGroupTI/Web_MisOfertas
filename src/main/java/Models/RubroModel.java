
package Models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;


public class RubroModel {
    
    public ResultSet selectRubrosCantOfertas() throws ClassNotFoundException, SQLException{
        //Metodo que tiene como objetivo listar los rubros y las cantidades de ofertas que posee cada uno
        
        Connection con = BD.Conexion.getConnection();
        String spRubro = "{call SP_SELECT_RUBROS_CANTOFERTAS(?)}";
        CallableStatement stmt = con.prepareCall(spRubro);
        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(1);
        if(set!=null){
            return set;
        }
        return null;
    }
    
}
