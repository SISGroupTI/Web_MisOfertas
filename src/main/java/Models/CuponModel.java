
package Models;

import Entity.Certificado;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import oracle.jdbc.internal.OracleTypes;



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
    public ResultSet selectCuponesGeneradorPorCupon(Entity.Certificado certificado) throws ClassNotFoundException, SQLException{
        String spSelectCupones = "{call SP_SELECT_CUPONESGEN_ID(?,?)}";
        Connection con = BD.Conexion.getConnection();
        CallableStatement stmt = con.prepareCall(spSelectCupones);
        stmt.setInt(1, (int)certificado.getIdCertificado());
        stmt.registerOutParameter(2, OracleTypes.CURSOR);
        stmt.execute();
        ResultSet setCupones = (ResultSet) stmt.getObject(2);
        if(setCupones!=null){
            return setCupones;
        }          
        return null;
    }
    public ResultSet selectCuponVigente(Entity.Consumidor consumidor) throws ClassNotFoundException, SQLException{
        Calendar cal = Calendar.getInstance();        
        
        String spSelectCupones = "{call SP_SELECT_CUPONESGEN_VIGENT(?,?)}";
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
    public boolean updateCuponGenerado(Certificado certificado) throws ClassNotFoundException, SQLException{
        String updateCupon = "call SP_UPDATE_CUPON_GENERADO(?,?)";
        Connection con = BD.Conexion.getConnection();
        CallableStatement stmt = con.prepareCall(updateCupon);
        stmt.setInt(1, (int)certificado.getIdCertificado());
        stmt.setInt(2, certificado.getIs_generado());
        stmt.execute();
        return (stmt.getUpdateCount()>0);
    }
    
    public ResultSet selectVerificarCuponGenerado(Certificado certificado) throws ClassNotFoundException, SQLException{
        String verificarCupon = "call SP_SELECT_VERIFICARCUPONGEN(?,?)";
        Connection con = BD.Conexion.getConnection();
        CallableStatement stmt = con.prepareCall(verificarCupon);
        stmt.setInt(1, (int)certificado.getIdCertificado());
        stmt.registerOutParameter(2, OracleTypes.CURSOR);
        stmt.execute();
        ResultSet setCupones = (ResultSet) stmt.getObject(2);
        if(setCupones!=null){
            return setCupones;
        }          
        return null;
    }
    
}
