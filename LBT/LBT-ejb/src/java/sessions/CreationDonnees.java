// G@P

package sessions;

import entities.LigneCommande;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class CreationDonnees implements CreationDonneesLocal {
    
    @PersistenceContext(unitName = "LBTPU")
    private EntityManager em;

    @Override
    public void creerDonnees() {
         
        LigneCommande lc01 = new LigneCommande(1, 10, 5.5f);
        LigneCommande lc02 = new LigneCommande(2, 15, 5.5f);
        LigneCommande lc03 = new LigneCommande(1, 20, 18.6f);
        LigneCommande lc04 = new LigneCommande(2, 25, 18.6f);
                
        em.persist(lc01);
        em.persist(lc02);
        em.persist(lc03);
        em.persist(lc04);
        
        
    }
    
    

    
}
