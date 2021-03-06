/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsclient;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import javax.xml.bind.JAXBElement;
import service.*;

/**
 *
 * @author Jayraj Rathwa
 */
public class LoginController extends HttpServlet {

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
        
        int login = Integer.parseInt(request.getParameter("login"));
        
        if(login==0){
        String username = request.getParameter("username");
        String pass = request.getParameter("password");
        
        NewsService service = new NewsService();
        INewsService client = service.getBasicHttpBindingINewsService();
        //ObjectFactory obj = new ObjectFactory();
        //JAXBElement<String> name = obj.createLoginAuthorname(username);
        //JAXBElement<String> password = obj.createLoginAuthorname(pass);
        
        
        Author author = client.login(username, pass);
        if(author != null){
        Integer authorid = author.getAuthorId();
        HttpSession session = request.getSession();
        //session.setAttribute("author", author);
        session.setAttribute("authorid",authorid);
        response.sendRedirect("dashboard.jsp");
        }
        else{
            response.sendRedirect("login.jsp");
        }
        
        }
        else if(login==1){
            HttpSession session = request.getSession();
            Integer id = (Integer)session.getAttribute("authorid");
            if(id != null){
                session.setAttribute("authorid", null);
            }
            response.sendRedirect("index.jsp");
            
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
