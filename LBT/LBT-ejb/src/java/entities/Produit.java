package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Manuel_R_cdi113
 */
@Entity
public class Produit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reference;    
    @Column(nullable=false,unique=true)
    private String nom;
    @Column(nullable=false)
    private String description;
    @Column(nullable=false)
    private float prixHT;
        //=========== Dependances ================================
                // TO BE CHECKED !!
                @ManyToMany(mappedBy = "produitParents")        
                private Collection<Produit> produitEnfants;        
                @ManyToMany        
                private Collection<Produit> produitParents;        
        @ManyToMany     //      mappé in Ingredient        
        private Collection<Ingredient> ingredients;        
        @ManyToMany     //    to mappedBy in Parametres
        private Collection<Parametres> parametres;   
        @OneToMany(mappedBy = "produit")
        private Collection<LigneCommande> ligneCommandes;    
        @ManyToMany     //    to mappedBy in ChoixClient
        private Collection<ChoixClient> choixClients;         
        @ManyToMany(mappedBy = "produits")             
        private Collection<CategorieFormule> categorieFormules;   
        @ManyToOne
        private TVA tva;
        @OneToMany(mappedBy = "produit")
        private Collection<Propriete> proprietes;    
        @ManyToMany(mappedBy = "produits")
        private Collection<CategorieCarte> categorieCartes;       
        @ManyToMany(mappedBy = "produits")
        private Collection<Promotion> promotions;   
        //=========== Dependances ================================
////////////////////////    CONSTRUCT       ///////////////////////
    public Produit() {
        produitEnfants = new ArrayList();
        ingredients = new ArrayList();
        parametres = new ArrayList();
        ligneCommandes = new ArrayList();
        choixClients = new ArrayList();
        categorieFormules = new ArrayList();
        proprietes = new ArrayList();
        promotions = new ArrayList();
    }

    public Produit(String nom, String description, float prixHT, String image) {
        produitEnfants = new ArrayList();
        ingredients = new ArrayList();
        parametres = new ArrayList();
        ligneCommandes = new ArrayList();
        choixClients = new ArrayList();
        categorieFormules = new ArrayList();
        proprietes = new ArrayList();
        promotions = new ArrayList();
        this.nom = nom;
        this.description = description;
        this.prixHT = prixHT;
        this.image = image;
    }

    public Produit(String nom, String description, float prixHT, Collection<Produit> produitEnfants, Collection<Ingredient> ingredients, Collection<Parametres> parametres, Collection<LigneCommande> ligneCommandes, Collection<ChoixClient> choixClients, Collection<CategorieFormule> categorieFormules, TVA tva, Collection<Propriete> proprietes, Collection<CategorieCarte> categorieCartes, Collection<Promotion> promotions, String image) {
        this.nom = nom;
        this.description = description;
        this.prixHT = prixHT;
        this.produitEnfants = produitEnfants;
        this.ingredients = ingredients;
        this.parametres = parametres;
        this.ligneCommandes = ligneCommandes;
        this.choixClients = choixClients;
        this.categorieFormules = categorieFormules;
        this.tva = tva;
        this.proprietes = proprietes;
        this.categorieCartes = categorieCartes;
        this.promotions = promotions;
        this.image = image;
    }
////////////////////////    CONSTRUCT       ///////////////////////
////////////////////////    GET SET      //////////////////////////
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrixHT() {
        return prixHT;
    }
    public void setPrixHT(float prixHT) {
        this.prixHT = prixHT;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    private String image;
    

    public Long getReference() {
        return reference;
    }
    public void setReference(Long reference) {
        this.reference = reference;
    }

    public Collection<Produit> getProduitEnfants() {
        return produitEnfants;
    }
    public void setProduitEnfants(Collection<Produit> produitEnfants) {
        this.produitEnfants = produitEnfants;
    }

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }
    public void setIngredients(Collection<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Collection<Parametres> getParametres() {
        return parametres;
    }
    public void setParametres(Collection<Parametres> parametres) {
        this.parametres = parametres;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }
    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public Collection<ChoixClient> getOptions() {
        return choixClients;
    }
    public void setOptions(Collection<ChoixClient> options) {
        this.choixClients = choixClients;
    }

    public Collection<CategorieFormule> getCategorieFormules() {
        return categorieFormules;
    }
    public void setCategorieFormules(Collection<CategorieFormule> categorieFormules) {
        this.categorieFormules = categorieFormules;
    }

    public TVA getTva() {
        return tva;
    }
    public void setTva(TVA tva) {
        this.tva = tva;
    }

    public Collection<Propriete> getProprietes() {
        return proprietes;
    }
    public void setProprietes(Collection<Propriete> proprietes) {
        this.proprietes = proprietes;
    }

    public Collection<CategorieCarte> getCategorieCartes() {
        return categorieCartes;
    }
    public void setCategorieCartes(Collection<CategorieCarte> categorieCartes) {
        this.categorieCartes = categorieCartes;
    }

    public Collection<Promotion> getPromotions() {
        return promotions;
    }
    public void setPromotions(Collection<Promotion> promotions) {
        this.promotions = promotions;
    }    
////////////////////////    GET SET      //////////////////////////
////////////////////////    STRING       //////////////////////////
    @Override
    public String toString() {
        return "Produit{" + "reference=" + reference + ", nom=" + nom + 
                ", description=" + description + ", prixHT=" + prixHT + ", }";
    }
////////////////////////    STRING       //////////////////////////
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (reference != null ? reference.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the reference fields are not set
//        if (!(object instanceof Produit)) {
//            return false;
//        }
//        Produit other = (Produit) object;
//        if ((this.reference == null && other.reference != null) || (this.reference != null && !this.reference.equals(other.reference))) {
//            return false;
//        }
//        return true;
//    }
////////////////////////    CAUTION       //////////////////////////
}
