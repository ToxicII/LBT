
package controller.secondaire;

import controller.Interface.ControleurInterface;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Deconnexion implements ControleurInterface{

     @Override
     public String executer(HttpServletRequest request, HttpServletResponse response) {
          HttpSession session = request.getSession();
          session.removeAttribute("utilisateur");
          return "connexion";
     }
     
}
