package controller.secondaire;

import controller.Interface.ControleurInterface;
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
import sessions.GestionProduitLocal;

/**
 *
 * @author Manuel_PCB
 */
public class AfficheContenu implements ControleurInterface, Serializable {

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("on passe bien par le controleur secondaire 'AfficheContenu'");
        GestionProduitLocal gestionProduit = lookupGestionProduitLocal();
        List<Produit> lp = gestionProduit.getAllProduits();    
        request.setAttribute("catalogue2", lp);
        String page = "Include/afficheCarte";
        return page;
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
