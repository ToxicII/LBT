
package controller.secondaire;

import controller.Interface.ControleurInterface;
import entities.Utilisateur;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessions.GestionUtilisateurLocal;

public class Connexion implements ControleurInterface{

    

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        
        GestionUtilisateurLocal gestionUtilisateur = lookupGestionUtilisateurLocal();
        
        String code = request.getParameter("id");
        Utilisateur u = gestionUtilisateur.getUtilisateur(code);
        
        if (u == null){
            request.setAttribute("message", "Le code saisi est incorrect!");            
        } else {
            request.setAttribute("message", "Bienvenue " + u.getPrenom()+ " " + u.getNom());
        }
        
        return "numPad";
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
