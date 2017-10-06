/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controllers.ConsumidorController;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONObject;

/**
 *
 * @author Seba
 */
public class LoginConsumidorServlet extends HttpServlet {

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
        /*
         este metodo processRequest, permite agilizar y ayudar con el trabajo de las peticiones post y get ajax que se realizan
        desde la plataforma, con el metodo request.getParameter("<nombreDelParametro>") se obtiene la informacion enviada
        a este servlet
        
        
        */
        
        try {
            String correo = request.getParameter("correo");
            String password = request.getParameter("password");
            Controllers.ConsumidorController consumidorController = new ConsumidorController();
            Entity.Consumidor consumidorLogin = consumidorController.iniciarSesion(correo, password);
            
            //Especificacion del contenido de la respuesta al invocar este servlet
            response.setContentType("text/plain");
            //Seteo de la codificacion de caracteres
            response.setCharacterEncoding("UTF-8");
            if(consumidorLogin == null){
                response.getWriter().write("error"); //escritura o respuesta que se envia
            }else{
                HttpSession session = request.getSession(); // Clase que maneja las sesiones
                /*
                    Se setean los atributos luego de realizar y validar el login del consumidor
                    donde se ejecuta en el controlador luego al modelo
                    
                session.setAtribute("<nombreAtributo>",dato);
                */
                session.setAttribute("sesionLogin", consumidorLogin); //
                session.setAttribute("SesionNombre", consumidorLogin.getNombre());
                session.setAttribute("idConsumidor", Long.toString(consumidorLogin.getIdConsumidor()));
                response.getWriter().write("success"); //Respuesta a la invocacion
            }
                  
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginConsumidorServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            response.getWriter().write("error");
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

