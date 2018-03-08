
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
    private int typeDroit;
    private String descripDroit;

    @ManyToMany(mappedBy = "droits")
    private Collection<Utilisateur> utilisateurs;

    public Droit() {
        utilisateurs = new ArrayList<>();
    }

    public Droit(int typeDroit, String descripDroit) {
        this();
        this.typeDroit = typeDroit;
        this.descripDroit = descripDroit;
    }

    public int getTypeDroit() {
        return typeDroit;
    }

    public void setTypeDroit(int typeDroit) {
        this.typeDroit = typeDroit;
    }

    public String getDescripDroit() {
        return descripDroit;
    }

    public void setDescripDroit(String descripDroit) {
        this.descripDroit = descripDroit;
    }

    public Collection<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Collection<Utilisateur> users) {
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
        return "entities.Droit[ id=";
    }
    
}
