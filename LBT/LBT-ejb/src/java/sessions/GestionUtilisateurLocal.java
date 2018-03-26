/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Utilisateur;
import java.sql.SQLException;
import java.util.List;
import javax.ejb.Local;
import javax.persistence.NoResultException;

/**
 *
 * @author Nicolas VEDRENNE
 */
@Local
public interface GestionUtilisateurLocal {

    public Utilisateur getUtilisateur(String code) throws NoResultException;

    public void persist(Object object);

    public List<Long> getTypeDroits(Utilisateur utilisateur);
    
}
