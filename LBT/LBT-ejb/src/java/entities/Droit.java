
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Droit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeDroit;
    private String descriptionDroit;

    @ManyToMany(mappedBy = "droits")
    private Collection<Utilisateur> utilisateurs;

    public Droit() {
        utilisateurs = new ArrayList();
    }

    public Droit(String descripDroit) {
        this();        
        this.descriptionDroit = descripDroit;
    }

    public Long getTypeDroit() {
        return typeDroit;
    }

    public void setTypeDroit(Long typeDroit) {
        this.typeDroit = typeDroit;
    }

    public String getDescriptionDroit() {
        return descriptionDroit;
    }

    public void setDescriptionDroit(String descriptionDroit) {
        this.descriptionDroit = descriptionDroit;
    }

    public Collection<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Collection<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
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
//        if (!(object instanceof Droit)) {
//            return false;
//        }
//        Droit other = (Droit) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return descriptionDroit;
    }
    
}
