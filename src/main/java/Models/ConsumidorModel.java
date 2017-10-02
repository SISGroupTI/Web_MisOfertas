
package Models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;
import Entity.Consumidor;

public class ConsumidorModel {
    public ConsumidorModel(){
        
    }
    
    public ResultSet consumidorIniciarSesion(Consumidor consumidor) throws ClassNotFoundException, SQLException{
        Connection con = BD.Conexion.getConnection();
        String spInicioSesion = "{call SP_INICIO_SESION(?,?)}";
        CallableStatement stmt = con.prepareCall(spInicioSesion);
        stmt.setString(1, consumidor.getCorreo());
        stmt.registerOutParameter(2, OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(2);
        if(set!=null){
            return set;
        }
        return null;
        
    }
    
    public boolean consumidorRegistrar(Consumidor consumidor) throws SQLException, ClassNotFoundException{
        String spRegistrarConsumidor = "{call SP_REGISTRAR_CONSUMIDOR(?,?,?,?,?,?,?,?)}";
        Connection con = BD.Conexion.getConnection();
        CallableStatement stmt = con.prepareCall(spRegistrarConsumidor);
        stmt.setInt(1, consumidor.getRut());
        stmt.setString(2, consumidor.getDv());
        stmt.setString(3, consumidor.getNombre());
        stmt.setString(4, consumidor.getApellidos());
        stmt.setString(5, consumidor.getCorreo());
        stmt.setString(6, consumidor.getContrasena());
        stmt.setInt(7, consumidor.getRecibirOferta());
        stmt.setInt(8, consumidor.getIsActivo());
        return stmt.execute();
    }
    
    public boolean consumidorVerificarExistenciaEmail(Consumidor consumidor) throws ClassNotFoundException, SQLException{
        String spCountEmail = "{call SP_COUNT_CONSUMIDOR_CORREO(?,?)}";
        Connection con = BD.Conexion.getConnection();
        CallableStatement stmt = con.prepareCall(spCountEmail);
        stmt.setString(1, consumidor.getCorreo());
        stmt.registerOutParameter(2, OracleTypes.CURSOR);
        stmt.execute();
        ResultSet setCount = (ResultSet)stmt.getObject(2);
        if(setCount != null){
            while(setCount.next()){
                if(setCount.getInt("CANTIDAD") == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
