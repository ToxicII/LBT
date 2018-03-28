
package sessions;

import entities.Formule;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class GestionFormule implements GestionFormuleLocal {
     
     @PersistenceContext(unitName = "LBTPU")
     private EntityManager em;    
     
    public List<Formule> getFormulesEC(){
         
         LocalDate date = LocalDate.of(new Date());
         DayOfWeek currentDay = new Date().
         Query qr = em.createNamedQuery("");
         return
    }

     public void persist(Object object) {
          em.persist(object);
     }
}
