
package jeuDEssai;

import entities.Promotion;
import static entities.Promotion_.remise;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class jeu {
    public static void main(String[] args) {
        Date d01 = new GregorianCalendar(2011, 1, 25, 14, 34, 20).getTime();
        Date d02 = new GregorianCalendar(2012, 6, 1, 23, 15, 45).getTime();
        Date d03 = new GregorianCalendar(2018, 8, 2, 24, 16, 40).getTime();
        Date d04 = new GregorianCalendar(2018, 8, 3, 24, 16, 40).getTime();
        
        Promotion p01 = new Promotion(d01, d02, "Foire à la saucisse", 10f, null);
        Promotion p02 = new Promotion(d03, d04, "Hommage à Maite", 15f, null);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LBTPU");
        EntityManager em = emf.createEntityManager();
        
        em.persist(p01);
        em.persist(p02);
        
        EntityTransaction et = em.getTransaction();
        et.begin();        
        et.commit();
        
        em.close();
        emf.close();
    }
}
