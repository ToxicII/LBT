package controller.secondaire;

import controller.Interface.ControleurInterface;
import entities.CategorieCarte;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessions.GestionProduitLocal;

public class MenuBar implements ControleurInterface {

     @Override
     public String executer(HttpServletRequest request, HttpServletResponse response) {
          GestionProduitLocal gestionProduit = lookupGestionProduitLocal();
          List<CategorieCarte> lcc = gestionProduit.getCategorieCartesEC();
          request.setAttribute("categorieCartes", lcc);
          return "menuBar";
     }

     private GestionProduitLocal lookupGestionProduitLocal() {
          try {
               Context c = new InitialContext();
               return (GestionProduitLocal) c.lookup("java:global/LBT/LBT-ejb/GestionProduit!sessions.GestionProduitLocal");
          } catch (NamingException ne) {
               Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
               throw new RuntimeException(ne);
          }
     }

}
