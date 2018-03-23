
package sessions;

import entities.Commande;
import entities.Emplacement;
import entities.LigneCommande;
import entities.Parametres;
import entities.Produit;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GestionCommande implements GestionCommandeLocal {

    @PersistenceContext(unitName = "LBTPU")
    private EntityManager em;

    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Commande createCommande(){
        
        Commande c = new Commande();
        Query q01 = em.createNamedQuery("entities.Parametres.selectById");
        q01.setParameter("id", 100);
        
        c.setParametre((Parametres)q01.getSingleResult());
        
        return c;
    }
    
    @Override
    public Commande createCommande(int ref){
        
        Commande c = new Commande();
        Query q01 = em.createNamedQuery("entities.Parametres.selectById");
        q01.setParameter("id", 100);
        c.setParametre((Parametres)q01.getSingleResult());
        
        Query q02 = em.createNamedQuery("entities.Emplacement.rechercheTableById");
        q02.setParameter("paramTable", ref);
        c.setEmplacement((Emplacement)q02.getSingleResult());
        return c;
    }
    
    @Override
    public Commande addProduit(Commande commande, Long reference) {
        
        Query q01 = em.createNamedQuery("entites.produit.selectByRef");
        q01.setParameter("paramref", reference);
        Produit p = (Produit) q01.getSingleResult();
        
        LigneCommande lc = new LigneCommande();
        lc.setProduit(p);
        
        return commande;
    }
}
