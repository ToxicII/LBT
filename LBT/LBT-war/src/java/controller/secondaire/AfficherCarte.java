package controller.secondaire;

import controller.Interface.ControleurInterface;
import entities.CategorieCarte;
import entities.Produit;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessions.GestionCategorieCarteLocal;
import sessions.GestionProduitLocal;

/**
 *
 * @author Manuel_R_cdi113
 */
public class AfficherCarte implements ControleurInterface, Serializable {

     @Override
     public String executer(HttpServletRequest request, HttpServletResponse response) {
          GestionProduitLocal gestionProduit = lookupGestionProduitLocal();
          GestionCategorieCarteLocal gestionCategorieCarte = lookupCategorieCarteLocal();
          List<CategorieCarte> lcc = gestionCategorieCarte.getCategoCarte();
          request.setAttribute("categorie", lcc);
          List<Produit> lp = gestionProduit.getAllProduits();          
          request.setAttribute("catalogue", lp);
          return "creationDonnees";
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

     private GestionCategorieCarteLocal lookupCategorieCarteLocal() {
          try {
               Context c = new InitialContext();
               return (GestionCategorieCarteLocal) c.lookup("java:global/LBT/LBT-ejb/GestionCategorieCarte!sessions.GestionCategorieCarteLocal");
          } catch (NamingException ne) {
               Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
               throw new RuntimeException(ne);
          }
     }

}
