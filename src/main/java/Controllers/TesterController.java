
package Controllers;

import Entity.Consumidor;
import java.sql.SQLException;

public class TesterController {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
       OfertaController oferta = new OfertaController();
       String test = oferta.selectOfertas();
       System.out.println(test);
                
    }
}
