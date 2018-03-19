package sessions;

import entities.CategorieCarte;
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
public class GestionCategorieCarte implements GestionCategorieCarteLocal {

     @PersistenceContext(unitName = "LBTPU")
     private EntityManager em;
     
     @Override
    public List<CategorieCarte> getCategoCarte(){
        Query qr = em.createNamedQuery("entites.categorieCarte.selectAllCategorie");         
        List<CategorieCarte> lcc = qr.getResultList();
//        List<CategorieCarte> lcc = null;
        return lcc;
    }

}
    