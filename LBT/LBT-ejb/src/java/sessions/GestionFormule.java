package sessions;

import entities.Formule;
import java.util.Calendar;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GestionFormule implements GestionFormuleLocal {

     @PersistenceContext(unitName = "LBTPU")
     private EntityManager em;

     @Override
     public List<Formule> getFormulesEC() {

          Calendar calendar = Calendar.getInstance();
          int current = calendar.get(Calendar.DAY_OF_WEEK);
          current--;
          
          System.out.println("day of " + current);
          
          Query qr = em.createNamedQuery("entities.Formule.selectCurrentFormules");
          qr.setParameter("currentD", current);
          qr.setParameter("currentF", current);

          List<Formule> fList = qr.getResultList();

          return fList;
     }

     public void persist(Object object) {
          em.persist(object);
     }
}
