
package Controllers;
import Models.RubroModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RubroController {
    
    public String selectRubrosCantOfertas() throws ClassNotFoundException, SQLException{
        RubroModel modelRubro = new RubroModel();
        ResultSet setRubros = modelRubro.selectRubrosCantOfertas();
        return Helpers.JsonUtils.convertResultSetToJson(setRubros);
    }
    
}
