/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Commande;
import entities.Emplacement;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Nicolas VEDRENNE
 */
@Local
public interface GestionCommandeLocal {

    public Commande createCommande(Emplacement emplacement);

    public void persist(Object object);

    public Commande addProduit(Commande commande, Long reference);

    public Commande getCommandeById(Long id);

    public Commande getCommandeECByEmplacement(Long numero);

    public List<Commande> getCommandesEC();
    
}
