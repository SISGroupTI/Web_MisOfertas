
package Controllers;
import Entity.Consumidor;
import Entity.Oferta;
import Entity.OfertaBI;
import Entity.OfertaCorreo;
import Entity.Rubro;
import Entity.Valoracion;
import Models.OfertaModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class OfertaController {
    
    public String selectOfertas() throws ClassNotFoundException, SQLException{
        OfertaModel modelOferta = new OfertaModel();
        ResultSet setOfertas = modelOferta.selectOfertas();
        String json = Helpers.JsonUtils.convertResultSetToJson(setOfertas);
        return json;
    }
    public String selectOfertasConsumidor(int idConsumidor) throws ClassNotFoundException, SQLException{
        Consumidor consumidor = new Consumidor();
        consumidor.setIdConsumidor(idConsumidor);
        
        OfertaModel modelOferta = new OfertaModel();
        ResultSet setOfertas = modelOferta.selectOfertasConsumidor(consumidor);
        String json = Helpers.JsonUtils.convertResultSetToJson(setOfertas);
        return json;
    }
    public String selectOfertaPorId(Long idOferta) throws ClassNotFoundException, SQLException{
        Entity.Oferta oferta = new Oferta();
        oferta.setIdOferta(idOferta);
        OfertaModel modelOferta = new OfertaModel();
        ResultSet setOfertas = modelOferta.selectOfertaPorId(oferta);
        String json = Helpers.JsonUtils.convertResultSetToJson(setOfertas);
        return json;
    }
    public String selectOfertaPorRubro(Long idRubro) throws ClassNotFoundException, SQLException
    {
        Entity.Rubro rubro = new Rubro();
        rubro.setIdRubro(idRubro);
        OfertaModel modelOferta = new OfertaModel();
        ResultSet serOfertas = modelOferta.selectOfertaPorRubro(rubro);
        String json = Helpers.JsonUtils.convertResultSetToJson(serOfertas);
        return json;
    }
    public String selectOfertaDestacada(int idConsumidor) throws ClassNotFoundException, SQLException
    {
        Consumidor consumidor = new Consumidor();
        consumidor.setIdConsumidor(idConsumidor);
        OfertaModel modelOferta = new OfertaModel();
        ResultSet serOfertas = modelOferta.selectOfertaDestacada(consumidor);
        String json = Helpers.JsonUtils.convertResultSetToJson(serOfertas);
        return json;
    }
    public String selectImagenesOferta(Long idOferta) throws ClassNotFoundException, SQLException
    {
        Entity.Oferta oferta = new Oferta();
        oferta.setIdOferta(idOferta);
        OfertaModel modelOferta = new OfertaModel();
        ResultSet setOfertas = modelOferta.selectImagenOferta(oferta);
        String json = Helpers.JsonUtils.convertResultSetToJson(setOfertas);
        return json;
    }
    public String selectOfertaDestacadaGeneral() throws ClassNotFoundException, SQLException
    {
        OfertaModel modelOferta = new OfertaModel();
        ResultSet serOfertas = modelOferta.selectOfertaDestacadaGeneral();
        String json = Helpers.JsonUtils.convertResultSetToJson(serOfertas);
        return json;
    }
    public String selectOfertaDestacadaRubroCons(int idRubro,int idConsumidor) throws ClassNotFoundException, SQLException
    {
        Rubro rubro = new Rubro();
        rubro.setIdRubro(idRubro);
        Oferta oferta = new Oferta();
        oferta.setRubro(rubro);
        Consumidor consumidor = new Consumidor();
        consumidor.setIdConsumidor(idConsumidor);
        OfertaModel modelOferta = new OfertaModel();
        ResultSet serOfertas = modelOferta.selectOfertaDestacadaRubroCons(oferta, consumidor);
        String json = Helpers.JsonUtils.convertResultSetToJson(serOfertas);
        return json;
    }
    public String selectOfertaDestacadaRubroGen(int idRubro) throws ClassNotFoundException, SQLException
    {
        Rubro rubro = new Rubro();
        rubro.setIdRubro(idRubro);
        Oferta oferta = new Oferta();
        oferta.setRubro(rubro);
        OfertaModel modelOferta = new OfertaModel();
        ResultSet serOfertas = modelOferta.selectOfertaDestacadaRubroGen(oferta);
        String json = Helpers.JsonUtils.convertResultSetToJson(serOfertas);
        return json;
    }
    public String selectOfertasRubroValoracionConsu(int idRubro,int idValoracion, int idConsumidor) throws ClassNotFoundException, SQLException
    {
        Rubro rubro = new Rubro();
        rubro.setIdRubro(idRubro);
        Entity.Valoracion valoracion = new Entity.Valoracion();
        valoracion.setIdValoracion(idValoracion);
        Consumidor consumidor = new Consumidor();
        consumidor.setIdConsumidor(idConsumidor);
        
        OfertaModel modelOferta = new OfertaModel();
        ResultSet serOfertas = modelOferta.selectOfertasRubroValoracionConsu(valoracion,rubro,consumidor);
        String json = Helpers.JsonUtils.convertResultSetToJson(serOfertas);
        return json;
    }
    public String selectOfertasRubroValoracionGen(int idRubro,int idValoracion) throws ClassNotFoundException, SQLException
    {
        Rubro rubro = new Rubro();
        rubro.setIdRubro(idRubro);
        Entity.Valoracion valoracion = new Entity.Valoracion();
        valoracion.setIdValoracion(idValoracion);;
        
        OfertaModel modelOferta = new OfertaModel();
        ResultSet serOfertas = modelOferta.selectOfertasRubroValoracionGen(valoracion,rubro);
        String json = Helpers.JsonUtils.convertResultSetToJson(serOfertas);
        return json;
    }
    public List<OfertaCorreo> selectOfertasPorEnviarCorreo() throws ClassNotFoundException, SQLException{
        OfertaModel modelOferta = new OfertaModel();
        List<OfertaCorreo> listaOfertas = modelOferta.selectOfertasPorEnviarCorreo();
        return listaOfertas;
       
    } 
    
    public List<OfertaBI> selectOfertasBI() throws ClassNotFoundException, SQLException{
        OfertaModel modelOferta = new OfertaModel();
        List<OfertaBI> listaOfertas = modelOferta.selectOfertasBI();
        return listaOfertas;
    }
    
    public ResultSet selectResultSetOfertasBI() throws ClassNotFoundException, SQLException{
        OfertaModel modelOferta = new OfertaModel();
        ResultSet set = modelOferta.selectResultSetOfertasBI();
        return set;
    }
    
}
