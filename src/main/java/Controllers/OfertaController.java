
package Controllers;
import Entity.Consumidor;
import Entity.Oferta;
import Entity.Rubro;
import Models.OfertaModel;
import java.sql.ResultSet;
import java.sql.SQLException;


public class OfertaController {
    
    public String selectOfertas() throws ClassNotFoundException, SQLException{
        OfertaModel modelOferta = new OfertaModel();
        ResultSet setOfertas = modelOferta.selectOfertas();
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
}
