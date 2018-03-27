package controller.secondaire;

import controller.Interface.ControleurInterface;
import entities.Commande;
import entities.Emplacement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessions.GestionCommandeLocal;
import sessions.GestionEmplacementLocal;

/**
 *
 * @author Nicolas VEDRENNE
 */
public class InitCommande implements ControleurInterface {

    

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {

        GestionEmplacementLocal gestionEmplacement = lookupGestionEmplacementLocal();
        GestionCommandeLocal gestionCommande = lookupGestionCommandeLocal();
        HttpSession session = request.getSession();
        String numero = request.getParameter("numero");
        String actor = request.getParameter("actor");

        if (numero == null || numero.isEmpty()) {
            request.setAttribute("message", "Veuillez saisir un numéro");
            return "newCommandeView";
        }
        
        Emplacement e = gestionEmplacement.getEmplacementByNumero(numero);
                
        if (e != null) {
            
            Commande commande = gestionCommande.createCommande(e);
            session.setAttribute("commande", commande); 
            
            if (actor != null) {
                
                session.setAttribute("emplacement", e);
                return "####"; //JSP CLIENT
            }

            return "commandeServeur";
        }
        
        request.setAttribute("message", "Le numéro de table n'existe pas");
        return "newCommandeView";

    }

    private GestionEmplacementLocal lookupGestionEmplacementLocal() {
        try {
            Context c = new InitialContext();
            return (GestionEmplacementLocal) c.lookup("java:global/LBT/LBT-ejb/GestionEmplacement!sessions.GestionEmplacementLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    private GestionCommandeLocal lookupGestionCommandeLocal() {
        try {
            Context c = new InitialContext();
            return (GestionCommandeLocal) c.lookup("java:global/LBT/LBT-ejb/GestionCommande!sessions.GestionCommandeLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
