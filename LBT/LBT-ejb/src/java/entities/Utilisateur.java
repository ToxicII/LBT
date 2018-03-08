
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String code;
    private String nom;
    private String prenom;
    
    @ManyToMany
    private Collection<Droit> droits;
    
    @ManyToMany(mappedBy= "utilisateurs")
    private Collection<Emplacement> emplacements;

    @ManyToOne
    private Parametres parametres;
    
    public Utilisateur() {
        droits = new ArrayList<>();
        emplacements = new ArrayList<>();
    }

    public Utilisateur(String code, String nom, String prenom, Parametres parametres) {
        this();
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.parametres = parametres;
    }

    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Collection<Droit> getDroits() {
        return droits;
    }

    public void setDroits(Collection<Droit> droits) {
        this.droits = droits;
    }

    public Collection<Emplacement> getEmplacements() {
        return emplacements;
    }

    public void setEmplacements(Collection<Emplacement> emplacements) {
        this.emplacements = emplacements;
    }

    public Parametres getParametres() {
        return parametres;
    }

    public void setParametres(Parametres parametres) {
        this.parametres = parametres;
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
//        if (!(object instanceof Utilisateur)) {
//            return false;
//        }
//        Utilisateur other = (Utilisateur) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "entities.User[ id=";
    }
    
}
