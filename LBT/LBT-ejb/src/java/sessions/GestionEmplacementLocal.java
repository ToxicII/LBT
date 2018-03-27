/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Emplacement;
import javax.ejb.Local;
import javax.persistence.NoResultException;

/**
 *
 * @author Manuel_R_cdi113
 */
@Local
public interface GestionEmplacementLocal {

    public void attribuerTable(Emplacement table);

    public void fusionnerTable(Emplacement table);  

    public Emplacement getEmplacementByNumero(String numero);
    
}
