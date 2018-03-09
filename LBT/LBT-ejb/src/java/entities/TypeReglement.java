// G@P

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
public class TypeReglement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @OneToMany(mappedBy = "typeReglement")
    private Collection<Reglement> reglements;

    public TypeReglement() {
        reglements = new ArrayList<>();
    }

    public TypeReglement(String type) {
        this();
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Collection<Reglement> getReglements() {
        return reglements;
    }

    public void setReglements(Collection<Reglement> reglements) {
        this.reglements = reglements;
    }

    @Override
    public String toString() {
        return "entities.TypeReglement[ Type : " +type+"reglement : "+reglements+" ]";
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
//        if (!(object instanceof TypeReglement)) {
//            return false;
//        }
//        TypeReglement other = (TypeReglement) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
}
