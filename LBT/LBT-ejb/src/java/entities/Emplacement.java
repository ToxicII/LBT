package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Manuel_cdi113
 */
@Entity
public class Emplacement implements Serializable {
    private static final long serialVersionUID = 1L;    
    @Id
    private Long numero;
    @Column(nullable=false)
    private String secteur; //  ATTENTION   // "secteur" est un mot réservé SQL...
        //=========== Dependances ================================
        @ManyToMany
        private Collection<User> users;
        @ManyToOne
        private Parametres parametre;
        @OneToMany
        private Collection<Commande> commandes;
        //=========== Dependances ================================
////////////////////////    CONSTRUCT       ///////////////////////
    public Emplacement() {
    }

    public Emplacement(Long numero, String zone) {
        this.numero = numero;
        this.secteur = zone;
    }

    public Emplacement(Long numero, String secteur, Collection<User> users, Parametres parametre, Collection<Commande> commandes) {
        this.numero = numero;
        this.secteur = secteur;
        this.users = users;
        this.parametre = parametre;
        this.commandes = commandes;
    }
////////////////////////    CONSTRUCT       ///////////////////////
////////////////////////    GET SET      //////////////////////////
    public Collection<User> getUsers() {
        return users;
    }
    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    public Parametres getParametre() {
        return parametre;
    }
    public void setParametre(Parametres parametre) {
        this.parametre = parametre;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }
    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

    public String getSecteur() {
        return secteur;
    }
    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public Long getNumero() {
        return numero;
    }
    public void setNumero(Long Numero) {
        this.numero = Numero;
    }
////////////////////////    GET SET      //////////////////////////
////////////////////////    STRING       //////////////////////////
    @Override
    public String toString() {
        return "Table N° " + numero + ", secteur "+ secteur +" ; ";
    }
////////////////////////    STRING       //////////////////////////
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (Numero != null ? Numero.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the Numero fields are not set
//        if (!(object instanceof Emplacement)) {
//            return false;
//        }
//        Emplacement other = (Emplacement) object;
//        if ((this.Numero == null && other.Numero != null) || (this.Numero != null && !this.Numero.equals(other.Numero))) {
//            return false;
//        }
//        return true;
//    }
////////////////////////    CAUTION       //////////////////////////
}
