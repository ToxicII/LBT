package sessions;

import entities.Carte;
import entities.CategorieCarte;
import entities.CategorieFormule;
import entities.ChoixClient;
import entities.Commande;
import entities.Droit;
import entities.Emplacement;
import entities.Formule;
import entities.Ingredient;
import entities.LigneCommande;
import entities.Parametres;
import entities.Produit;
import entities.Promotion;
import entities.Propriete;
import entities.Reglement;
import entities.TVA;
import entities.TypeReglement;
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
    public void jeuTest() throws Exception {

// INSTANCIATION D'OBJETS========================================================
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
          CategorieCarte cc05 = new CategorieCarte("Viandes");          
          CategorieCarte cc06 = new CategorieCarte("Grandes salades");
          CategorieCarte cc07 = new CategorieCarte("Poissons"); 
          CategorieCarte cc08 = new CategorieCarte("Fromages");
          CategorieCarte cc09 = new CategorieCarte("Desserts");
          CategorieCarte cc010 = new CategorieCarte("Fruits de Mer");          
          CategorieCarte cc011 = new CategorieCarte("Hamburgers");          
          CategorieCarte cc012 = new CategorieCarte("Pizzas");
          CategorieCarte cc013 = new CategorieCarte("Entrées");
          CategorieCarte cc014 = new CategorieCarte("Accompagnement");

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
        Date d001 = new GregorianCalendar(2018, 2, 16, 12, 00, 00).getTime();
        Date d002 = new GregorianCalendar(2018, 2, 17, 12, 30, 00).getTime();
        Date d003 = new GregorianCalendar(2018, 2, 18, 12, 15, 00).getTime();

        Commande c01 = new Commande(d001);
        Commande c02 = new Commande(d001);
        Commande c03 = new Commande(d002);
        Commande c04 = new Commande(d002);
        Commande c05 = new Commande(d003);

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

        Ingredient i010 = new Ingredient("bavette", "boeuf");
        Ingredient i011 = new Ingredient("oignons", "émincés");

          Ingredient i012 = new Ingredient("tournedos", "boeuf");
          Ingredient i013 = new Ingredient("basmati", "accompagnement riz");

		Ingredient i015 = new Ingredient ("pièce de sole", "poisson");
		Ingredient i016 = new Ingredient ( "sauce meunière" , "sauce");
		Ingredient i017 = new Ingredient ("base tomate", "base pizza");
		Ingredient i018 = new Ingredient ("origan", "base pizza");
		Ingredient i019 = new Ingredient ("mozzarella", "fromage");
		Ingredient i020 = new Ingredient ("jambon", "acc. pizza");
		Ingredient i021 = new Ingredient ("capres", "acc. pizza");
		Ingredient i022 = new Ingredient ("champignon", "acc. pizza");
		Ingredient i023 = new Ingredient ("artichaud", "acc. pizza");
		Ingredient i024 = new Ingredient ("poivron", "acc. pizza");
		Ingredient i025 = new Ingredient ("mortadelle", "acc. pizza");
		Ingredient i026 = new Ingredient ("tomates confites", "acc. pizza");
		Ingredient i027 = new Ingredient ("tomates", "tranches");
		Ingredient i028 = new Ingredient ("salade", "accomp.");
		Ingredient i029 = new Ingredient ("cornichon", "accomp.");
		Ingredient i030 = new Ingredient ("ketchup", "sauce");
		Ingredient i031 = new Ingredient ("moutarde", "sauce");
		Ingredient i032 = new Ingredient ("conté", "tranche");
		Ingredient i033 = new Ingredient ("blanc de poulet", "acc. salade");
		Ingredient i034 = new Ingredient ("crouton", "acc. salade");
		Ingredient i035 = new Ingredient ("chèvre", "acc. salade");
		Ingredient i036 = new Ingredient ("lardon", "acc. salade");
		Ingredient i037 = new Ingredient ("thon", "acc. salade");
		Ingredient i038 = new Ingredient ("olives", "acc. salade");
		Ingredient i039 = new Ingredient ("anchois", "acc. salade");
		Ingredient i040 = new Ingredient ("oeufs", "acc. salade");
		Ingredient i041 = new Ingredient ("avocat", "acc. salade");
		Ingredient i042 = new Ingredient ("asperge", "acc. salade");
		Ingredient i043 = new Ingredient ("chocolat", "dessert");
		Ingredient i044 = new Ingredient ("pomme", "dessert");
		Ingredient i045 = new Ingredient ("pate sablé", "dessert");
		Ingredient i046 = new Ingredient ("pate feuillettée", "dessert");
		Ingredient i047 = new Ingredient ("oeuf en neige", "dessert");
		Ingredient i048 = new Ingredient ("crème anglaise", "crème dessert");
		Ingredient i049 = new Ingredient ("Steack façon bouchère", "base burger");
//////////// LIGNECOMMANDE
        LigneCommande lc01 = new LigneCommande(1, 10, 10);
        LigneCommande lc02 = new LigneCommande(2, 15, 10);
        LigneCommande lc03 = new LigneCommande(1, 20, 10);
        LigneCommande lc04 = new LigneCommande(2, 25, 20);
        LigneCommande lc05 = new LigneCommande(1, 12, 20);
        LigneCommande lc06 = new LigneCommande(1, 13, 10);
        LigneCommande lc07 = new LigneCommande(3, 22, 9.6f);

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
          
          	Produit p007 = new Produit("Salade", "Accompagnement salade",0F,null);

	Produit p05 = new Produit("sole meunière", 
		"reine de nos rivières", 11.35F, null);
	    Produit p051 = new Produit("pièce de sole", "composant sole meunière", 0F, null);

	Produit p06 = new Produit("pizza reine","tomate, origan, mozzarella, jambon, champignon, "
                + "tomates confites", 8.35F, null);
	Produit p07 = new Produit("pizza belle table","tomate, origan, mozzarella, "
                + "jambon, capres,; poivron, mortadelle, champignon", 8.35F, null);
	Produit p08 = new Produit("Burger de la table", 
		"LE burger et ses frites maison ", 14.15F, null);		
	     Produit p081 = new Produit("Burger Maison", "compos. Burger", 0F,null);
	Produit p09 = new Produit("Salade César", "salade, tomates confites, poulet", 8.9F, null);
	Produit p10 = new Produit("Salade Chèvre", "salade, tomate, chèvre, lardons, crouton", 8.9F, null);
	Produit p11 = new Produit("Salade Niçoise", "salade, tomate, thon, anchois, olives", 8.9F, null);
	Produit p12 = new Produit("oeufs mayonnaise", "l'entrée idéale", 4.55F, null);
	Produit p13 = new Produit("petite salade mixte", "l'entrée fraicheur", 4.95F, null);
	Produit p14 = new Produit("avocat-thon", "l'entrée énergétique", 4.65F, null);
	Produit p15 = new Produit("asperge et sa tranche de jambon", "l'entrée équilibre", 5.15F, null);

	Produit p16 = new Produit("tarte tatin", "la douceur", 4.25F, null);
	Produit p17 = new Produit("sablé chocolat", "le plaisir", 5.15F, null);
	Produit p18 = new Produit("île flottante", "l'entrée énergétique", 5.95F, null);	

	Produit p30 = new Produit("carafe d'eau", "eau", 0F, null);
	Produit p31 = new Produit("Evian", "eau plate", 1.84F, null);
	Produit p32 = new Produit("St-Yorres", "eau gazeuse", 1.76F, null);
	Produit p33 = new Produit("jus de pomme", "jus fruit", 2.2F, null);
	Produit p34 = new Produit("jus de pêche", "jus fruit", 2.2F, null);
	Produit p35 = new Produit("jus d'orange", "jus fruit", 2.2F, null);
	Produit p36 = new Produit("virgin cola", "sodas", 2.3F, null);
	Produit p37 = new Produit("fanta orange", "sodas", 2.3F, null);
	Produit p38 = new Produit("fanta citron", "sodas", 2.3F, null);
	Produit p39 = new Produit("ice tea", "sodas", 1.95F, null);

	Produit p40 = new Produit("café", "boisson chaude", 2.1F, null);
	Produit p41 = new Produit("café double", "boisson chaude", 2.1F, null);
	Produit p42 = new Produit("thé", "boisson chaude", 2.1F, null);
	Produit p43 = new Produit("chocolat", "boisson chaude", 2.1F, null);

	Produit p50 = new Produit("champagne", "mousseux blanc", 18.65F, null);
	Produit p51 = new Produit("sancerre", "vallée de loire blanc", 18.65F, null);
	Produit p52 = new Produit("Château Saint Roch", "Côtes du Rhône blanc", 19.65F, null);
	Produit p53 = new Produit("chablis", "bourgogne blanc", 17.85F, null);
	Produit p54 = new Produit("grave", "bordeau rouge", 16.85F, null);
	Produit p55 = new Produit("pommerol", "bordeau rouge", 14.35F, null);
	Produit p56 = new Produit("chinon", "vallée de loire rouge", 14.35F, null);

	Produit p60 = new Produit("Get27", "alcool", 6.65F, null);
	Produit p61 = new Produit("whisky", "alcool", 6.65F, null);
	Produit p62 = new Produit("vodka", "alcool", 6.65F, null);
	Produit p63 = new Produit("martini", "alcool", 6.65F, null);
	Produit p64 = new Produit("porto", "alcool", 6.65F, null);
	Produit p65 = new Produit("cognac", "alcool", 6.65F, null);
	Produit p66 = new Produit("armagnac", "alcool", 6.65F, null);
	Produit p67 = new Produit("manzana", "liqueur", 6.65F, null);
	Produit p68 = new Produit("mandarine impériale", "liqueur", 6.65F, null);
        
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
        Reglement r01 = new Reglement(d001, 44); // lc01+lc02
        Reglement r02 = new Reglement(d002, 77); // lc03+lc04
        Reglement r03 = new Reglement(d003, 13.2f); // lc05
        Reglement r04 = new Reglement(d003, 14.3f); // lc06
        Reglement r05 = new Reglement(d001, 72.2f); // lc07

//////////// TVA
        TVA tv01 = new TVA(10f);
        TVA tv02 = new TVA(20f);
        TVA tv03 = new TVA(15.6f);
        TVA tv04 = new TVA(9.6f);

//////////// TYPEREGLEMENT
        TypeReglement tr01 = new TypeReglement("espèce");
        TypeReglement tr02 = new TypeReglement("carte");
        TypeReglement tr03 = new TypeReglement("chèque restaurant");

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
          ca02.getCategorieCartes().add(cc013);

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
        c01.setEmplacement(e01);
        c02.setEmplacement(e02);
        c03.setEmplacement(e03);
        c04.setEmplacement(e04);
        c05.setEmplacement(e05);

//////////// COMMANDE -> PARAMETRE     
        c01.setParametre(parC01);
        c02.setParametre(parC02);
        c03.setParametre(parC03);
        c04.setParametre(parC03);
        c05.setParametre(parC04);

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
        lc01.getChoixClients().add(chc01);
        lc02.getChoixClients().add(chc02);
        lc03.getChoixClients().add(chc03);
        lc04.getChoixClients().add(chc04);
        lc05.getChoixClients().add(chc05);
        lc06.getChoixClients().add(chc06);
        lc07.getChoixClients().add(chc07);

//////////// LIGNECOMMANDE -> COMMANDE
        lc01.setCommande(c01);
        lc02.setCommande(c01);
        lc03.setCommande(c02);
        lc04.setCommande(c02);
        lc05.setCommande(c03);
        lc06.setCommande(c04);
        lc07.setCommande(c05);
        

//////////// LIGNECOMMANDE -> FORMULE
        lc03.setFormule(f01);
        lc05.setFormule(f02);
        lc07.setFormule(f03);

//////////// LIGNECOMMANDE -> INGREDIENT   
        lc01.getIngredients().add(i001);
        lc02.getIngredients().add(i002);
        lc03.getIngredients().add(i003);
        lc04.getIngredients().add(i004);
        lc05.getIngredients().add(i005);
        lc06.getIngredients().add(i006);
        lc07.getIngredients().add(i007);

//////////// LIGNECOMMANDE -> LIGNECOMMANDE
        lc01.getLigneCommandeEnfants().add(lc01);
        lc02.getLigneCommandeEnfants().add(lc02);
        lc03.getLigneCommandeEnfants().add(lc03);
        lc04.getLigneCommandeEnfants().add(lc04);
        lc05.getLigneCommandeEnfants().add(lc05);
        lc06.getLigneCommandeEnfants().add(lc06);
        lc07.getLigneCommandeEnfants().add(lc07);
     
//////////// LIGNECOMMANDE -> PRODUIT       
        lc01.setProduit(p01);
        lc02.setProduit(p02);
        lc04.setProduit(p03);
        lc06.setProduit(p03);

//////////// PRODUIT -> CATEGORIECARTE
          p01.setCategorieCarte(cc05);
          p02.setCategorieCarte(cc05);
          p03.setCategorieCarte(cc05);
          p04.setCategorieCarte(cc05);

            p05.setCategorieCarte(cc07); //==> ajout Manu
            p06.setCategorieCarte(cc012);
            p07.setCategorieCarte(cc012);
            p08.setCategorieCarte(cc011);
            p09.setCategorieCarte(cc06);
            p10.setCategorieCarte(cc06);
            p11.setCategorieCarte(cc06);

            p12.setCategorieCarte(cc013);	
            p13.setCategorieCarte(cc013);
            p14.setCategorieCarte(cc013);
            p15.setCategorieCarte(cc013);

            p16.setCategorieCarte(cc09);
            p17.setCategorieCarte(cc09);
            p18.setCategorieCarte(cc09);
            
            p30.setCategorieCarte(cc03);
            p31.setCategorieCarte(cc03);
            p32.setCategorieCarte(cc03);
            p33.setCategorieCarte(cc03);
            p34.setCategorieCarte(cc03);
            p35.setCategorieCarte(cc03);
            p36.setCategorieCarte(cc03);
            p37.setCategorieCarte(cc03);
            p38.setCategorieCarte(cc03);
            p39.setCategorieCarte(cc03);
            
            p40.setCategorieCarte(cc02);
            p41.setCategorieCarte(cc02);
            p42.setCategorieCarte(cc02);
            p43.setCategorieCarte(cc02);
            
            p50.setCategorieCarte(cc04);
            p51.setCategorieCarte(cc04);
            p52.setCategorieCarte(cc04);
            p53.setCategorieCarte(cc04);
            p54.setCategorieCarte(cc04);
            p55.setCategorieCarte(cc04);
            p56.setCategorieCarte(cc04);
            
            p60.setCategorieCarte(cc01);
            p61.setCategorieCarte(cc01);
            p62.setCategorieCarte(cc01);
            p63.setCategorieCarte(cc01);
            p64.setCategorieCarte(cc01);
            p65.setCategorieCarte(cc01);
            p66.setCategorieCarte(cc01);
            p67.setCategorieCarte(cc01);
            p68.setCategorieCarte(cc01); 

            p001.setCategorieCarte(cc014);
            p002.setCategorieCarte(cc014); 
            p003.setCategorieCarte(cc014); 
            p004.setCategorieCarte(cc014); 
            p005.setCategorieCarte(cc014); 
            p006.setCategorieCarte(cc014); 
            p007.setCategorieCarte(cc014);            // ==> ajout Manu
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
            p051.getIngredients().add(i015); //  ==> ajout Manu
            p051.getIngredients().add(i016);
            p06.getIngredients().add(i017);
            p06.getIngredients().add(i018);
            p06.getIngredients().add(i019);
            p06.getIngredients().add(i020);
            p06.getIngredients().add(i022);		
            p07.getIngredients().add(i017);
            p07.getIngredients().add(i018);
            p07.getIngredients().add(i019);
            p07.getIngredients().add(i020);
            p07.getIngredients().add(i021);
            p07.getIngredients().add(i022);
            p07.getIngredients().add(i024);
            p07.getIngredients().add(i025);
            p07.getIngredients().add(i026);
            p081.getIngredients().add(i049);
            p081.getIngredients().add(i027);
            p081.getIngredients().add(i028);
            p081.getIngredients().add(i029);
            p081.getIngredients().add(i030);
            p081.getIngredients().add(i031);
            p081.getIngredients().add(i032);
            p09.getIngredients().add(i026);
            p09.getIngredients().add(i028);
            p09.getIngredients().add(i033);
            p09.getIngredients().add(i034);
            p10.getIngredients().add(i027);
            p10.getIngredients().add(i028);
            p10.getIngredients().add(i034);
            p10.getIngredients().add(i035);
            p10.getIngredients().add(i036);
            p11.getIngredients().add(i027);
            p11.getIngredients().add(i028);
            p11.getIngredients().add(i037);
            p11.getIngredients().add(i038);
            p11.getIngredients().add(i039);
            p12.getIngredients().add(i040);
            p12.getIngredients().add(i028);
            p13.getIngredients().add(i027);
            p13.getIngredients().add(i028);
            p14.getIngredients().add(i037);
            p14.getIngredients().add(i041);
            p15.getIngredients().add(i020);
            p15.getIngredients().add(i042);
            p16.getIngredients().add(i044);
            p16.getIngredients().add(i046);
            p17.getIngredients().add(i043);
            p17.getIngredients().add(i045);
            p18.getIngredients().add(i047);
            p18.getIngredients().add(i048); //  ==> ajout Manu
//////////// PRODUIT -> PARAMETRE          
          
        p01.getParametres().add(parP01);
        p02.getParametres().add(parP01);
        p03.getParametres().add(parP01);
                p04.getParametres().add(parP02);
        p05.getParametres().add(parP01);
                p06.getParametres().add(parP02);
        p07.getParametres().add(parP01);
        p08.getParametres().add(parP01);
                p09.getParametres().add(parP02);
        p10.getParametres().add(parP01);
        p11.getParametres().add(parP01);
        p12.getParametres().add(parP01);
        p13.getParametres().add(parP01);
        p14.getParametres().add(parP01);
        p15.getParametres().add(parP01);
        p16.getParametres().add(parP01);
        p17.getParametres().add(parP01);
        p18.getParametres().add(parP01);

        p30.getParametres().add(parP01);
        p31.getParametres().add(parP01);
        p32.getParametres().add(parP01);
        p33.getParametres().add(parP01);
        p34.getParametres().add(parP01);
        p35.getParametres().add(parP01);
        p36.getParametres().add(parP01);
        p37.getParametres().add(parP01);
        p38.getParametres().add(parP01);
        p39.getParametres().add(parP01);

        p40.getParametres().add(parP01);
        p41.getParametres().add(parP01);
        p42.getParametres().add(parP01);
        p43.getParametres().add(parP01);

        p50.getParametres().add(parP01);
        p51.getParametres().add(parP01);
        p52.getParametres().add(parP01);
        p53.getParametres().add(parP01);
        p54.getParametres().add(parP01);
        p55.getParametres().add(parP01);
        p56.getParametres().add(parP01);

        p60.getParametres().add(parP01);
        p61.getParametres().add(parP01);
        p62.getParametres().add(parP01);
        p63.getParametres().add(parP01);
        p64.getParametres().add(parP01);
        p65.getParametres().add(parP01);
        p66.getParametres().add(parP01);
        p67.getParametres().add(parP01);
        p68.getParametres().add(parP01);
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
            p05.getProduitEnfants().add(p051); //  ==> ajout Manu
            p05.getProduitEnfants().add(p001);
            p05.getProduitEnfants().add(p002);
            p05.getProduitEnfants().add(p003);
            p05.getProduitEnfants().add(p004);
            p05.getProduitEnfants().add(p005);
            p05.getProduitEnfants().add(p006);
            p08.getProduitEnfants().add(p081);
            p08.getProduitEnfants().add(p001);
            p08.getProduitEnfants().add(p007);	 //  ==> ajout Manu

//////////// PRODUIT -> TVA      
            p001.setTva(tv01);   //  ==> ajout Manuel
            p002.setTva(tv01);
            p003.setTva(tv01);
            p004.setTva(tv01);
            p005.setTva(tv01);
            p006.setTva(tv01);
            p007.setTva(tv01);
            p01.setTva(tv01);
            p02.setTva(tv01);
            p03.setTva(tv01);
            p04.setTva(tv01);
            p05.setTva(tv01);
            p06.setTva(tv01);
            p07.setTva(tv01);
            p08.setTva(tv01);
            p09.setTva(tv01);
            p10.setTva(tv01);
            p11.setTva(tv01);
            p12.setTva(tv01);
            p13.setTva(tv01);
            p14.setTva(tv01);
            p15.setTva(tv01);
            p16.setTva(tv01);
            p17.setTva(tv01);
            p18.setTva(tv01);
            p30.setTva(tv01);
            p31.setTva(tv01);
            p32.setTva(tv01);
            p33.setTva(tv01);
            p34.setTva(tv01);
            p35.setTva(tv01);
            p36.setTva(tv01);
            p37.setTva(tv01);
            p38.setTva(tv01);
            p39.setTva(tv01);
            p40.setTva(tv01);
            p41.setTva(tv01);
            p42.setTva(tv01);
            p43.setTva(tv01);
            
            p50.setTva(tv02);
            p51.setTva(tv02);
            p52.setTva(tv02);
            p53.setTva(tv02);
            p54.setTva(tv02);
            p55.setTva(tv02);
            p56.setTva(tv02);
            p60.setTva(tv02);
            p61.setTva(tv02);
            p62.setTva(tv02);
            p63.setTva(tv02);
            p64.setTva(tv02);
            p65.setTva(tv02);
            p66.setTva(tv02);
            p67.setTva(tv02);
            p68.setTva(tv02);   //  ==> ajout Manuel
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
        r01.setCommande(c01);
        r02.setCommande(c02);
        r03.setCommande(c03);
        r04.setCommande(c04);
        r05.setCommande(c05);

//////////// REGLEMENT -> TYPEREGLEMENT      
        r01.setTypeReglement(tr01);
        r02.setTypeReglement(tr02);
        r03.setTypeReglement(tr03);
        r04.setTypeReglement(tr01);
        r05.setTypeReglement(tr02);

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
          em.persist(cc013); 
          em.persist(cc014); //  ==> ajout Manu

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
        em.persist(c01);
        em.persist(c02);
        em.persist(c03);
        em.persist(c04);
        em.persist(c05);

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
          em.persist(i015);
          em.persist(i016);
            em.persist(i017);   //  ==> ajout Manu
            em.persist(i018);
            em.persist(i019);
            em.persist(i020);
            em.persist(i021);
            em.persist(i022);
            em.persist(i023);
            em.persist(i024);
            em.persist(i025);
            em.persist(i026);
            em.persist(i027);
            em.persist(i028);
            em.persist(i029);
            em.persist(i030);
            em.persist(i031);
            em.persist(i032);
            em.persist(i033);
            em.persist(i034);
            em.persist(i035);
            em.persist(i036);
            em.persist(i037);
            em.persist(i038);
            em.persist(i039);
            em.persist(i040);
            em.persist(i041);
            em.persist(i042);
            em.persist(i043);
            em.persist(i044);
            em.persist(i045);
            em.persist(i046);
            em.persist(i047);
            em.persist(i048);
            em.persist(i049);  //  ==> ajout Manu


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
          em.persist(p007); //  ==>ajout Manu
          em.persist(p05);
          em.persist(p051);
          em.persist(p06);
          em.persist(p07);
          em.persist(p08);
          em.persist(p081);
            em.persist(p09);
            em.persist(p10);
            em.persist(p11);
            em.persist(p12);
            em.persist(p13);
            em.persist(p14);
            em.persist(p15);
            em.persist(p16);
            em.persist(p17);
            em.persist(p18);
            em.persist(p30);
            em.persist(p31);
            em.persist(p32);
            em.persist(p33);
            em.persist(p34);
            em.persist(p35);
            em.persist(p36);
            em.persist(p37);
            em.persist(p38);
            em.persist(p39);
            em.persist(p40);
            em.persist(p41);
            em.persist(p42);
            em.persist(p43);
            em.persist(p50);
            em.persist(p51);
            em.persist(p52);
            em.persist(p53);
            em.persist(p54);
            em.persist(p55);
            em.persist(p56);
            em.persist(p60);
            em.persist(p61);
            em.persist(p62);
            em.persist(p63);
            em.persist(p64);
            em.persist(p65);
            em.persist(p66);
            em.persist(p67);
            em.persist(p68);//  ==>ajout Manu

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
        em.persist(r01);
        em.persist(r02);
        em.persist(r03);
        em.persist(r04);
        em.persist(r05);

        // TVA
        em.persist(tv01);
        em.persist(tv02);
        em.persist(tv03);
        em.persist(tv04);

        // TYPEREGLEMENT
        em.persist(tr01);
        em.persist(tr02);
        em.persist(tr03);

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
