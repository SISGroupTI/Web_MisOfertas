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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Seba
 */
public class RegisterConsumidorServlet extends HttpServlet {

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
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String correo = request.getParameter("correo");
            //Clase Helper.BCrypyt que permite generar el cifrado de la contraseña
            //Helpers.BCrypt.hashpw("<contraseñaNoCifrada>", Helpers.BCrypt.gensalt());
            String contrasena = Helpers.BCrypt.hashpw(request.getParameter("contrasena"), Helpers.BCrypt.gensalt());
            int recibeOferta = Integer.parseInt(request.getParameter("recibeOferta"));
            int rut = Integer.parseInt(request.getParameter("run"));
            String dv = request.getParameter("dv");
            
            
            Controllers.ConsumidorController consumidorController = new ConsumidorController();
            consumidorController.registrarCuenta(rut, dv, nombre, apellido, correo, contrasena, recibeOferta);
            
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            //Falta verificacion
            response.getWriter().write("hola");
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterConsumidorServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
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
