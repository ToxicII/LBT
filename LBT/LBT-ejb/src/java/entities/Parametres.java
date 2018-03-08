
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Parametres implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private String descripParam;
    
    @OneToMany(mappedBy = "parametres")
    private Collection<Utilisateur> utilisateurs;
    
    @OneToMany(mappedBy = "parametre")
    private Collection<Emplacement> emplacements;
    
    @OneToMany(mappedBy = "parametres")
    private Collection<Produit> produits;

    public Parametres() {
    utilisateurs = new ArrayList<>();
    emplacements = new ArrayList<>();
    produits = new ArrayList<>();
    }

    public Parametres(Long id, String descripParam) {
        this();
        this.id = id;
        this.descripParam = descripParam;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripParam() {
        return descripParam;
    }

    public void setDescripParam(String descripParam) {
        this.descripParam = descripParam;
    }

    public Collection<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Collection<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public Collection<Emplacement> getEmplacements() {
        return emplacements;
    }

    public void setEmplacements(Collection<Emplacement> emplacements) {
        this.emplacements = emplacements;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
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
//        if (!(object instanceof Parametres)) {
//            return false;
//        }
//        Parametres other = (Parametres) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "entities.Parametres[ id=" + id + " ]";
    }
    
}
