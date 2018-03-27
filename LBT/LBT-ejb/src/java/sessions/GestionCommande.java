
package sessions;

import entities.Commande;
import entities.Emplacement;
import entities.LigneCommande;
import entities.Parametres;
import entities.Produit;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GestionCommande implements GestionCommandeLocal {

    @PersistenceContext(unitName = "LBTPU")
    private EntityManager em;
    
    private static final int EC_PARAMETER = 100;

    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Commande createCommande(Emplacement emplacement){
        
        Commande c = new Commande();
        Query q01 = em.createNamedQuery("entities.Parametres.selectById");
        q01.setParameter("id", EC_PARAMETER);
        
        c.setParametre((Parametres)q01.getSingleResult());
        c.setEmplacement(emplacement);
        c.setDateCommande(new Date());
        
        persist(c);
        
        return c;
    }
    
    @Override
    public Commande addProduit(Commande commande, Long reference) {
        
        Query q01 = em.createNamedQuery("entities.Produit.selectByReference");
        q01.setParameter("reference", reference);
        Produit p = (Produit) q01.getSingleResult();
        
        LigneCommande lc = new LigneCommande();
        lc.setProduit(p);
        
        return commande;
    }
    
    @Override
    public Commande getCommandeById(Long id){
        Query qr = em.createNamedQuery("entities.Commande.selectById");
        qr.setParameter("id", id);
        return (Commande) qr.getSingleResult();
    }
    
    @Override
    public Commande getCommandeECByEmplacement(Long numero){
        Query qr = em.createNamedQuery("entities.Commande.selectByEmplacement");
        qr.setParameter("numero", numero);
        qr.setParameter("id", EC_PARAMETER);
        return (Commande) qr.getSingleResult();
    }
    
    @Override
    public List<Commande> getCommandesEC(){
        Query qr = em.createNamedQuery("entities.Commande.selectByParametre");
        qr.setParameter("id", EC_PARAMETER);
        return (List<Commande>) qr.getResultList();
    }
}
