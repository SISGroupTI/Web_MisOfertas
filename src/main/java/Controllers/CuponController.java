
package Controllers;

import Entity.Consumidor;
import Models.CuponModel;
import java.sql.SQLException;


public class CuponController {
    
    public String selectCuponesGeneradosPorConsumidor(int idConsumidor) throws ClassNotFoundException, SQLException{
        Entity.Consumidor consumidor = new Consumidor();
        consumidor.setIdConsumidor(idConsumidor);
        
        Models.CuponModel cuponModel = new CuponModel();
        String json = Helpers.JsonUtils.convertResultSetToJson(cuponModel.selectCuponesGeneradorPorConsumidor(consumidor));
        return json;
    }
    
}
