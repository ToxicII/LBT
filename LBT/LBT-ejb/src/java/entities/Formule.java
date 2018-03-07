
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Formule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String nom;
    
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
    
    @ManyToOne
    private TVA tva;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "entities.Formule[ id=" + id + " ]";
    }
    
}
