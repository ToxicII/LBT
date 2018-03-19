/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.CategorieCarte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manuel_PCB
 */
@Local
public interface GestionCategorieCarteLocal {

    public List<CategorieCarte> getCategoCarte();
    
}
