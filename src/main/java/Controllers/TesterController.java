
package Controllers;

import Entity.Consumidor;
import java.sql.SQLException;

public class TesterController {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        CuponController con = new CuponController();
        String aux = con.selectCuponesGeneradosPorConsumidor(2);
        if(aux != ""){
            System.out.println("valido");
        }else{
            System.out.println("no valido");
        }
       
                
    }
}
