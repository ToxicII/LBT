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
 * @author Manuel_cdi113
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
        @ManyToMany        
        private Collection<Produit> produits;        
        @ManyToMany        
        private Collection<Ingredient> ingredients;        
        @ManyToMany        
        private Collection<Parametres> parametres;   
        @OneToMany
        private Collection<LigneCommande> ligneCommandes;    
        @ManyToMany        
        private Collection<ChoixClient> choixClients;         
        @ManyToMany        
        private Collection<CategorieFormule> categorieFormules;   
        @ManyToOne
        private TVA tva;
        @OneToMany
        private Collection<Propriete> proprietes;    
        @ManyToOne
        private CategorieCarte categorieCarte;       
        @ManyToMany        
        private Collection<Promotion> promotions;   
        //=========== Dependances ================================
////////////////////////    CONSTRUCT       ///////////////////////
    public Produit() {
         produits = new ArrayList();
         ingredients = new ArrayList();
         parametres = new ArrayList();
         ligneCommandes = new ArrayList();
         choixClients = new ArrayList();
         categorieFormules = new ArrayList();
         proprietes = new ArrayList();
         promotions = new ArrayList();
    }

    public Produit(String nom, String description, float prixHT, String image) {
         this();
        this.nom = nom;
        this.description = description;
        this.prixHT = prixHT;
        this.image = image;
    }

    public Produit(String nom, String description, float prixHT, Collection<Produit> produits, Collection<Ingredient> ingredients, Collection<Parametres> parametres, Collection<LigneCommande> ligneCommandes, Collection<ChoixClient> choixClients, Collection<CategorieFormule> categorieFormules, TVA tva, Collection<Propriete> proprietes, CategorieCarte categorieCarte, Collection<Promotion> promotions, String image) {
        this.nom = nom;
        this.description = description;
        this.prixHT = prixHT;
        this.produits = produits;
        this.ingredients = ingredients;
        this.parametres = parametres;
        this.ligneCommandes = ligneCommandes;
        this.choixClients = choixClients;
        this.categorieFormules = categorieFormules;
        this.tva = tva;
        this.proprietes = proprietes;
        this.categorieCarte = categorieCarte;
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

    public Collection<Produit> getProduits() {
        return produits;
    }
    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
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

    public Collection<ChoixClient> getChoixClients() {
        return choixClients;
    }
    public void setChoixClients(Collection<ChoixClient> choixClients) {
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

    public CategorieCarte getCategorieCarte() {
        return categorieCarte;
    }
    public void setCategorieCarte(CategorieCarte categorieCarte) {
        this.categorieCarte = categorieCarte;
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
