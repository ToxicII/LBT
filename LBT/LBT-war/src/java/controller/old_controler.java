/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.CategorieCarte;
import entities.Produit;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessions.CreationJeuTestLocal;
import sessions.GestionCategorieCarteLocal;
import sessions.GestionProduitLocal;

/**
 *
 * @author Manuel_PCB
 */
@WebServlet(name = "old_controler", urlPatterns = {"/old_controler"})
public class old_controler extends HttpServlet {                 
         
    @EJB
    private CreationJeuTestLocal creationJeuTest;
    @EJB
    private GestionProduitLocal gestionProduit;
    @EJB
    private GestionCategorieCarteLocal gestionCategorieCarte;
             
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String page = "/WEB-INF/accueil.jsp";
        String section = request.getParameter("section");
        HttpSession session = request.getSession();

        if("jeuTest".equals(section)){
          try{
               creationJeuTest.jeuTest();
               request.setAttribute("message", "création ok");
          } catch (Exception ex) {
               request.setAttribute("message", "création pas ok<p>" + ex.getMessage() + "</p>");
          }
            page = "/WEB-INF/accueil.jsp"; 
        }
        if("Catalogue".equals(section)){
            List<CategorieCarte> lcc = gestionCategorieCarte.getCategoCarte();
            request.setAttribute("categorie", lcc);
            List<Produit> lp = gestionProduit.getAllProduits();
            request.setAttribute("catalogue", lp);
            page="/WEB-INF/creationDonnees.jsp";
        }
        
        if("ParseCatalogue".equals(section)){
            List<CategorieCarte> lcc = gestionCategorieCarte.getCategoCarte();
            request.setAttribute("categorie", lcc);
            List<Produit> lp = gestionProduit.getCategorieProduits(request.getParameter("categCarte"));
            request.setAttribute("catalogue", lp);
            request.setAttribute("cateChoix", request.getParameter("categCarte"));
            page="/WEB-INF/creationDonnees.jsp";
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
