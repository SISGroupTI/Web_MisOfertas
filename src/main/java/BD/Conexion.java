
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    private static String server;
    private static  int port;
    private static String version;
    private static String usuario;
    private static String password;

    
    private static Connection conn = null;
    
    public Conexion(){
        
    }
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("oracle.jdbc.OracleDriver");
        if(conn == null){
            server = "localhost";
            port = 1521;
            version = "XE";
            usuario = "misofertas";
            password = "root";
            
            String bd = "jdbc:oracle:thin:@"+server+":"+port+":"+version;
            conn = DriverManager.getConnection(bd, usuario, password);
        }
        return conn;
    }
    
    public static void CerrarBD() throws SQLException{
        conn.close();
    }
    
}
