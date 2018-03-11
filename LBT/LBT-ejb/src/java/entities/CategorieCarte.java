package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Manuel_cdi113
 */
@Entity
public class CategorieCarte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String nom;
        //=========== Dependances ================================
        @ManyToMany(mappedBy = "categorieCartes")
        private Collection<Carte> cartes;
        @OneToMany(mappedBy = "categorieCarte")
        private Collection<Produit> produits;
        //=========== Dependances ================================
///////////////////////     CONSTRUCT       //////////////////////////
    public CategorieCarte() {
        cartes = new ArrayList();
        produits = new ArrayList();
    }

    public CategorieCarte(String nom) {
        this();
        this.nom = nom;
    }

    public CategorieCarte(String nom, Collection<Carte> cartes, Collection<Produit> produits) {
        this.nom = nom;
        this.cartes = cartes;
        this.produits = produits;
    }
////////////////////////    CONSTRUCT       ///////////////////////
////////////////////////    GET SET      //////////////////////////
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Collection<Carte> getCartes() {
        return cartes;
    }
    public void setCartes(Collection<Carte> cartes) {
        this.cartes = cartes;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }
    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }
////////////////////////    GET SET      //////////////////////////
////////////////////////    STRING       //////////////////////////
    @Override
    public String toString() {
        return "CategorieCarte{" + "nom=" + nom + ", cartes=" + cartes + 
                ", produits=" + produits + '}';
    }
////////////////////////    STRING       //////////////////////////
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof CategorieCarte)) {
//            return false;
//        }
//        CategorieCarte other = (CategorieCarte) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
////////////////////////    CAUTION       //////////////////////////
}
