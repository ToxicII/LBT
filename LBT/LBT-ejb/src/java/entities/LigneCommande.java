// G@P

package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int quantite;
    private float prixHT;
    private float tauxTVA;
    
    @ManyToOne
    private Commande commande;
    
    

    public LigneCommande() {
    }

    public LigneCommande(int quantite, float prixHT, float tauxTVA) {
        this.quantite = quantite;
        this.prixHT = prixHT;
        this.tauxTVA = tauxTVA;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(float prixHT) {
        this.prixHT = prixHT;
    }

    public float getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(float tauxTVA) {
        this.tauxTVA = tauxTVA;
    }
    
      @Override
    public String toString() {
        return "entities.LigneCommande[ quantité : " +quantite+"prix HT : " +prixHT+ "TVA :" +tauxTVA+ "commande :"+commande+"]";
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
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
//        if (!(object instanceof LigneCommande)) {
//            return false;
//        }
//        LigneCommande other = (LigneCommande) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    
  

}
