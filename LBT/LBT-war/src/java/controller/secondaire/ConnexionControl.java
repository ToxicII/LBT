
package controller.secondaire;

import controller.Interface.ControleurInterface;
import entities.Utilisateur;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessions.GestionUtilisateurLocal;

public class ConnexionControl implements ControleurInterface{   

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        
        GestionUtilisateurLocal gestionUtilisateur = lookupGestionUtilisateurLocal();
        HttpSession session = request.getSession();
        Utilisateur utilisateur = (Utilisateur) session.getAttribute("utilisateur"); 
        
        if(utilisateur == null){
            return "connexion";
        } 
        
        List<Long> dList = gestionUtilisateur.getTypeDroits(utilisateur);
        
        if (dList.contains(9L)){
            return "serverView";
        } else if (dList.contains(8L)){
            return "#####"; // page cuisine
        } else if (dList.contains(7L)){
            return "#####"; // page caissier
        }
                          
        return "connexion";
    }

    private GestionUtilisateurLocal lookupGestionUtilisateurLocal() {
        try {
            Context c = new InitialContext();
            return (GestionUtilisateurLocal) c.lookup("java:global/LBT/LBT-ejb/GestionUtilisateur!sessions.GestionUtilisateurLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
    
    
}
