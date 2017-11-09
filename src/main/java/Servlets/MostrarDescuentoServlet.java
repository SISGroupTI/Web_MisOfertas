/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controllers.CuponController;
import com.itextpdf.barcodes.BarcodeEAN;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.geom.AffineTransform;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.xobject.PdfFormXObject;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;



/**
 *
 * @author Ian Cardenas
 */
@WebServlet(name = "MostrarDescuentoServlet", urlPatterns = {"/MostrarDescuentoServlet"})
public class MostrarDescuentoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        //response.setContentType("application/pdf;charset=UTF-8");
        response.setContentType("application/text");
        /*response.setHeader("Expires", "0");
        response.setHeader("Cache-Control","must-revalidate, post-check=0, pre-check=0");
        response.setHeader("Accept-Ranges", "bytes");*/
            int idDescuento = Integer.parseInt(request.getParameter("idCertificado"));
            CuponController controller = new CuponController();
            String json;
            try {
                
                json = controller.setelectCuponPorId(idDescuento);
                if(json!=null)
                {
                   
                    json = json.replace("[","");
                    json = json.replace("]", "");
                    Date dNow = new Date( );
                    SimpleDateFormat ft = 
                    new SimpleDateFormat ("yyyyMMddhhmmss");
                    String home = System.getProperty("user.home");
                    String ruta =home+"\\Downloads\\MisOfertasDescuento"+ft.format(dNow)+".pdf";
                    response.setHeader("Content-Disposition","inline;filename=" + ruta);
                    File file = new File(ruta);
                    file.getParentFile().mkdirs();
                    Document doc = manipulatePdf(ruta,json);
                    controller.updateCuponGenerado(idDescuento, 1);
                    Desktop.getDesktop().open(new File(ruta));
                    response.getWriter().write( ruta );

                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CuponesGeneradosConsumidorServlet.class.getName()).log(Level.SEVERE, null, ex);
            } 
        
    }
    protected Document manipulatePdf(String dest,String data) throws Exception {
        Date dNow = new Date();
        
        SimpleDateFormat ft = 
        new SimpleDateFormat ("dd MMMM yyyy");
                
        JSONObject jSONObject = new JSONObject(data);
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
        Document doc = new Document(pdfDoc);
        Cell title = new Cell(1, 10).add(new Paragraph("CUPON DE DESCUENTO"));
        title.setTextAlignment(TextAlignment.CENTER);
        title.setPadding(10);
        title.setBold();
        title.setFontSize(24);
        doc.add(title);
        
        ClassLoader classLoader = MostrarDescuentoServlet.class.getClassLoader();
        
        ImageData image = ImageDataFactory.create(classLoader.getResource("MisOfertas-sinLetras.png").getPath());
        Image imageModel = new Image(image);
        AffineTransform at = AffineTransform.getTranslateInstance(470, 750);
        at.concatenate(AffineTransform.getScaleInstance(imageModel.getImageScaledWidth(),
                imageModel.getImageScaledHeight()));
        PdfCanvas canvas = new PdfCanvas(pdfDoc.getFirstPage());
        float[] matrix = new float[6];
        at.getMatrix(matrix);
        canvas.addImage(image, matrix[0], matrix[1], matrix[2], matrix[3], matrix[4], matrix[5]);
        int n = pdfDoc.getNumberOfPages();
        Table table = new Table(5);
        table.setMarginTop(20);
        table.setMarginBottom(0);
        Cell cell = new Cell(1, 10).add(new Paragraph("DESCUENTO # "+jSONObject.getInt("ID_CERTIFICADO")+""));
        cell.setTextAlignment(TextAlignment.LEFT);
        cell.setPadding(5);
        cell.setBackgroundColor(new DeviceRgb(140, 221, 8));
        table.addCell(cell);
        table.setSkipFirstHeader(true);
        table.addCell("EMISION");
        table.addCell("RUBROS");
        table.addCell("PUNTOS");
        table.addCell("DESCUENTO");
        table.addCell("TOPE");
        table.setSkipFirstHeader(true);
        for (int i = 0; i < 1; i++) {
            table.addCell(jSONObject.getString("FECHA_EMISION"));
            table.addCell(jSONObject.getString("RUBROS_DISPONIBLES"));
            table.addCell(""+jSONObject.getInt("PUNTOS"));
            table.addCell(jSONObject.getDouble("DESCUENTO")+"%");
            table.addCell("$"+jSONObject.getInt("TOPE"));
        }   
        Cell nombreLbl = new Cell(1, 10).add(new Paragraph("NOMBRE: "));
        nombreLbl.setTextAlignment(TextAlignment.LEFT);
        nombreLbl.setPaddingTop(20);
        nombreLbl.setBold();
        nombreLbl.setFontSize(12);        
        Cell nombre = new Cell(1, 10).add(new Paragraph(jSONObject.getString("NOMBRE")));
        nombre.setTextAlignment(TextAlignment.LEFT);
        nombre.setPaddingTop(-20);
        nombre.setPaddingLeft(100);
        nombre.setFontSize(12);        
        Cell apellidoLbl = new Cell(1, 10).add(new Paragraph("APELLIDO: "));
        apellidoLbl.setTextAlignment(TextAlignment.LEFT);
        apellidoLbl.setPaddingTop(10);
        apellidoLbl.setBold();
        apellidoLbl.setFontSize(12);        
        Cell apellido = new Cell(1, 10).add(new Paragraph(jSONObject.getString("APELLIDOS")));
        apellido.setTextAlignment(TextAlignment.LEFT);
        apellido.setPaddingTop(-20);
        apellido.setPaddingLeft(100);
        apellido.setFontSize(12);        
        Cell rutLbl = new Cell(1, 10).add(new Paragraph("RUT: "));
        rutLbl.setTextAlignment(TextAlignment.LEFT);
        rutLbl.setPaddingTop(10);
        rutLbl.setBold();
        rutLbl.setFontSize(12);       
        Cell rut = new Cell(1, 10).add(new Paragraph(jSONObject.getString("RUT")));
        rut.setTextAlignment(TextAlignment.LEFT);
        rut.setPaddingTop(-20);
        rut.setPaddingLeft(100);
        rut.setFontSize(12);       
        Cell condicionesLbl = new Cell(1, 10).add(new Paragraph("CONDICIONES"));
        condicionesLbl.setTextAlignment(TextAlignment.CENTER);
        condicionesLbl.setPaddingTop(20);
        condicionesLbl.setBold();
        condicionesLbl.setFontSize(12);
        condicionesLbl.setUnderline();       
        Cell condiciones = new Cell(1, 10).add(new Paragraph(jSONObject.getString("CONDICIONES")));
        condiciones.setTextAlignment(TextAlignment.LEFT);
        condiciones.setPaddingTop(10);
        condiciones.setFontSize(10);      
        Rectangle pagesize;
        for (int i = 1; i <= n; i++) {
            PdfCanvas over = new PdfCanvas(pdfDoc.getPage(i));
            pagesize = pdfDoc.getPage(i).getPageSize();
            float x = pagesize.getLeft() + 500;
            float y = pagesize.getTop() - 800;
            BarcodeEAN barcode = new BarcodeEAN(pdfDoc);
            barcode.setCodeType(BarcodeEAN.EAN8);
            String s = String.valueOf(i);
            s = "00000000".substring(s.length()) + s;
            barcode.setCode(s);
            PdfFormXObject barcodeXObject = barcode.createFormXObject(Color.BLACK, Color.BLACK, pdfDoc);
            over.addXObject(barcodeXObject, x, y);
            System.out.println(over.toString());
        }       
        Cell fechaEmidion = new Cell(1, 10).add(new Paragraph("Emision: "+ft.format(dNow)));
        fechaEmidion.setTextAlignment(TextAlignment.CENTER);
        fechaEmidion.setPaddingTop(5);
        condiciones.setFontSize(10);        
        doc.add(fechaEmidion);
        doc.add(nombreLbl);
        doc.add(nombre);
        doc.add(apellidoLbl);
        doc.add(apellido);
        doc.add(rutLbl);
        doc.add(rut);
        doc.add(table);
        doc.add(condicionesLbl);
        doc.add(condiciones);
        doc.close();
        return doc;
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(MostrarDescuentoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(MostrarDescuentoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
