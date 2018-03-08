// G@P
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCommande;    

    @OneToMany(mappedBy = "commande")
    private Collection<LigneCommande> ligneCommandes;

    @OneToMany(mappedBy = "commande")
    private Collection<Reglement> reglements;
    
    @ManyToOne
    private Parametres parametre;
   
    public Commande() {
        ligneCommandes = new ArrayList<>();
        reglements = new ArrayList<>();
    }

    public Commande(Date date) {
        this();
        this.dateCommande = date;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public Collection<Reglement> getReglements() {
        return reglements;
    }

    public void setReglements(Collection<Reglement> reglements) {
        this.reglements = reglements;
    }
    
     public Parametres getParametre() {
        return parametre;
    }

    public void setParametre(Parametres parametre) {
        this.parametre = parametre;
    }

    @Override
    public String toString() {
        return "entities.Commande[ date : " + dateCommande + "Ligne de commande : " + ligneCommandes + "reglement :" + reglements + " ]";
    }

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
//        if (!(object instanceof Commande)) {
//            return false;
//        }
//        Commande other = (Commande) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
}
