
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class CategorieFormule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String nom;

    @ManyToOne
    private Formule formule;
    
    @ManyToMany
    private Collection<Produit> produits;

     public CategorieFormule() {
          produits = new ArrayList();
     }

     public CategorieFormule(String nom, Formule formule, Collection<Produit> produits) {
          this.nom = nom;
          this.formule = formule;
          this.produits = produits;
     }

     public String getNom() {
          return nom;
     }

     public void setNom(String nom) {
          this.nom = nom;
     }

     public Formule getFormule() {
          return formule;
     }

     public void setFormule(Formule formule) {
          this.formule = formule;
     }

     public Collection<Produit> getProduits() {
          return produits;
     }

     public void setProduits(Collection<Produit> produits) {
          this.produits = produits;
     }
        

    /*@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategorieFormule)) {
            return false;
        }
        CategorieFormule other = (CategorieFormule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }*/

    @Override
    public String toString() {
        return nom;
    }
    
}
