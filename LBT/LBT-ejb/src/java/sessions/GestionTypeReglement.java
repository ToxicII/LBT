// G@P
package sessions;

import entities.TypeReglement;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GestionTypeReglement implements GestionTypeReglementLocal {

    @PersistenceContext(unitName = "LBTPU")
    private EntityManager em;

    @Override
    public List<TypeReglement> getAllType() {
        Query qr = em.createNamedQuery("entites.TypeReglement.paiement");
        List<TypeReglement> ltr = qr.getResultList();
        return ltr;
    }

    @Override
    public TypeReglement getTypeReglementById(String type) {
        TypeReglement tr = em.find(TypeReglement.class, type);
        return tr;
    }

}
