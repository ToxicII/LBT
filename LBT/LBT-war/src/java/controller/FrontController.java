
package controller;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessions.CreationJeuTestLocal;

public class FrontController extends HttpServlet {
     
     @EJB
     private CreationJeuTestLocal creationJeuTest;
             
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
          response.setContentType("text/html;charset=UTF-8");
          request.setCharacterEncoding("UTF-8");
          String page = "/WEB-INF/accueil.jsp";
          String section = request.getParameter("section");
          HttpSession session = request.getSession();
          
          if("jeuTest".equals(section)){
               try{
                    creationJeuTest.test();
                    request.setAttribute("message", "création ok");
               } catch (Exception ex) {
                    ex.printStackTrace();
               }
               page = "/WEB-INF/accueil.jsp";
          }
          
          page = response.encodeURL(page);
          getServletContext().getRequestDispatcher(page).include(request, response);
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
