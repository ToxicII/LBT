package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TVA implements Serializable {

     private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long codeTVA;

     private float tauxTVA;

     @OneToMany(mappedBy = "tva")
     private Collection<Formule> formules;

     @OneToMany(mappedBy = "tva")
     private Collection<Produit> produits;

     public TVA() {
          formules = new ArrayList();
          produits = new ArrayList();
     }

     public TVA(float tauxTVA) {
          this();
          this.tauxTVA = tauxTVA;
     }
          
     public TVA(float tauxTVA, Collection<Formule> formules, Collection<Produit> produits) {        
          this.tauxTVA = tauxTVA;
          this.formules = formules;
          this.produits = produits;
     }

     public float getTauxTVA() {
          return tauxTVA;
     }

     public void setTauxTVA(float tauxTVA) {
          this.tauxTVA = tauxTVA;
     }

     public Collection<Formule> getFormules() {
          return formules;
     }

     public void setFormules(Collection<Formule> formules) {
          this.formules = formules;
     }

     public Collection<Produit> getProduits() {
          return produits;
     }

     public void setProduits(Collection<Produit> produits) {
          this.produits = produits;
     }

     public Long getCodeTVA() {
          return codeTVA;
     }

     public void setCodeTVA(Long codeTVA) {
          this.codeTVA = codeTVA;
     }

     /*@Override
      public int hashCode() {
      int hash = 0;
      hash += (codeTVA != null ? codeTVA.hashCode() : 0);
      return hash;
      }

      @Override
      public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the codeTVA fields are not set
      if (!(object instanceof TVA)) {
      return false;
      }
      TVA other = (TVA) object;
      if ((this.codeTVA == null && other.codeTVA != null) || (this.codeTVA != null && !this.codeTVA.equals(other.codeTVA))) {
      return false;
      }
      return true;
      }*/
     @Override
     public String toString() {
          return tauxTVA + "";
     }

}
