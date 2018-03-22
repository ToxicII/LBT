/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Utilisateur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Nicolas VEDRENNE
 */
@Local
public interface GestionUtilisateurLocal {

    public Utilisateur getUtilisateur(String code);

    public void persist(Object object);

    public List<Long> getTypeDroits(Utilisateur utilisateur);
    
}
