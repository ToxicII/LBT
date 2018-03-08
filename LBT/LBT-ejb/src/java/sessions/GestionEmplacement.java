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
    public void attribuerTable(Emplacement table) {
        //  Méthode pour affecter à une session 
        //  "tabletteCommandeClient" la table choisie
        //  

    }

    @Override
    public void fusionnerTable(Emplacement table) {
        //  Méthode pour fusionner la commande d'une table à 
        //  la session "tabletteCommandeClient" sur table existante
        //  1°)trouver commande non réglée sur table choisie
        //  2°)for each LdC sur commande récuppérer ==> insert 
        //  into commande table si commande existante else dépôt direct

    }

    public void jeuxEssaiTable() {
        Emplacement e01 = new Emplacement(1L, "salle01");
        Emplacement e02 = new Emplacement(2L, "salle01");
        Emplacement e03 = new Emplacement(3L, "salle01");
        Emplacement e04 = new Emplacement(4L, "salle01");
        Emplacement e05 = new Emplacement(5L, "salle01");
        Emplacement e06 = new Emplacement(6L, "salle01");
        Emplacement e07 = new Emplacement(7L, "salle02");
        Emplacement e08 = new Emplacement(8L, "salle02");
        Emplacement e09 = new Emplacement(9L, "salle02");
        Emplacement e10 = new Emplacement(10L, "salle02");
        Emplacement e11 = new Emplacement(11L, "salle02");
        Emplacement e12 = new Emplacement(12L, "salle02");
        Emplacement e13 = new Emplacement(13L, "salle02");
        Emplacement e14 = new Emplacement(14L, "salle02");
        Emplacement e15 = new Emplacement(15L, "salle02");
        Emplacement e16 = new Emplacement(16L, "salle03");
        Emplacement e17 = new Emplacement(17L, "salle03");
        Emplacement e18 = new Emplacement(18L, "salle03");
        Emplacement e19 = new Emplacement(19L, "salle03");
        Emplacement e20 = new Emplacement(20L, "salle03");
        Emplacement e21 = new Emplacement(21L, "salle03");
        Emplacement e22 = new Emplacement(22L, "salle03");
    }
}
