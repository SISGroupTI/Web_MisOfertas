
package Controllers;
import Entity.Consumidor;
import Models.RubroModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RubroController {
    
    public String selectRubrosCantOfertas() throws ClassNotFoundException, SQLException{
        RubroModel modelRubro = new RubroModel();
        ResultSet setRubros = modelRubro.selectRubrosCantOfertas();
        return Helpers.JsonUtils.convertResultSetToJson(setRubros);
    }
    public String selectRubrosDestacadoGeneral() throws ClassNotFoundException, SQLException{
        RubroModel modelRubro = new RubroModel();
        ResultSet setRubros = modelRubro.selectRubrosDestacadoGeneral();
        return Helpers.JsonUtils.convertResultSetToJson(setRubros);
    }
    public String selectRubrosDestacadoConsumidor(int idConsumidor) throws ClassNotFoundException, SQLException{
        Consumidor consumidor = new Consumidor();
        consumidor.setIdConsumidor(idConsumidor);
        RubroModel modelRubro = new RubroModel();
        ResultSet setRubros = modelRubro.selectRubrosDestacadoConsumidor(consumidor);
        return Helpers.JsonUtils.convertResultSetToJson(setRubros);
    }
}
