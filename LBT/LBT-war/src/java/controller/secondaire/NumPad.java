
package controller.secondaire;

import controller.Interface.ControleurInterface;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NumPad implements ControleurInterface{

     @Override
     public String executer(HttpServletRequest request, HttpServletResponse response) {
          return "numPad";
     }
               
}
