package sessions;

import entities.Emplacement;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manuel_R_cdi113
 */
@Stateless
public class GestionEmplacement implements GestionEmplacementLocal {

    @PersistenceContext(unitName = "LBTPU")
    private EntityManager em;

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

    @Override
    public Emplacement getEmplacementByNumero(String numero) {
        try {
            Long num = Long.valueOf(numero);
            Query qr = em.createNamedQuery("entities.Emplacement.selectByNumero");
            qr.setParameter("numero", num);

            Emplacement e = (Emplacement) qr.getSingleResult();
            return e;
        } catch (NoResultException | NumberFormatException e) {
            return null;
        }
    }

}
