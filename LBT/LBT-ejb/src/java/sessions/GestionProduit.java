package sessions;

import entities.CategorieCarte;
import entities.Produit;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manuel_R. cdi113
 */
@Stateless
public class GestionProduit implements GestionProduitLocal {

     @PersistenceContext(unitName = "LBTPU")
     private EntityManager em;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    /**
     * 
     * @return [Produit]
     */
    @Override
    public List<Produit> getAllProduits(){
        Query qr = em.createNamedQuery("entites.produit.selectAll");
        List<Produit> lp = qr.getResultList();
        return lp;
    }
    
    /**
     * 
     * @param reference
     * @return Produit 
     */
    public Produit getProduitById(String reference){
        Query qr = em.createNamedQuery("entites.produit.selectByRef");
        qr.setParameter("paramRef", reference);
        
        Produit p = (Produit) qr.getSingleResult();
        return p;
    }
    
    /**
     *
     * @param categorieCarte
     * @return
     */
     @Override
    public List<Produit> getCategorieProduits(String categorieCarte){
        List<Produit> lp;
        Query qr = em.createNamedQuery("entites.produit.selectByCategorie");
        qr.setParameter("paramCateCarte", categorieCarte);
        lp = qr.getResultList();
        return lp;
    }
    
     @Override
    public List<CategorieCarte> getCategorieCartesEC(){
         Query qr = em.createNamedQuery("entities.CategorieCarte.selectByCurrentCarte");         
         List<CategorieCarte> lcc = qr.getResultList();
         return lcc;
    }

}
