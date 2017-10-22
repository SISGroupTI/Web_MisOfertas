/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controllers.ConsumidorController;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ian Cardenas
 */
@WebServlet(name = "ModificarConsumidorServlet", urlPatterns = {"/ModificarConsumidorServlet"})
public class ModificarConsumidorServlet extends HttpServlet {

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
        try {
            /*
                Se obtienen los datos necesarios para la creacion de la cuenta
                nombre,apellidos,correo,contraseña,recibeOferta,rut,dv
            */
            String idConsumidor = request.getParameter("idConsumidor");
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String password = request.getParameter("contrasena");
            if (!password.equals(""))
            {
                password = Helpers.BCrypt.hashpw(password,Helpers.BCrypt.gensalt());
            }else{password=null;}
            
            int recibeOferta = Integer.parseInt(request.getParameter("recibeOferta"));
            Controllers.ConsumidorController consumidorController = new ConsumidorController();
            consumidorController.modificarConsumidor(Integer.parseInt(idConsumidor),nombre,apellido,password,recibeOferta);
            
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            //Falta verificacion
            response.getWriter().write("hola");
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RegisterConsumidorServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
