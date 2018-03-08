package sessions;

import entities.Emplacement;
import entities.Ingredient;
import entities.Produit;
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

    public void jeuxEssaiTable() {
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
        
        Produit p01 = new Produit("Magret de canard", 
                "belle pièce poelée nappée de miel", 11.9F, null);
            Produit p011 = new Produit("Pièce de canard", 
                    "composant du magret de canard", 0F, null);
            Produit p012 = new Produit("Haricots verts", 
                    "Accompagnement H-V", 0F, null);
            Produit p013 = new Produit("Gratin dauphinois", 
                    "Accompagnement gratin", 0F, null);
            Produit p014 = new Produit("Pollenta", 
                    "Accompagnement Poll.", 0F, null);
                p01.getProduitEnfants().add(p011);
                p01.getProduitEnfants().add(p012);
                p01.getProduitEnfants().add(p013);
                p01.getProduitEnfants().add(p014);
                    Ingredient i01 = new Ingredient("magret", "canard");
                    Ingredient i02 = new Ingredient("miel", "accomp. cuisson");
                    Ingredient i03 = new Ingredient("haricots verts", "accompagnement légumes");
                    Ingredient i04 = new Ingredient("haricots blancs", "accompagnement légumes");
                    Ingredient i05 = new Ingredient("pomme de terre", "accompagnement");
                    Ingredient i06 = new Ingredient("pollenta", "accompagnement");
                    Ingredient i07 = new Ingredient("oranges pressées", "accompagnement déglaçage");
                    Ingredient i08 = new Ingredient("béchamel", "accompagnement sauce");
                    Ingredient i09 = new Ingredient("ementhal", "accompagnement sauce");
                        p011.getIngredients().add(i01);
                        p011.getIngredients().add(i02);
                        p011.getIngredients().add(i07);
                        p012.getIngredients().add(i03);
                        p013.getIngredients().add(i05);
                        p013.getIngredients().add(i08);
                        p013.getIngredients().add(i09);
        Produit p02 = new Produit("Bavette d'Aloyo", 
                "belle pièce de boeuf et sa sauce", 12.6F, null);
            Produit p021 = new Produit("Bavette", 
                    "pièce de boeuf", 0F, null);
                p02.getProduitEnfants().add(p021);
                p02.getProduitEnfants().add(p012);
                p02.getProduitEnfants().add(p013);
                p02.getProduitEnfants().add(p014);
                    Ingredient i10 = new Ingredient("bavette", "boeuf");
                    Ingredient i11 = new Ingredient("oignons", "émincés");
                        p02.getIngredients().add(i10);
                        p02.getIngredients().add(i11);
    }
}
