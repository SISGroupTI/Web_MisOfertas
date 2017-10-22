
package Controllers;

import Entity.Consumidor;

import java.sql.SQLException;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.barcodes.BarcodeEAN;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.geom.AffineTransform;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.xobject.PdfFormXObject;
import com.itextpdf.layout.property.TextAlignment;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesterController  {
    
    /*public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception{
        Date dNow = new Date( );
        SimpleDateFormat ft = 
        new SimpleDateFormat ("yyyyMMddhhmmss");
        String ruta ="D:\\MisOfertas\\descuentos\\descuento"+ft.format(dNow)+".pdf";
        File file = new File(ruta);
        file.getParentFile().mkdirs();
        new TesterController().manipulatePdf(ruta);     
    }
    
    protected void manipulatePdf(String dest) throws Exception {
        Date dNow = new Date();
        
        
        
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
        Document doc = new Document(pdfDoc);
        //--Titulo--//
        Cell title = new Cell(1, 10).add(new Paragraph("CUPON DE DESCUENTO"));
        title.setTextAlignment(TextAlignment.CENTER);
        title.setPadding(10);
        title.setBold();
        title.setFontSize(24);
        doc.add(title);
        //--Fin Titulo--//
        //--Imagen--//
        ImageData image = ImageDataFactory.create("D:\\Ian Cardenas\\Documentos\\Web MisOfertas\\src\\main\\webapp\\img\\logos\\rsz_misofertas-letras.png");
        Image imageModel = new Image(image);
        AffineTransform at = AffineTransform.getTranslateInstance(470, 750);
        at.concatenate(AffineTransform.getScaleInstance(imageModel.getImageScaledWidth(),
                imageModel.getImageScaledHeight()));
        PdfCanvas canvas = new PdfCanvas(pdfDoc.getFirstPage());
        float[] matrix = new float[6];
        at.getMatrix(matrix);
        canvas.addImage(image, matrix[0], matrix[1], matrix[2], matrix[3], matrix[4], matrix[5]);
        //--Fin Imagen--//
        
        
        int n = pdfDoc.getNumberOfPages();
        Table table = new Table(5);
        table.setMarginTop(20);
        table.setMarginBottom(0);
        // first row
        Cell cell = new Cell(1, 10).add(new Paragraph("DESCUENTO #000001"));
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
            table.addCell("2017/10/18");
            table.addCell("Alimentos");
            table.addCell("100");
            table.addCell("20%");
            table.addCell("15000");
        }
        
        Cell nombreLbl = new Cell(1, 10).add(new Paragraph("NOMBRE: "));
        nombreLbl.setTextAlignment(TextAlignment.LEFT);
        nombreLbl.setPaddingTop(20);
        nombreLbl.setBold();
        nombreLbl.setFontSize(12);
        
        Cell nombre = new Cell(1, 10).add(new Paragraph("Ian"));
        nombre.setTextAlignment(TextAlignment.LEFT);
        nombre.setPaddingTop(-20);
        nombre.setPaddingLeft(100);
        nombre.setFontSize(12);
        
        Cell apellidoLbl = new Cell(1, 10).add(new Paragraph("APELLIDO: "));
        apellidoLbl.setTextAlignment(TextAlignment.LEFT);
        apellidoLbl.setPaddingTop(10);
        apellidoLbl.setBold();
        apellidoLbl.setFontSize(12);
        
        Cell apellido = new Cell(1, 10).add(new Paragraph("Cardenas"));
        apellido.setTextAlignment(TextAlignment.LEFT);
        apellido.setPaddingTop(-20);
        apellido.setPaddingLeft(100);
        apellido.setFontSize(12);
        
        Cell rutLbl = new Cell(1, 10).add(new Paragraph("RUT: "));
        rutLbl.setTextAlignment(TextAlignment.LEFT);
        rutLbl.setPaddingTop(10);
        rutLbl.setBold();
        rutLbl.setFontSize(12);
        
        Cell rut = new Cell(1, 10).add(new Paragraph("19.228.662-k"));
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
        
        Cell condiciones = new Cell(1, 10).add(new Paragraph("Estas son las condiciones del descuento"));
        condiciones.setTextAlignment(TextAlignment.LEFT);
        condiciones.setPaddingTop(10);
        //condiciones.setPaddingLeft(100);
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
    }*/
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        CuponController con = new CuponController();
        String aux = con.selectCuponVigente(5);
        if(!aux.equals("[]")){
            System.out.println("valido");
        }else{
            System.out.println("no valido");
        }         
    }
}
