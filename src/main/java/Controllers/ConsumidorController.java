
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
public class ConsumidorController {
    
    public ConsumidorController(){
        
    }
    
    public Entity.Consumidor iniciarSesion(String correo, String password) throws ClassNotFoundException, SQLException{
        
        Consumidor consumidor = new Consumidor();
        consumidor.setCorreo(correo);
        consumidor.setContrasena(password);
        
        ConsumidorModel model = new ConsumidorModel();
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
    
}
