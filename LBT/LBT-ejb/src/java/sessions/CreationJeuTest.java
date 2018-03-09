package sessions;

import entities.Promotion;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CreationJeuTest implements CreationJeuTestLocal {

     @PersistenceContext(unitName = "LBTPU")
     private EntityManager em;

     public void persist(Object object) {
          em.persist(object);
     }

     @Override
     public void test() {

          Date d01 = new GregorianCalendar(2011, 1, 25, 14, 34, 20).getTime();
          Date d02 = new GregorianCalendar(2012, 6, 1, 23, 15, 45).getTime();
          Date d03 = new GregorianCalendar(2018, 8, 2, 24, 16, 40).getTime();
          Date d04 = new GregorianCalendar(2018, 8, 3, 24, 16, 40).getTime();

          Promotion p01 = new Promotion(d01, d02, "Foire à la saucisse", 10f, null);
          Promotion p02 = new Promotion(d03, d04, "Hommage à Maite", 15f, null);         

          em.persist(p01);
          em.persist(p02);
     }
}
