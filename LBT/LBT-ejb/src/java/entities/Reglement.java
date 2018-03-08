// G@P
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class Reglement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateReglement;
    private float montant;

    @ManyToOne
    private Commande commande;

    @ManyToOne
    private TypeReglement typeReglement;

    public Reglement() {
    }

    public Reglement(Date dateReglement, float montant) {
        this.dateReglement = dateReglement;
        this.montant = montant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateReglement() {
        return dateReglement;
    }

    public void setDateReglement(Date dateReglement) {
        this.dateReglement = dateReglement;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public TypeReglement getTypeReglement() {
        return typeReglement;
    }

    public void setTypeReglement(TypeReglement typeReglement) {
        this.typeReglement = typeReglement;
    }

    @Override
    public String toString() {
        return "entities.Reglement[ date : " + dateReglement + "montant : " + montant
                + "commande :" + commande + "type de reglement :" + typeReglement + " ]";
    }

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Reglement)) {
//            return false;
//        }
//        Reglement other = (Reglement) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
}
