/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Formule;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author CDI118
 */
@Local
public interface GestionFormuleLocal {

     public List<Formule> getFormulesEC();
     
}
