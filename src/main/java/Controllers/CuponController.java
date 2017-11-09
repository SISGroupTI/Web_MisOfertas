
package Controllers;

import Entity.Certificado;
import Entity.Consumidor;
import Models.CuponModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/*

    Esta clase es el intermediario entre los servlets(peticiones del usuario) y modelo(peticiones y respuestas de la bd)
    Aca se instancian las clases si llega a ser necesario para enviar a los modelos
    
    Para efectos de retorno de consultas selects, el objeto que devuelve la clase modelo es de tipo resultset
    lo que en esta clase es transformada a un string json con los registros(filas) como un json y el indice respectivo,
    hay que considerar que las fechas deben ser tratadas desde la base de datos.

*/


public class CuponController {
    
    public String selectCuponesGeneradosPorConsumidor(int idConsumidor) throws ClassNotFoundException, SQLException{
        /*
            Instanciacion clase consumidor
            En este caso se crea un objeto consumidor para consultar loos cupones generados anteriormente.
        */
        
        Entity.Consumidor consumidor = new Consumidor();
        consumidor.setIdConsumidor(idConsumidor);
        //Se envia el objeto al modelo CuponModel
        Models.CuponModel cuponModel = new CuponModel();
        /*
        el metodo cuponModel.selectCuponesGeneradorPorConsumidor(consumidor) retorna un objeto de tipo ResultSet de java
        lo que con la ayuda de la clase helper->jsonutils.convertResultSetToJson
        convierte el resultset a un string con la informacion de la consulta
        este string es retornado como resultado
        */
        String json = Helpers.JsonUtils.convertResultSetToJson(cuponModel.selectCuponesGeneradorPorConsumidor(consumidor));
        return json;
    }
    public String setelectCuponPorId(int idCertificado) throws ClassNotFoundException, SQLException
    {
        Certificado certificado = new Certificado();
        certificado.setIdCertificado(idCertificado);
        CuponModel cuponModel = new CuponModel();
        String json = Helpers.JsonUtils.convertResultSetToJson(cuponModel.selectCuponesGeneradorPorCupon(certificado));
        return json;
    }
    public String selectCuponVigente(int idConsumidor) throws ClassNotFoundException, SQLException
    {
        Entity.Consumidor consumidor = new Consumidor();
        consumidor.setIdConsumidor(idConsumidor);
        
        CuponModel cuponModel = new CuponModel();
        String json = Helpers.JsonUtils.convertResultSetToJson(cuponModel.selectCuponVigente(consumidor));
        return json;
    }
    
    public boolean updateCuponGenerado(int idCertificado, int isGenerado) throws ClassNotFoundException, SQLException{
        Certificado certificado = new Certificado();
        certificado.setIdCertificado((long)idCertificado);
        certificado.setIs_generado(isGenerado);
        CuponModel cuponModel = new CuponModel();
        return cuponModel.updateCuponGenerado(certificado);
    }
    
    public boolean selectVerificarCuponGenerado(int idCertificado) throws ClassNotFoundException, ClassNotFoundException, SQLException{
        Certificado certificado = new Certificado();
        certificado.setIdCertificado((long)idCertificado);
        CuponModel cuponModel = new CuponModel();
        ResultSet setCupon = cuponModel.selectVerificarCuponGenerado(certificado);
        if(setCupon!=null){
            while(setCupon.next()){
                if(setCupon.getInt(2)==1){
                    return true;
                }
            }
        }
        return false;
    }
}
