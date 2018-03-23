package controller.secondaire;

import controller.Interface.ControleurInterface;
import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manuel_PCB
 */
public class AfficheContenu implements ControleurInterface, Serializable {

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("on passe bien par le controleur secondaire 'AfficheContenu'");
        String page = "Include/afficheCarte";
        return page;
    }
    
}
