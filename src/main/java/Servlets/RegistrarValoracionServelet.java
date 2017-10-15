/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controllers.ValoracionController;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Ian Cardenas
 */
@MultipartConfig
@WebServlet(name = "RegistrarValoracionServelet", urlPatterns = {"/RegistrarValoracionServelet"})
public class RegistrarValoracionServelet extends HttpServlet {

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
            throws ServletException, IOException {
        Part file = request.getPart("file");
        int idOferta = Integer.parseInt(request.getParameter("idOferta"));
        int idConsumidor = Integer.parseInt(request.getParameter("idConsumidor"));
        int idPuntuacion = Integer.parseInt(request.getParameter("idPuntuacion"));
        String filename = getFilename(file);
        String ruta = "";
        InputStream filecontent = file.getInputStream();
        try {
            // retrieve image
            BufferedImage imBuff = ImageIO.read(filecontent);
            File outputfile = new File("D:\\MisOfertas\\boletas\\"+filename);
            ruta = outputfile.getPath();
            outputfile.getParentFile().mkdirs();
            ImageIO.write(imBuff, "jpeg", outputfile);
            Controllers.ValoracionController valoracionController = new ValoracionController();
            valoracionController.RegistrarValoracionOferta(idConsumidor, idOferta, idPuntuacion, ruta);
            
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("File " + filename + " successfully uploaded");
        } catch (SQLException | ClassNotFoundException |IOException e) {
            Logger.getLogger(RegistrarValoracionServelet.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    private static String getFilename(Part part) {
        for (String cd : part.getHeader("content-disposition").split(";")) {
            if (cd.trim().startsWith("filename")) {
                String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
                return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf('\\') + 1); // MSIE fix.
            }
        }
        return null;
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
        processRequest(request, response);
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
        processRequest(request, response);
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
