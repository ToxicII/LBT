
package controller.secondaire;

import controller.Interface.ControleurInterface;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nicolas VEDRENNE
 */
public class NewCommandeView implements ControleurInterface{

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        return "newCommandeView";
    }
    
}
