package controller.secondaire;

import controller.Interface.ControleurInterface;
import entities.CategorieCarte;
import entities.Formule;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessions.GestionFormuleLocal;
import sessions.GestionProduitLocal;

public class MenuBar implements ControleurInterface {
     

     @Override
     public String executer(HttpServletRequest request, HttpServletResponse response) {
          GestionProduitLocal gestionProduit = lookupGestionProduitLocal();
          GestionFormuleLocal gestionFormule = lookupGestionFormuleLocal();
          
          List<CategorieCarte> lcc = gestionProduit.getCategorieCartesEC();
          List<Formule> fList = gestionFormule.getFormulesEC();                              
          request.setAttribute("categorieCartes", lcc);    
          request.setAttribute("formules", fList);    
          System.out.println(lcc);
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

     private GestionFormuleLocal lookupGestionFormuleLocal() {
          try {
               Context c = new InitialContext();
               return (GestionFormuleLocal) c.lookup("java:global/LBT/LBT-ejb/GestionFormule!sessions.GestionFormuleLocal");
          } catch (NamingException ne) {
               Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
               throw new RuntimeException(ne);
          }
     }

}
