package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Manuel_cdi113
 */
@Entity
public class Propriete implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String nom;
    @Column(nullable=false)
    private String valeur;
    private String unite;
        //=========== Dependances ================================  
        @ManyToOne
        private Produit produit;      
        //=========== Dependances ================================
////////////////////////    CONSTRUCT       ///////////////////////
    public Propriete() {
    }

    public Propriete(String nom, String valeur, String unite) {
        this.nom = nom;
        this.valeur = valeur;
        this.unite = unite;
    }

    public Propriete(String nom, String valeur, String unite, Produit produit) {
        this.nom = nom;
        this.valeur = valeur;
        this.unite = unite;
        this.produit = produit;
    }
////////////////////////    CONSTRUCT       ///////////////////////
////////////////////////    GET SET      //////////////////////////

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }    
    
    public String getValeur() {
        return valeur;
    }
    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public String getUnite() {
        return unite;
    }
    public void setUnite(String unite) {
        this.unite = unite;
    }

    public Produit getProduit() {
        return produit;
    }
    public void setProduit(Produit produit) {
        this.produit = produit;
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
//        return "Propriete : " + nom + " ; " ;
        return nom + " : " + valeur + " " + unite;
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
//        if (!(object instanceof Propriete)) {
//            return false;
//        }
//        Propriete other = (Propriete) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
////////////////////////    CAUTION       //////////////////////////
}
