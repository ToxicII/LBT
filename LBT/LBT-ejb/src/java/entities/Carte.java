package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Carte implements Serializable {

     private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @Column(nullable = false)
     private String nom;
     @Temporal(TemporalType.DATE)
     private Date dateDebut;
     @Temporal(TemporalType.DATE)
     private Date dateFin;

     @ManyToMany
     private Collection<CategorieCarte> categorieCartes;

     public Carte() {
         categorieCartes = new ArrayList();
     }

     public Carte(String nom, Date dateDebut, Date dateFin) {
          this();
          this.nom = nom;
          this.dateDebut = dateDebut;
          this.dateFin = dateFin;
     }          

     public Carte(String nom, Date dateDebut, Date dateFin, Collection<CategorieCarte> categorieCartes) {
          this();
          this.nom = nom;
          this.dateDebut = dateDebut;
          this.dateFin = dateFin;
          this.categorieCartes = categorieCartes;
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getNom() {
          return nom;
     }

     public void setNom(String nom) {
          this.nom = nom;
     }

     public Date getDateDebut() {
          return dateDebut;
     }

     public void setDateDebut(Date dateDebut) {
          this.dateDebut = dateDebut;
     }

     public Date getDateFin() {
          return dateFin;
     }

     public void setDateFin(Date dateFin) {
          this.dateFin = dateFin;
     }

     public Collection<CategorieCarte> getCategorieCartes() {
          return categorieCartes;
     }

     public void setCategorieCartes(Collection<CategorieCarte> categorieCartes) {
          this.categorieCartes = categorieCartes;
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
      if (!(object instanceof Carte)) {
      return false;
      }
      Carte other = (Carte) object;
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
