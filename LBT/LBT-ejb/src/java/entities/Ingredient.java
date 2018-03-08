package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Manuel_R_cdi113
 */
@Entity
public class Ingredient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(nullable=false,unique=true)
    private String nom;
    @Column(nullable=false)
    private String description;
        //=========== Dependances ================================
        @ManyToMany     //mappedBy à mettre sur PROMOTION
        private Collection<LigneCommande> ligneCommandes;
        @ManyToMany(mappedBy = "ingredients")
        private Collection<Produit> produits;        
        //=========== Dependances ================================
////////////////////////    CONSTRUCT       ///////////////////////
    public Ingredient() {
    }

    public Ingredient(String nom, String description) {
        ligneCommandes = new ArrayList();
        this.nom = nom;
        this.description = description;
    }

    public Ingredient(String nom, String description, Collection<LigneCommande> ligneCommandes, Collection<Produit> produits) {
        this.nom = nom;
        this.description = description;
        this.ligneCommandes = ligneCommandes;
        this.produits = produits;
    }
////////////////////////    CONSTRUCT       ///////////////////////
////////////////////////    GET SET      //////////////////////////
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }
    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }
    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }
    

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
////////////////////////    GET SET      //////////////////////////
////////////////////////    STRING       //////////////////////////    
    @Override
    public String toString() {
        return "Ingredient : " + nom + " ; ";
    }
////////////////////////    STRING       ////////////////////////// 
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (nom != null ? nom.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the nom fields are not set
//        if (!(object instanceof Ingredient)) {
//            return false;
//        }
//        Ingredient other = (Ingredient) object;
//        if ((this.nom == null && other.nom != null) || (this.nom != null && !this.nom.equals(other.nom))) {
//            return false;
//        }
//        return true;
//    }
////////////////////////    CAUTION       //////////////////////////
}
