package controller.secondaire;

import controller.Interface.ControleurInterface;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessions.CreationJeuTestLocal;

/**
 *
 * @author Manuel_R_cdi113
 */
public class CreerJeuTest implements ControleurInterface, Serializable {
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        try{
            CreationJeuTestLocal creationJeuTest = lookupGestioncatalogueLocal();
            creationJeuTest.jeuTest();
            request.setAttribute("message", "création ok");
          } catch (Exception ex) {
               request.setAttribute("message", "création pas ok<p>" + ex.getMessage() + "</p>");
          }
            return "accueil"; 
    }

    private CreationJeuTestLocal lookupGestioncatalogueLocal() {
        try {
            Context c = new InitialContext();
            return (CreationJeuTestLocal) c.lookup("java:global/LBT/LBT-ejb/CreationJeuTest!sessions.CreationJeuTestLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
