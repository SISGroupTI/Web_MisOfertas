
package Tasks;

import Controllers.OfertaController;
import static Tasks.TestBI.convertToCsv;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class OfertasBIJob implements Job{

    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
        FileWriter writer = null;
        try {
            String fecha = new SimpleDateFormat("yyyyMMdd_HHmm").format(Calendar.getInstance().getTime());
            String csvFile = "D:/MisOfertas/BI/MisOfertasAutomatico"+fecha+".csv";
            writer = new FileWriter(csvFile);
            OfertaController controller = new OfertaController();
            ResultSet set = controller.selectResultSetOfertasBI();
            convertToCsv(set, csvFile);                
                            
            
        } catch (IOException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestBI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(TestBI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void convertToCsv(ResultSet rs, String nombreArchivo) throws SQLException, FileNotFoundException {
        PrintWriter csvWriter = new PrintWriter(new File(nombreArchivo)) ;
        ResultSetMetaData meta = rs.getMetaData() ; 
        int numberOfColumns = meta.getColumnCount() ; 
        String dataHeaders = "\"" + meta.getColumnName(1) + "\"" ; 
        for (int i = 2 ; i < numberOfColumns + 1 ; i ++ ) { 
                dataHeaders += ",\"" + meta.getColumnName(i).replaceAll("\"","\\\"") + "\"" ;
        }
        csvWriter.println(dataHeaders) ;
        while (rs.next()) {
            String row = "\"" + rs.getString(1).replaceAll("\"","\\\"") + "\""  ; 
            for (int i = 2 ; i < numberOfColumns + 1 ; i ++ ) {
                row += ",\"" + rs.getString(i).replaceAll("\"","\\\"") + "\"" ;
            }
        csvWriter.println(row) ;
        }
        csvWriter.close();
    }
}
