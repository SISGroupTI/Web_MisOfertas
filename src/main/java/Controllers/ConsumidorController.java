
package Controllers;

import Entity.Consumidor;
import Models.ConsumidorModel;
import com.google.gson.Gson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import jdk.nashorn.internal.ir.ObjectNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;

/*

    Esta clase es el intermediario entre los servlets(peticiones del usuario) y modelo(peticiones y respuestas de la bd)
    Aca se instancian las clases si llega a ser necesario para enviar a los modelos
    
    Para efectos de retorno de consultas selects, el objeto que devuelve la clase modelo es de tipo resultset
    lo que en esta clase es transformada a un string json con los registros(filas) como un json y el indice respectivo,
    hay que considerar que las fechas deben ser tratadas desde la base de datos.

*/


public class ConsumidorController {
    
    public ConsumidorController(){
        
    }
    
    public Entity.Consumidor iniciarSesion(String correo, String password) throws ClassNotFoundException, SQLException{
        
        Consumidor consumidor = new Consumidor();
        consumidor.setCorreo(correo);
        consumidor.setContrasena(password);
        
        ConsumidorModel model = new ConsumidorModel();
        //SP INICIAR SESION
        ResultSet setConsumidor = model.consumidorIniciarSesion(consumidor);
        
        
        if(setConsumidor != null){
            Consumidor con = new Consumidor();
            while(setConsumidor.next()){
                con.setNombre(setConsumidor.getString("NOMBRE"));
                con.setApellidos(setConsumidor.getString("APELLIDOS"));
                con.setIdConsumidor(setConsumidor.getInt("ID_CONSUMIDOR"));
                con.setRut(setConsumidor.getInt("RUT"));
                con.setDv(setConsumidor.getString("DV"));
                con.setCorreo(setConsumidor.getString("CORREO"));
                con.setRecibirOferta((short) setConsumidor.getInt("RECIBIR_OFERTA"));
                con.setContrasena(setConsumidor.getString("CONTRASENA"));
            }
            if(Helpers.BCrypt.checkpw(password, con.getContrasena())){
                return con;
            }else{
                return null;
            } 
        }
        return null;
    }
    
   
    
    public void registrarCuenta(int rut, String dv, String nombre, String apellido, String correo, String contrasena, int recibeOferta) throws SQLException, ClassNotFoundException{
        
        Consumidor consumidor = new Consumidor();
        consumidor.setRut(rut);
        consumidor.setDv(dv);
        consumidor.setNombre(nombre);
        consumidor.setApellidos(apellido);
        consumidor.setCorreo(correo);
        consumidor.setContrasena(contrasena);
        consumidor.setRecibirOferta((short) recibeOferta);
        
        ConsumidorModel model = new ConsumidorModel();
        model.consumidorRegistrar(consumidor);
        
    }
    
    public boolean verificarCorreo(String correo) throws ClassNotFoundException, SQLException{
        Consumidor consumidor = new Consumidor();
        consumidor.setCorreo(correo);
        
        ConsumidorModel model = new ConsumidorModel();
        return model.consumidorVerificarExistenciaEmail(consumidor);
    }
    
    public String selectConsumidorId(int idConsumidor) throws ClassNotFoundException, SQLException
    {
        Consumidor consumidor = new Consumidor();
        consumidor.setIdConsumidor(idConsumidor);
        ConsumidorModel model = new ConsumidorModel();
        String json = Helpers.JsonUtils.convertResultSetToJson(model.selectConsumidorId(consumidor));
        return json;
    }
    public Boolean modificarConsumidor(int idConsumidor,String nombre,String apellido,String password,int recibirOferta) throws ClassNotFoundException, SQLException
    {
        Consumidor consumidor = new Consumidor();
        consumidor.setIdConsumidor(idConsumidor);
        consumidor.setApellidos(apellido);
        consumidor.setNombre(nombre);
        consumidor.setContrasena(password);
        consumidor.setRecibirOferta((short) recibirOferta);
        ConsumidorModel model = new ConsumidorModel();
        return model.consumidorModificar(consumidor);
    }
    
}
