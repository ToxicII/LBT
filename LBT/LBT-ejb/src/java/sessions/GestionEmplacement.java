package sessions;

import entities.CategorieCarte;
import entities.Emplacement;
import entities.Ingredient;
import entities.Produit;
import entities.Propriete;
import javax.ejb.Stateless;

/**
 *
 * @author Manuel_R_cdi113
 */
@Stateless
public class GestionEmplacement implements GestionEmplacementLocal {

    @Override
    public void attribuerTable(Emplacement table) {
        //  Méthode pour affecter à une session 
        //  "tabletteCommandeClient" la table choisie
        //  

    }

    @Override
    public void fusionnerTable(Emplacement table) {
        //  Méthode pour fusionner la commande d'une table à 
        //  la session "tabletteCommandeClient" sur table existante
        //  1°)trouver commande non réglée sur table choisie
        //  2°)for each LdC sur commande récuppérer ==> insert 
        //  into commande table si commande existante else dépôt direct

    }

    @Override
    public void jeuxEssaiTable() {
        //============================================================  EMPLACEMENTS
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
        
        //============================================================  PRODUITS
        Produit p01 = new Produit("Magret de canard", 
                "belle pièce poelée nappée de miel", 11.9F, null);
            Produit p011 = new Produit("Pièce de canard", 
                    "composant du magret de canard", 0F, null);
            Produit p001 = new Produit("Pommes frites", 
                    "Accompagnement frite", 0F, null);
            Produit p002 = new Produit("Haricots verts", 
                    "Accompagnement H-V", 0F, null);
            Produit p003 = new Produit("Gratin dauphinois", 
                    "Accompagnement gratin", 0F, null);
            Produit p004 = new Produit("Pollenta", 
                    "Accompagnement Poll.", 0F, null);
            Produit p005 = new Produit("Flageolets", 
                    "Accompagnement haricots blancs", 0F, null);
            Produit p006 = new Produit("Riz basmati", 
                    "Accompagnement riz blancs", 0F, null);
        Produit p02 = new Produit("Bavette d'Aloyo", 
                "belle pièce de boeuf et sa sauce", 12.6F, null);
            Produit p021 = new Produit("Bavette", 
                    "pièce de boeuf", 0F, null);

        Produit p03 = new Produit("Tournedos de boeuf", 
                "belle pièce de boeuf et son accompagnement", 12.9F, null);  
            Produit p031 = new Produit("Tournedos", 
                    "pièce de boeuf", 0F, null);            
                //============================================================  Collect° PRODUITS
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
                    //============================================================  INGREDIENTS
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
                        //============================================================  Collect° INGREDIENTS
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
                                    
        //============================================================  CATEGORIE CARTE
        CategorieCarte cc01 = new CategorieCarte("Appéritifs & Digestifs");
        CategorieCarte cc02 = new CategorieCarte("Boissions chaudes");
        CategorieCarte cc03 = new CategorieCarte("Boissions fraiches");
        CategorieCarte cc04 = new CategorieCarte("Vins");
        CategorieCarte cc05 = new CategorieCarte("Entrées");
        CategorieCarte cc06 = new CategorieCarte("Grandes salades");
        CategorieCarte cc07 = new CategorieCarte("Plats");
        CategorieCarte cc08 = new CategorieCarte("Fromages");
        CategorieCarte cc09 = new CategorieCarte("Desserts");
            cc07.getProduits().add(p01);
            cc07.getProduits().add(p02);
            cc07.getProduits().add(p03);
        //============================================================  PROPRIETE
        Propriete pPrdt001 = new Propriete("cuisson", "bleu", null);
        Propriete pPrdt002 = new Propriete("cuisson", "saignant", null);
        Propriete pPrdt003 = new Propriete("cuisson", "à point", null);
             
            //============================================================  Collect° PROPRIETE/Produits
            p01.getProprietes().add(pPrdt001);
            p01.getProprietes().add(pPrdt002);
            p01.getProprietes().add(pPrdt003);
            
            p02.getProprietes().add(pPrdt001);
            p02.getProprietes().add(pPrdt002);
            p02.getProprietes().add(pPrdt003);
            
            p03.getProprietes().add(pPrdt001);
            p03.getProprietes().add(pPrdt002);
            p03.getProprietes().add(pPrdt003);
            
            
    }
}
