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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({
     @NamedQuery(name = "entities.Formule.selectCurrentFormules",
             query = "SELECT f FROM Formule f WHERE "                     
                     + "f.jourDebut <= :currentD AND "
                     + "f.jourFin >= :currentF"),
})
public class Formule implements Serializable {

     private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @Column(nullable = false)
     private String nom;
     @Column(nullable = false)
     private float PrixHT;
     private String description;
     private int jourDebut;
     private int jourFin;
     @Temporal(TemporalType.TIME)
     private Date heureDebut;
     @Temporal(TemporalType.TIME)
     private Date heureFin;

     @OneToMany(mappedBy = "formule")
     private Collection<CategorieFormule> categorieFormules;
     
     @OneToMany(mappedBy = "formule")
     private Collection<LigneCommande> ligneCommandes;

     @ManyToOne
     private TVA tva;

     public Formule() {
          categorieFormules = new ArrayList();
          ligneCommandes = new ArrayList();
     }

     public Formule(String nom, float PrixHT, String description, int jourDebut, int jourFin, Date heureDebut, Date heureFin) {
          this();
          this.nom = nom;
          this.PrixHT = PrixHT;
          this.description = description;
          this.jourDebut = jourDebut;
          this.jourFin = jourFin;
          this.heureDebut = heureDebut;
          this.heureFin = heureFin;
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

    public float getPrixHT() {
        return PrixHT;
    }

    public void setPrixHT(float PrixHT) {
        this.PrixHT = PrixHT;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getJourDebut() {
        return jourDebut;
    }

    public void setJourDebut(int jourDebut) {
        this.jourDebut = jourDebut;
    }

    public int getJourFin() {
        return jourFin;
    }

    public void setJourFin(int jourFin) {
        this.jourFin = jourFin;
    }

    public Date getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

    public Collection<CategorieFormule> getCategorieFormules() {
        return categorieFormules;
    }

    public void setCategorieFormules(Collection<CategorieFormule> categorieFormules) {
        this.categorieFormules = categorieFormules;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public TVA getTva() {
        return tva;
    }

    public void setTva(TVA tva) {
        this.tva = tva;
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
      if (!(object instanceof Formule)) {
      return false;
      }
      Formule other = (Formule) object;
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
