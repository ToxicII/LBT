// G@P
package sessions;

import entities.Commande;
import entities.Emplacement;
import entities.LigneCommande;
import entities.Reglement;
import entities.TypeReglement;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class CreationDonnees implements CreationDonneesLocal {

    @PersistenceContext(unitName = "LBTPU")
    private EntityManager em;

    @Override
    public void creerDonnees() {
//        LigneCommande lc01 = new LigneCommande(1, 10, 10);
//        LigneCommande lc02 = new LigneCommande(2, 15, 10);
//        LigneCommande lc03 = new LigneCommande(1, 20, 10);
//        LigneCommande lc04 = new LigneCommande(2, 25, 10);
//        LigneCommande lc05 = new LigneCommande(1, 12, 10);
//        LigneCommande lc06 = new LigneCommande(1, 13, 10);
//        LigneCommande lc07 = new LigneCommande(3, 22, 10);

//        Date d001 = new GregorianCalendar(2018, 2, 16, 12, 00, 00).getTime();
//        Date d002 = new GregorianCalendar(2018, 2, 17, 12, 30, 00).getTime();
//        Date d003 = new GregorianCalendar(2018, 2, 18, 12, 15, 00).getTime();
//
//        Commande c01 = new Commande(d001);
//        Commande c02 = new Commande(d001);
//        Commande c03 = new Commande(d002);
//        Commande c04 = new Commande(d002);
//        Commande c05 = new Commande(d003);
        
//        Emplacement e01 = new Emplacement(1L, "salle01");
//        Emplacement e02 = new Emplacement(2L, "salle01");
//        Emplacement e03 = new Emplacement(3L, "salle01");
//        Emplacement e04 = new Emplacement(4L, "salle01");
//        Emplacement e05 = new Emplacement(5L, "salle01");
//        
//        c01.setEmplacement(e01); // assoc commande emplacement
//        c02.setEmplacement(e02); // assoc commande emplacement
//        c03.setEmplacement(e03); // assoc commande emplacement
//        c04.setEmplacement(e04); // assoc commande emplacement
//        c05.setEmplacement(e05); // assoc commande emplacement
        
//        c01.setParametre(null); // assoc commande parametre
//        c02.setParametre(null); // assoc commande parametre
//        c03.setParametre(null); // assoc commande parametre
//        c04.setParametre(null); // assoc commande parametre
//        c05.setParametre(null); // assoc commande parametre
        
        
//        TypeReglement tr01 = new TypeReglement("espèce");
//        TypeReglement tr02 = new TypeReglement("carte");
//        TypeReglement tr03 = new TypeReglement("chèque restaurant");

//        Reglement r01 = new Reglement(d001, 44); // lc01+lc02
//        Reglement r02 = new Reglement(d002, 77); // lc03+lc04
//        Reglement r03 = new Reglement(d003, 13.2f); // lc05
//        Reglement r04 = new Reglement(d003, 14.3f); // lc06
//        Reglement r05 = new Reglement(d001, 72.2f); // lc07

//        r01.setTypeReglement(tr01); // assoc typeReglement reglement
//        r02.setTypeReglement(tr02); // assoc typeReglement reglement
//        r03.setTypeReglement(tr03); // assoc typeReglement reglement
//        r04.setTypeReglement(tr01); // assoc typeReglement reglement
//        r05.setTypeReglement(tr02); // assoc typeReglement reglement
        
        
                
//        r01.setCommande(c01); // assoc Reglement commande
//        r02.setCommande(c02); // assoc Reglement commande
//        r03.setCommande(c03); // assoc Reglement commande
//        r04.setCommande(c04); // assoc Reglement commande
//        r05.setCommande(c05); // assoc Reglement commande
        
//        em.persist(e01);
//        em.persist(e02);
//        em.persist(e03);
//        em.persist(e04);
//        em.persist(e05);
        
//        em.persist(lc01);
//        em.persist(lc02);
//        em.persist(lc03);
//        em.persist(lc04);
//        em.persist(lc05);
//        em.persist(lc06);
//        em.persist(lc07);

//        em.persist(c01);
//        em.persist(c02);
//        em.persist(c03);
//        em.persist(c04);
//        em.persist(c05);

//        em.persist(tr01);
//        em.persist(tr02);
//        em.persist(tr03);

//        em.persist(r01);
//        em.persist(r02);
//        em.persist(r03);
//        em.persist(r04);
//        em.persist(r05);

    }

}
