/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.MultipartConfig;
import javax.xml.bind.JAXBElement;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.io.IOUtils;
import service.*;

/**
 *
 * @author Jayraj Rathwa
 */
@MultipartConfig
public class NewsController extends HttpServlet {

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
      
           int edit = Integer.parseInt(request.getParameter("edit"));
           
            NewsService service = new NewsService();
            INewsService client = service.getBasicHttpBindingINewsService();
           
        if(edit != 2){
           String title = request.getParameter("title");
           String city = request.getParameter("city");
           String topic = request.getParameter("topic");
           String description = request.getParameter("description");
           String datestr = request.getParameter("time");
           
         
           
            Part imgfile = request.getPart("image");
            String imgname = imgfile.getSubmittedFileName();
            InputStream is = imgfile.getInputStream();
            byte[] img = IOUtils.toByteArray(is);
            
            
           News news = new News();
           ObjectFactory obj = new ObjectFactory();
           JAXBElement<String> xtitle = obj.createNewsTitle(title);
           news.setTitle(xtitle);
           JAXBElement<String> xcity = obj.createNewsNewsCity(city);
           news.setNewsCity(xcity);
           JAXBElement<String> xdes = obj.createNewsDescription(description);
           news.setDescription(xdes);
           JAXBElement<String> xtopic  = obj.createNewsTag(topic);
           news.setTag(xtopic);
           
           if(imgfile!=null){
           JAXBElement<byte[]> ximg = obj.createNewsImagedata(img);
           news.setImagedata(ximg);
           JAXBElement<String> ximgname = obj.createNewsImage(imgname);
           news.setImage(ximgname);
           }
           else{
               news.setImage(null);
               news.setImagedata(null);
           }
           
           try{
            SimpleDateFormat datef = new SimpleDateFormat("EEE, MMM dd , yyyy");
            Date date = datef.parse(datestr);
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(date);
            XMLGregorianCalendar xdate= DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            news.setDatetime(xdate);
           }
           catch(Exception e){
              
           }
          
          
           HttpSession session = request.getSession();
           Integer authId = (Integer)session.getAttribute("authorid");
          
           
          
           if(edit==0){
                Integer res = client.addNews(news, authId);
                if(res != null){
                    response.sendRedirect("news.jsp?id="+res.intValue());
                }
                else{
                    response.sendRedirect("addNews.jsp");
                }
           }else if(edit==1){
               Integer newsid =Integer.parseInt(request.getParameter("id"));
               news.setNewsId(newsid);
               
                News res = client.updateNews(news);
                if(res != null){
                    response.sendRedirect("news.jsp?id="+res.getNewsId().intValue());
                }
                else{
                    response.sendRedirect("updateNews.jsp?id="+newsid.intValue());
                }
               
           }
        }
        
        if(edit==2){
            Integer newsid =Integer.parseInt(request.getParameter("id"));
            client.removeNews(newsid);
            response.sendRedirect("dashboard.jsp");
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
