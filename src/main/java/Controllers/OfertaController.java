
package Controllers;
import Entity.Oferta;
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
    
    
}
