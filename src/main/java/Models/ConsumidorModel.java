
package Models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;
import Entity.Consumidor;


/*
    Clase Consumidor Modelo, la que contiene metodos para obtener y procesar informacion.
    Las Clases <nombre>Model son las que invocan a los procedimientos almacenados de la BD
    
    Para procesos de insert, update , delete o select se utiliza la misma metodologia, lo que varia es el 
    tipo de objeto o dato a retornar.
    Si es insert, update o delete se puede retornar un booleano con el estado de la ejecucion del procedimiento
    stmt.execute() retorna true o false.

*/


public class ConsumidorModel {
    public ConsumidorModel(){
        
    }
    
    public ResultSet consumidorIniciarSesion(Consumidor consumidor) throws ClassNotFoundException, SQLException{
        
        //* Instancia de la clase conexion - Singleton
        Connection con = BD.Conexion.getConnection();
        
        /*Creacion del string del procedimiento
            se debe llamar entre {}, seguido de un 'call' y el nombre del procedimiento
            La cantidad de parametros debe ser similar y 
            debe contener signos '?' sean la cantidad de parametros
        */
        String spInicioSesion = "{call SP_INICIO_SESION(?,?)}";
        
        //Preparacion del procedimiento como statement
        CallableStatement stmt = con.prepareCall(spInicioSesion);
        
        /*
        se comienza el seteo de los parametros, se inicia desde el 1 y así sucesivamente
        en caso de ser varchar en oracle, en java es String, si es number o integer en oracle en java sera solamente int
        para la especificacion de cursores como objetos de salida
        se utiliza la sentencia stmt.registerOutParameter(), especificando en los parametros el tipo cursor OracleTypes.CURSOR
        */
        stmt.setString(1, consumidor.getCorreo());
        stmt.registerOutParameter(2, OracleTypes.CURSOR);
        
        //Ejecucion del procedimiento
        stmt.execute();
        /*
            Se obtiene el objeto cursor y se castea a ResultSet
            este objeto contiene la o las filas retornadas del select
        */
        ResultSet set = (ResultSet)stmt.getObject(2); //(ResultSet)stmt.getObject(<posicion del parametro del cursor>)
        if(set!=null){
            return set;
        }
        return null;
        
    }
    
    public boolean consumidorRegistrar(Consumidor consumidor) throws SQLException, ClassNotFoundException{
        String spRegistrarConsumidor = "{call SP_REGISTRAR_CONSUMIDOR(?,?,?,?,?,?,?,?)}";
        Connection con = BD.Conexion.getConnection();
        CallableStatement stmt = con.prepareCall(spRegistrarConsumidor);
        stmt.setInt(1, consumidor.getRut());
        stmt.setString(2, consumidor.getDv());
        stmt.setString(3, consumidor.getNombre());
        stmt.setString(4, consumidor.getApellidos());
        stmt.setString(5, consumidor.getCorreo());
        stmt.setString(6, consumidor.getContrasena());
        stmt.setInt(7, consumidor.getRecibirOferta());
        stmt.setInt(8, consumidor.getIsActivo());
        return stmt.execute();
    }
    
    public boolean consumidorVerificarExistenciaEmail(Consumidor consumidor) throws ClassNotFoundException, SQLException{
        String spCountEmail = "{call SP_COUNT_CONSUMIDOR_CORREO(?,?)}";
        Connection con = BD.Conexion.getConnection();
        CallableStatement stmt = con.prepareCall(spCountEmail);
        stmt.setString(1, consumidor.getCorreo());
        stmt.registerOutParameter(2, OracleTypes.CURSOR);
        stmt.execute();
        ResultSet setCount = (ResultSet)stmt.getObject(2);
        if(setCount != null){
            while(setCount.next()){
                if(setCount.getInt("CANTIDAD") == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
