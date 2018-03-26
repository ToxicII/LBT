package sessions;

import entities.Droit;
import entities.Utilisateur;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
     public Utilisateur getUtilisateur(String code) throws NoResultException{

          Query qr = em.createNamedQuery("entities.Utilisateur.selectByCode");
          qr.setParameter("code", code);

          Utilisateur u = (Utilisateur) qr.getSingleResult();
          return u;

     }

     @Override
     public List<Long> getTypeDroits(Utilisateur utilisateur) {

          List<Long> dList = new ArrayList();

          for (Droit d : utilisateur.getDroits()) {
               dList.add(d.getTypeDroit());
          }

          return dList;
     }

}
