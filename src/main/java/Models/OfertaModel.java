
package Models;

import Entity.Consumidor;
import Entity.Oferta;
import Entity.Rubro;
import Entity.Valoracion;
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
    
    public ResultSet selectOfertaPorRubro(Rubro rubro) throws ClassNotFoundException, SQLException
    {
        Connection con = BD.Conexion.getConnection();
        String spSelectOfertaRubro = "{call SP_SELECT_OFERTA_POR_RUBRO(?,?)}";
        CallableStatement stmt = con.prepareCall(spSelectOfertaRubro);
        stmt.setInt(1, (int) rubro.getIdRubro());
        stmt.registerOutParameter(2,OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(2);
        if(set != null){
            return set;
        }
        return null;
    }
    
    public ResultSet selectOfertaDestacada(Consumidor consumidor) throws ClassNotFoundException, SQLException
    {
        Connection con = BD.Conexion.getConnection();
        String spSelectOfertaRubro = "{call SP_SELECT_OFERTA_DES_CONS(?,?)}";
        CallableStatement stmt = con.prepareCall(spSelectOfertaRubro);
        stmt.setInt(1, (int) consumidor.getIdConsumidor());
        stmt.registerOutParameter(2,OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(2);
        if(set != null){
            return set;
        }
        return null;
    }
    //SP_SELECT_IMG_OFERTA_POR_IDOFE
    public ResultSet selectImagenOferta(Oferta oferta)throws ClassNotFoundException, SQLException
    {
        Connection con = BD.Conexion.getConnection();
        String spSelectImgOferta = "{call SP_SELECT_IMG_OFERTA_POR_IDOFE(?,?)}";
        CallableStatement stmt = con.prepareCall(spSelectImgOferta);
        stmt.setInt(1, (int) oferta.getIdOferta());
        stmt.registerOutParameter(2,OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(2);
        if(set != null){
            return set;
        }
        return null;
    }
    
    public ResultSet selectOfertaDestacadaGeneral() throws ClassNotFoundException, SQLException
    {
        Connection con = BD.Conexion.getConnection();
        String spSelectOfertaRubro = "{call SP_SELECT_OFERTA_DESTACADA(?)}";
        CallableStatement stmt = con.prepareCall(spSelectOfertaRubro);
        stmt.registerOutParameter(1,OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(1);
        if(set != null){
            return set;
        }
        return null;
    }
    public ResultSet selectOfertaDestacadaRubroCons(Oferta oferta,Consumidor consumidor) throws ClassNotFoundException, SQLException
    {
        Connection con = BD.Conexion.getConnection();
        String spSelectOfertaRubro = "{call SP_SELECT_OFE_DES_RUB_CONS(?,?,?)}";
        CallableStatement stmt = con.prepareCall(spSelectOfertaRubro);
        stmt.setInt(1, (int) consumidor.getIdConsumidor());
        stmt.setInt(2, (int) oferta.getRubro().getIdRubro());
        stmt.registerOutParameter(3,OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(3);
        if(set != null){
            return set;
        }
        return null;
    }
    public ResultSet selectOfertaDestacadaRubroGen(Oferta oferta) throws ClassNotFoundException, SQLException
    {
        Connection con = BD.Conexion.getConnection();
        String spSelectOfertaRubro = "{call SP_SELECT_OFE_DES_RUB_GEN(?,?)}";
        CallableStatement stmt = con.prepareCall(spSelectOfertaRubro);
        stmt.setInt(1, (int) oferta.getRubro().getIdRubro());
        stmt.registerOutParameter(2,OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(2);
        if(set != null){
            return set;
        }
        return null;
    }
    public ResultSet selectOfertasRubroValoracionConsu(Valoracion valoracion,Rubro rubro, Consumidor consumidor)throws ClassNotFoundException, SQLException
    {
        Connection con = BD.Conexion.getConnection();
        String spSelectOfertaRubro = "{call SP_SELECT_OFT_RUB_VAL_CONS(?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(spSelectOfertaRubro);
        stmt.setInt(1, (int) valoracion.getIdValoracion());
        stmt.setInt(2, (int) rubro.getIdRubro());
        stmt.setInt(3, (int) consumidor.getIdConsumidor());
        stmt.registerOutParameter(4,OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(4);
        if(set != null){
            return set;
        }
        return null;
    }
    public ResultSet selectOfertasRubroValoracionGen(Valoracion valoracion,Rubro rubro)throws ClassNotFoundException, SQLException
    {
        Connection con = BD.Conexion.getConnection();
        String spSelectOfertaRubro = "{call SP_SELECT_OFT_RUB_VAL_GEN(?,?,?)}";
        CallableStatement stmt = con.prepareCall(spSelectOfertaRubro);
        stmt.setInt(1, (int) rubro.getIdRubro());
        stmt.setInt(2, (int) valoracion.getIdValoracion());
        stmt.registerOutParameter(3,OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(3);
        if(set != null){
            return set;
        }
        return null;
    }
    
}
