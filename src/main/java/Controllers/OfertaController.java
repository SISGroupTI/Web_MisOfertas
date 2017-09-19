
package Controllers;
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
    
    
}
