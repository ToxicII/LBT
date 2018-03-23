/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Commande;
import javax.ejb.Local;

/**
 *
 * @author Nicolas VEDRENNE
 */
@Local
public interface GestionCommandeLocal {

    public Commande createCommande();

    public void persist(Object object);

    public Commande addProduit(Commande commande, Long reference);

    public Commande createCommande2(int ref);
    
}
