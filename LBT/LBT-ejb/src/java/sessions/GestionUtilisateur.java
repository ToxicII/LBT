package sessions;

import entities.Utilisateur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GestionUtilisateur implements GestionUtilisateurLocal {

    @PersistenceContext(unitName = "LBTPU")
    private EntityManager em;

    @Override
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public Utilisateur getUtilisateur(String code) {

        Query qr = em.createNamedQuery("entities.Utilisateur.selectByCode");
        qr.setParameter("code", code);

        try {
            Utilisateur u = (Utilisateur) qr.getSingleResult();
            return u;
        } catch (NoResultException e) {
            return null;
        }        
    }

}
