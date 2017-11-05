
package Models;

import Entity.Consumidor;
import Entity.Oferta;
import Entity.OfertaCorreo;
import Entity.Rubro;
import Entity.Valoracion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    public List<OfertaCorreo> selectOfertasPorEnviarCorreo() throws ClassNotFoundException, SQLException, SQLException{
        Connection con = BD.Conexion.getConnection();
        String spSelectOferta = "{call SP_SELECT_OFERTAR_ENVIARCORREO(?)}";
        CallableStatement stmt = con.prepareCall(spSelectOferta);
        stmt.registerOutParameter(1,OracleTypes.CURSOR);
        stmt.execute();
        ResultSet set = (ResultSet)stmt.getObject(1);
        
    List<OfertaCorreo> lista = new ArrayList<>();
        OfertaCorreo ofertac;
        if(set != null){
            while(set.next()){
                ofertac = new OfertaCorreo();
                ofertac.setIdOferta(set.getInt(1));
                ofertac.setRubro(set.getString(2));
                ofertac.setDireccion(set.getString(3));
                ofertac.setEmpresa(set.getString(4));
                ofertac.setCodigoOferta(set.getInt(5));
                ofertac.setFechaCreacion(set.getString(6));
                ofertac.setFechaInicio(set.getString(7));
                ofertac.setFechaFinalizacion(set.getString(8));
                ofertac.setPrecio(set.getInt(9));
                ofertac.setTituloOferta(set.getString(10));
                ofertac.setIdDisponible(set.getInt(11));
                ofertac.setDescripcionOferta(set.getString(12));
                ofertac.setRutaImagenPrincipal(set.getString(13));
                ofertac.setCondiciones(set.getString(14));
                ofertac.setNombreConsumidor(set.getString(15));
                ofertac.setApellidoConsumidor(set.getString(16));
                ofertac.setCorreoConsumidor(set.getString(17));
                ofertac.setRecibirOferta(set.getInt(18));
                lista.add(ofertac);
            }
            return lista;
        }
        return null;
    }
}
