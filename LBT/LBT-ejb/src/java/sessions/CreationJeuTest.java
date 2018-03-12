package sessions;

import entities.Carte;
import entities.CategorieCarte;
import entities.CategorieFormule;
import entities.ChoixClient;
import entities.Droit;
import entities.Emplacement;
import entities.Formule;
import entities.Ingredient;
import entities.Parametres;
import entities.Produit;
import entities.Promotion;
import entities.Propriete;
import entities.TVA;
import entities.Utilisateur;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CreationJeuTest implements CreationJeuTestLocal {

     @PersistenceContext(unitName = "LBTPU")
     private EntityManager em;

     @Override
     public void jeuTest() throws Exception{

// INSTACIATION D'OBJETS========================================================
//////////// CARTE          
          Date dcarte01 = new GregorianCalendar(2002, 5, 1).getTime();
          Date dcarte02 = new GregorianCalendar(2002, 8, 30).getTime();
          Date dcarte03 = new GregorianCalendar(2017, 9, 1).getTime();
          Date dcarte04 = new GregorianCalendar(2018, 3, 30).getTime();
          Carte ca01 = new Carte("Carte d'été", dcarte01, dcarte02);
          Carte ca02 = new Carte("Carte d'hiver", dcarte03, dcarte04);

//////////// CATEGORIECARTE
          CategorieCarte cc01 = new CategorieCarte("Appéritifs & Digestifs");
          CategorieCarte cc02 = new CategorieCarte("Boissions chaudes");
          CategorieCarte cc03 = new CategorieCarte("Boissions fraiches");
          CategorieCarte cc04 = new CategorieCarte("Vins");
          //CategorieCarte cc05 = new CategorieCarte("Entrées");
          CategorieCarte cc05 = new CategorieCarte("Viandes");          
          CategorieCarte cc06 = new CategorieCarte("Grandes salades");
          CategorieCarte cc07 = new CategorieCarte("Poissons");
          CategorieCarte cc08 = new CategorieCarte("Fromages");
          CategorieCarte cc09 = new CategorieCarte("Desserts");
          CategorieCarte cc010 = new CategorieCarte("Fruits de Mer");          
          CategorieCarte cc011 = new CategorieCarte("Hamburgers");          
          CategorieCarte cc012 = new CategorieCarte("Pizzas");          

/////////// CATEGORIEFORMULE          
          CategorieFormule cfe01 = new CategorieFormule("Entrées");
          CategorieFormule cfe02 = new CategorieFormule("Entrées");
          CategorieFormule cfe03 = new CategorieFormule("Entrées");
          CategorieFormule cfp01 = new CategorieFormule("Plats");
          CategorieFormule cfp02 = new CategorieFormule("Plats");
          CategorieFormule cfp03 = new CategorieFormule("Plats");
          CategorieFormule cfp04 = new CategorieFormule("Plats");
          CategorieFormule cfd01 = new CategorieFormule("Desserts");
          CategorieFormule cfd02 = new CategorieFormule("Desserts");
          CategorieFormule cfd03 = new CategorieFormule("Desserts");
          CategorieFormule cfb01 = new CategorieFormule("Boissons");
          CategorieFormule cfb02 = new CategorieFormule("Boissons");
          CategorieFormule cfb03 = new CategorieFormule("Boissons");

//////////// CHOIXCLIENT          
          ChoixClient chc01 = new ChoixClient("bleu", null, "cuisson");
          ChoixClient chc02 = new ChoixClient("saignant", null, "cuisson");
          ChoixClient chc03 = new ChoixClient("à point", null, "cuisson");
          ChoixClient chc04 = new ChoixClient("bien cuit", null, "cuisson");
          ChoixClient chc05 = new ChoixClient("grillé", null, "cuisson");
          ChoixClient chc06 = new ChoixClient("poivre", null, "sauce");
          ChoixClient chc07 = new ChoixClient("mayonnaise", null, "sauce");
          ChoixClient chc08 = new ChoixClient("béarnaise", null, "sauce");
          ChoixClient chc09 = new ChoixClient("estragon", null, "sauce");
          ChoixClient chc010 = new ChoixClient("barbecue", null, "sauce");

//////////// COMMANDE
          
//////////// DROIT  
          Droit dr01 = new Droit("service");
          Droit dr02 = new Droit("cuisine");
          Droit dr03 = new Droit("caisse");

//////////// EMPLACEMENT
          Emplacement e01 = new Emplacement(1L, "salle01");
          Emplacement e02 = new Emplacement(2L, "salle01");
          Emplacement e03 = new Emplacement(3L, "salle01");
          Emplacement e04 = new Emplacement(4L, "salle01");
          Emplacement e05 = new Emplacement(5L, "salle01");
          Emplacement e06 = new Emplacement(6L, "salle01");
          Emplacement e07 = new Emplacement(7L, "salle02");
          Emplacement e08 = new Emplacement(8L, "salle02");
          Emplacement e09 = new Emplacement(9L, "salle02");
          Emplacement e10 = new Emplacement(10L, "salle02");
          Emplacement e11 = new Emplacement(11L, "salle02");
          Emplacement e12 = new Emplacement(12L, "salle02");
          Emplacement e13 = new Emplacement(13L, "salle02");
          Emplacement e14 = new Emplacement(14L, "salle02");
          Emplacement e15 = new Emplacement(15L, "salle02");
          Emplacement e16 = new Emplacement(16L, "salle03");
          Emplacement e17 = new Emplacement(17L, "salle03");
          Emplacement e18 = new Emplacement(18L, "salle03");
          Emplacement e19 = new Emplacement(19L, "salle03");
          Emplacement e20 = new Emplacement(20L, "salle03");
          Emplacement e21 = new Emplacement(21L, "salle03");
          Emplacement e22 = new Emplacement(22L, "salle03");

//////////// FORMULE          
          Date dfm01 = new GregorianCalendar(2000, 0, 1, 11, 0).getTime();
          Date dfm02 = new GregorianCalendar(2000, 0, 1, 15, 0).getTime();
          Date dfs01 = new GregorianCalendar(2000, 0, 1, 19, 0).getTime();
          Date dfs02 = new GregorianCalendar(2000, 0, 1, 23, 0).getTime();

          Formule f01 = new Formule("Formule Midi", 15.2f, "formule composée pour le déjeuner",
                  1, 5, dfm01, dfm02);
          Formule f02 = new Formule("Formule Soir", 20f, "formule pour le diner",
                  1, 5, dfs01, dfs02);
          Formule f03 = new Formule("Formule Midi Week-end", 20f, "formule pour le déjeuner du Samedi au Dimache",
                  6, 7, dfm01, dfm02);
          Formule f04 = new Formule("Formule Soir", 20f, "formule pour le diner du Samedi au Dimache",
                  6, 7, dfs01, dfs02);

//////////// INGREDIENT
          Ingredient i001 = new Ingredient("magret", "canard");
          Ingredient i002 = new Ingredient("miel", "accomp. cuisson");
          Ingredient i003 = new Ingredient("haricots verts", "accompagnement légumes");
          Ingredient i004 = new Ingredient("haricots blancs", "accompagnement légumes");
          Ingredient i005 = new Ingredient("pomme de terre", "accompagnement");
          Ingredient i006 = new Ingredient("pollenta", "accompagnement");
          Ingredient i007 = new Ingredient("oranges pressées", "accompagnement déglaçage");
          Ingredient i008 = new Ingredient("béchamel", "accompagnement sauce");
          Ingredient i009 = new Ingredient("ementhal", "accompagnement sauce");
          Ingredient i013 = new Ingredient("basmati", "accompagnement riz");

          Ingredient i010 = new Ingredient("bavette", "boeuf");
          Ingredient i011 = new Ingredient("oignons", "émincés");

          Ingredient i012 = new Ingredient("tournedos", "boeuf");

//////////// LIGNECOMMANDE
//////////// PARAMETRE  
          Parametres parP01 = new Parametres(1L, "disponible");
          Parametres parP02 = new Parametres(2L, "indisponible");
          Parametres parC01 = new Parametres(100L, "panier");
          Parametres parC02 = new Parametres(101L, "validée");
          Parametres parC03 = new Parametres(102L, "payée");
          Parametres parC04 = new Parametres(103L, "annulée");
          Parametres parU01 = new Parametres(200L, "employé");
          Parametres parU02 = new Parametres(201L, "licencié");
          Parametres parU03 = new Parametres(202L, "démissionaire");
          Parametres parE01 = new Parametres(300L, "ocuppée");
          Parametres parE02 = new Parametres(301L, "libre");

//////////// PRODUIT          
          Produit p01 = new Produit("Magret de canard",
                  "belle pièce poelée nappée de miel", 11.9f, null);
          Produit p011 = new Produit("Pièce de canard",
                  "composant du magret de canard", 0f, null);
          Produit p001 = new Produit("Pommes frites",
                  "Accompagnement frite", 0f, null);
          Produit p002 = new Produit("Haricots verts",
                  "Accompagnement H-V", 0f, null);
          Produit p003 = new Produit("Gratin dauphinois",
                  "Accompagnement gratin", 0f, null);
          Produit p004 = new Produit("Pollenta",
                  "Accompagnement Poll.", 0f, null);
          Produit p005 = new Produit("Flageolets",
                  "Accompagnement haricots blancs", 0f, null);
          Produit p006 = new Produit("Riz basmati",
                  "Accompagnement riz blancs", 0f, null);
          Produit p02 = new Produit("Bavette d'Aloyo",
                  "belle pièce de boeuf et sa sauce", 12.6f, null);
          Produit p021 = new Produit("Bavette",
                  "pièce de boeuf", 0F, null);

          Produit p03 = new Produit("Tournedos de boeuf",
                  "belle pièce de boeuf et son accompagnement", 12.9F, null);
          Produit p031 = new Produit("Tournedos",
                  "pièce de boeuf", 0F, null);

          Produit p04 = new Produit("Spaghettis de légumes à la bolognaise",
                  "spaghettis végétariens", 10.5F, null);
          
          //Produit p05 = new Produit("", null, prixHT, null);

//////////// PROMOTION
          Date d01 = new GregorianCalendar(2011, 1, 25, 14, 34, 20).getTime();
          Date d02 = new GregorianCalendar(2012, 6, 1, 23, 15, 45).getTime();
          Date d03 = new GregorianCalendar(2018, 8, 2, 24, 16, 40).getTime();
          Date d04 = new GregorianCalendar(2018, 8, 3, 24, 16, 40).getTime();

          Promotion prom01 = new Promotion(d01, d02, "Foire à la saucisse", 10f, null);
          Promotion prom02 = new Promotion(d03, d04, "Hommage à Maite", 15f, null);

//////////// PROPRIETE               
          Propriete pPrdt001 = new Propriete("poid", "125", "grammes");
          /*Propriete pPrdt002 = new Propriete("cuisson", "saignant", null);
          Propriete pPrdt003 = new Propriete("cuisson", "à point", null);*/

//////////// REGLEMENT
//////////// TVA
          TVA tv01 = new TVA(10f);
          TVA tv02 = new TVA(20f);
          TVA tv03 = new TVA(15.6f);
          TVA tv04 = new TVA(9.6f);

//////////// TYPEREGLEMENT
//////////// UTILISATEUR  
          Utilisateur u01 = new Utilisateur("1234", "Peuplus", "Jean");
          Utilisateur u02 = new Utilisateur("2345", "Neymar", "Jean");
          Utilisateur u03 = new Utilisateur("9876", "Bon de Parme", "Jean");
          Utilisateur u04 = new Utilisateur("4567", "Moulin", "Jean");
          Utilisateur u05 = new Utilisateur("9632", "Jaurès", "Jean");
          Utilisateur u06 = new Utilisateur("9510", "de La Fontain", "Jean");
          Utilisateur u07 = new Utilisateur("3021", "Marc Morandini", "Jean");
          Utilisateur u08 = new Utilisateur("4561", "Luc Mélenchon", "Jean");

// DEPENDANCES==================================================================
//////////// CARTE -> CATEGORIECARTE          
          ca02.getCategorieCartes().add(cc01);
          ca02.getCategorieCartes().add(cc02);
          ca02.getCategorieCartes().add(cc03);
          ca02.getCategorieCartes().add(cc04);
          ca02.getCategorieCartes().add(cc05);
          ca02.getCategorieCartes().add(cc06);
          ca02.getCategorieCartes().add(cc07);
          ca02.getCategorieCartes().add(cc08);
          ca02.getCategorieCartes().add(cc09);
          ca02.getCategorieCartes().add(cc010);
          ca02.getCategorieCartes().add(cc011);
          ca02.getCategorieCartes().add(cc012);

//////////// CATEGORIEFORMULE -> FORMULE
          cfe01.setFormule(f01);
          cfe02.setFormule(f02);
          cfe03.setFormule(f03);

          cfp01.setFormule(f01);
          cfp02.setFormule(f02);
          cfp03.setFormule(f03);
          cfp04.setFormule(f04);

          cfd01.setFormule(f01);
          cfd02.setFormule(f02);
          cfd03.setFormule(f04);

          cfb01.setFormule(f01);
          cfb02.setFormule(f02);
          cfb03.setFormule(f04);

//////////// CATEGORIEFORMULE -> PRODUIT          
//////////// COMMANDE -> EMPLACEMENT          
//////////// COMMANDE -> PARAMETRE     
//////////// EMPLACEMENT -> PARAMETRE 
          e01.setParametre(parE01);
          e02.setParametre(parE01);
          e03.setParametre(parE01);
          e04.setParametre(parE01);
          e05.setParametre(parE01);
          e06.setParametre(parE01);
          e07.setParametre(parE01);
          e08.setParametre(parE01);
          e09.setParametre(parE01);
          e10.setParametre(parE01);
          e11.setParametre(parE01);
          e12.setParametre(parE01);
          e13.setParametre(parE01);
          e14.setParametre(parE01);
          e15.setParametre(parE01);
          e16.setParametre(parE01);
          e17.setParametre(parE01);
          e18.setParametre(parE01);
          e19.setParametre(parE01);
          e20.setParametre(parE01);
          e21.setParametre(parE01);
          e22.setParametre(parE01);

//////////// FORMULE -> TVA  
          f01.setTva(tv01);
          f02.setTva(tv01);
          f03.setTva(tv03);
          f04.setTva(tv04);

//////////// LIGNECOMMANDE -> CHOIXCLIENT          
//////////// LIGNECOMMANDE -> COMMANDE
//////////// LIGNECOMMANDE -> FORMULE
//////////// LIGNECOMMANDE -> INGREDIENT          
//////////// LIGNECOMMANDE -> LIGNECOMMANDE
//////////// LIGNECOMMANDE -> PRODUIT          
//////////// PRODUIT -> CATEGORIECARTE
          p01.setCategorieCarte(cc07);
          p02.setCategorieCarte(cc07);
          p03.setCategorieCarte(cc07);

//////////// PRODUIT -> CHOIXCLIENT         
//////////// PRODUIT -> INGREDIENT          
          p011.getIngredients().add(i001);
          p011.getIngredients().add(i002);
          p011.getIngredients().add(i007);

          p001.getIngredients().add(i005);

          p002.getIngredients().add(i003);

          p003.getIngredients().add(i005);
          p003.getIngredients().add(i008);
          p003.getIngredients().add(i009);

          p005.getIngredients().add(i004);

          p02.getIngredients().add(i010);
          p02.getIngredients().add(i011);

          p031.getIngredients().add(i012);

//////////// PRODUIT -> PARAMETRE          
//////////// PRODUIT -> PRODUIT         
          p01.getProduitEnfants().add(p011);
          p01.getProduitEnfants().add(p001);
          p01.getProduitEnfants().add(p002);
          p01.getProduitEnfants().add(p003);
          p01.getProduitEnfants().add(p004);
          p01.getProduitEnfants().add(p005);
          p01.getProduitEnfants().add(p006);

          p02.getProduitEnfants().add(p021);
          p02.getProduitEnfants().add(p002);
          p02.getProduitEnfants().add(p003);
          p02.getProduitEnfants().add(p004);
          p02.getProduitEnfants().add(p005);
          p02.getProduitEnfants().add(p006);

          p03.getProduitEnfants().add(p031);
          p03.getProduitEnfants().add(p002);
          p03.getProduitEnfants().add(p003);
          p03.getProduitEnfants().add(p004);
          p03.getProduitEnfants().add(p005);
          p03.getProduitEnfants().add(p006);

//////////// PRODUIT -> TVA          
//////////// PROMOTION -> PRODUIT          
//////////// PROPRIETE -> PRODUIT          
          /*pPrdt001.setProduit(p01);
          pPrdt001.setProduit(p02);
          pPrdt001.setProduit(p03);*/

          pPrdt001.setProduit(p02);
          

          /*pPrdt003.setProduit(p01);
          pPrdt003.setProduit(p02);
          pPrdt003.setProduit(p03);*/

//////////// REGLEMENT -> COMMANDE
//////////// REGLEMENT -> TYPEREGLEMENT         
//////////// UTILISATEUR -> DROIT    
          u01.getDroits().add(dr01);
          u01.getDroits().add(dr02);
          u02.getDroits().add(dr01);
          u08.getDroits().add(dr01);
          u03.getDroits().add(dr02);
          u04.getDroits().add(dr02);
          u05.getDroits().add(dr02);
          u06.getDroits().add(dr01);
          u07.getDroits().add(dr03);

//////////// UTILISATEUR -> EMPLACEMENT   
          u01.getEmplacements().add(e01);
          u01.getEmplacements().add(e02);
          u01.getEmplacements().add(e03);
          u01.getEmplacements().add(e04);
          u01.getEmplacements().add(e05);
          u01.getEmplacements().add(e06);

          u02.getEmplacements().add(e07);
          u02.getEmplacements().add(e08);
          u02.getEmplacements().add(e09);
          u02.getEmplacements().add(e10);
          u02.getEmplacements().add(e11);
          u02.getEmplacements().add(e12);
          u02.getEmplacements().add(e13);
          u02.getEmplacements().add(e14);
          u02.getEmplacements().add(e15);

          u08.getEmplacements().add(e16);
          u08.getEmplacements().add(e17);
          u08.getEmplacements().add(e18);
          u08.getEmplacements().add(e19);
          u08.getEmplacements().add(e20);
          u08.getEmplacements().add(e21);
          u08.getEmplacements().add(e22);

//////////// UTILISATEUR -> PARAMETRE  
          u01.setParametres(parU01);
          u02.setParametres(parU01);
          u03.setParametres(parU01);
          u04.setParametres(parU01);
          u05.setParametres(parU01);
          u06.setParametres(parU02);
          u07.setParametres(parU03);
          u08.setParametres(parU01);

// PERSIST======================================================================
          // CARTE
          em.persist(ca01);
          em.persist(ca02);

          // CATEGORIECARTE
          em.persist(cc01);
          em.persist(cc02);
          em.persist(cc03);
          em.persist(cc04);
          em.persist(cc05);
          em.persist(cc06);
          em.persist(cc07);
          em.persist(cc08);
          em.persist(cc09);
          em.persist(cc010);
          em.persist(cc011);
          em.persist(cc012);

          // CATEGORIEFORMULE
          em.persist(cfb01);
          em.persist(cfb02);
          em.persist(cfb03);
          em.persist(cfe01);
          em.persist(cfe02);
          em.persist(cfe03);
          em.persist(cfp01);
          em.persist(cfp02);
          em.persist(cfp03);
          em.persist(cfp04);
          em.persist(cfd01);
          em.persist(cfd02);
          em.persist(cfd03);

          // CHOIXCLIENT
          em.persist(chc01);
          em.persist(chc02);
          em.persist(chc03);
          em.persist(chc04);
          em.persist(chc05);
          em.persist(chc06);
          em.persist(chc07);
          em.persist(chc08);
          em.persist(chc09);
          em.persist(chc010);

          //COMMANDE
          // DROIT
          em.persist(dr01);
          em.persist(dr02);
          em.persist(dr03);

          // EMPLACEMENT
          em.persist(e01);
          em.persist(e02);
          em.persist(e03);
          em.persist(e04);
          em.persist(e05);
          em.persist(e06);
          em.persist(e07);
          em.persist(e08);
          em.persist(e09);
          em.persist(e10);
          em.persist(e11);
          em.persist(e12);
          em.persist(e13);
          em.persist(e14);
          em.persist(e15);
          em.persist(e16);
          em.persist(e17);
          em.persist(e18);
          em.persist(e19);
          em.persist(e20);
          em.persist(e21);
          em.persist(e22);

          // FORMULE
          em.persist(f01);
          em.persist(f02);
          em.persist(f03);
          em.persist(f04);

          // INGREDIENT
          em.persist(i001);
          em.persist(i002);
          em.persist(i003);
          em.persist(i004);
          em.persist(i005);
          em.persist(i006);
          em.persist(i007);
          em.persist(i008);
          em.persist(i009);
          em.persist(i010);
          em.persist(i011);
          em.persist(i012);
          em.persist(i013);

          // LIGNECOMMANDE
          // PARAMETRE
          em.persist(parP01);
          em.persist(parP02);
          em.persist(parC01);
          em.persist(parC02);
          em.persist(parC03);
          em.persist(parC04);
          em.persist(parU01);
          em.persist(parU02);
          em.persist(parU03);
          em.persist(parE01);
          em.persist(parE02);

          // PRODUIT                    
          em.persist(p01);
          em.persist(p02);
          em.persist(p03);
          em.persist(p04);
          em.persist(p011);
          em.persist(p021);
          em.persist(p031);
          em.persist(p001);
          em.persist(p002);
          em.persist(p003);
          em.persist(p004);
          em.persist(p005);
          em.persist(p006);

          // PROMOTIONS
          em.persist(prom01);
          em.persist(prom02);

          // PROPRIETE
          em.persist(pPrdt001);
          /*em.persist(pPrdt002);
          em.persist(pPrdt003);*/

          // REGLEMENT
          // TVA
          em.persist(tv01);
          em.persist(tv02);
          em.persist(tv03);
          em.persist(tv04);

          // TYPEREGLEMENT
          // UTILISATEUR
          em.persist(u01);
          em.persist(u02);
          em.persist(u03);
          em.persist(u04);
          em.persist(u05);
          em.persist(u06);
          em.persist(u07);
          em.persist(u08);
     }

}
