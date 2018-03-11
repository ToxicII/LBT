package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author Manuel_cdi113
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "entities.Emplacement.rechercheCommandeTable",
            query = "select c.id from Emplacement e join e.commandes c where "
                    + "e.numero = :paramTableAFusionner and c.parametre <> 'reglee' "),
})
public class Emplacement implements Serializable {
    private static final long serialVersionUID = 1L;    
    @Id
    private Long numero;
    @Column(nullable=false)
    private String secteur; //  ATTENTION   // "secteur" est un mot réservé SQL...
        //=========== Dependances ================================
        @ManyToMany(mappedBy = "emplacements")
        private Collection<Utilisateur> utilisateurs;
        @ManyToOne     // (mappedBy = sur classe "parametres" )
        private Parametres parametre;
        @OneToMany(mappedBy = "emplacement")
        private Collection<Commande> commandes;
        //=========== Dependances ================================
////////////////////////    CONSTRUCT       ///////////////////////
    public Emplacement() {
        utilisateurs = new ArrayList();
        commandes = new ArrayList();
    }

    public Emplacement(Long numero, String zone) {
        utilisateurs = new ArrayList();
        commandes = new ArrayList();
        this.numero = numero;
        this.secteur = zone;
    }

    public Emplacement(Long numero, String secteur, Collection<Utilisateur> utilisateurs, Parametres parametre, Collection<Commande> commandes) {
        this.numero = numero;
        this.secteur = secteur;
        this.utilisateurs = utilisateurs;
        this.parametre = parametre;
        this.commandes = commandes;
    }
////////////////////////    CONSTRUCT       ///////////////////////
////////////////////////    GET SET      //////////////////////////
    public Collection<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }
    public void setUtilisateurs(Collection<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
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
