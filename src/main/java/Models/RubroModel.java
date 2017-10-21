
package Models;

import Entity.Consumidor;
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
    
    public ResultSet selectRubrosDestacadoGeneral() throws ClassNotFoundException, SQLException{
        //Metodo que tiene como objetivo listar los rubros y las cantidades de ofertas que posee cada uno
        
        Connection con = BD.Conexion.getConnection();
        String spRubro = "{call SP_SELECT_RUBRO_DESTACADA(?)}";
        CallableStatement stmt = con.prepareCall(spRubro);
        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(1);
        if(set!=null){
            return set;
        }
        return null;
    }
    public ResultSet selectRubrosDestacadoConsumidor(Consumidor consumidor) throws ClassNotFoundException, SQLException{
        Connection con = BD.Conexion.getConnection();
        String spRubro = "{call SP_SELECT_RUBRO_DES_CONS(?,?)}";
        CallableStatement stmt = con.prepareCall(spRubro);
        stmt.setInt(1, (int) consumidor.getIdConsumidor());
        stmt.registerOutParameter(2, OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(2);
        if(set!=null){
            return set;
        }
        return null;
    }
    
}
