package sessions;

import entities.Emplacement;
import javax.ejb.Stateless;

/**
 *
 * @author Manuel_R_cdi113
 */
@Stateless
public class GestionEmplacement implements GestionEmplacementLocal {
    @Override
    public void attribuerTable(Emplacement table){
        //  Méthode pour affecter à une session 
        //  "tabletteCommandeClient" la table choisie
            //  
        
    }
    
    @Override
    public void fusionnerTable(Emplacement table){
        //  Méthode pour fusionner la commande d'une table à 
        //  la session "tabletteCommandeClient" sur table existante
            //  1°)trouver commande non réglée sur table choisie
            //  2°)for each LdC sur commande récuppérer ==> insert 
            //  into commande table si commande existante else dépôt direct
        
    }
    
    public void jeuxEssaiTable(){
        
    }
}
