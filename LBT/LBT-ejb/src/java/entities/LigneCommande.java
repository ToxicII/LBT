// G@P

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
import javax.persistence.OneToMany;

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
    
    @ManyToOne
    private LigneCommande ligneCommandeParent;
    @OneToMany(mappedBy = "ligneCommandeParent")
    private Collection <LigneCommande> ligneCommandeEnfants;
    
    @ManyToOne
    private Produit produit;
    
    @ManyToMany
    private Collection<Ingredient> ingredients;
    
    @ManyToOne
    private Formule formule;
    
    @ManyToMany
    private Collection<ChoixClient> choixClients;
    
    @ManyToOne
    private Parametres parametre;
    

    public LigneCommande() {
        ligneCommandeEnfants = new ArrayList();
        ingredients =  new ArrayList();
        choixClients =  new ArrayList();
    }

    public LigneCommande(int quantite, float prixHT, float tauxTVA) {
        this();
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
    
     public LigneCommande getLigneCommandeParent() {
        return ligneCommandeParent;
    }

    public void setLigneCommandeParent(LigneCommande ligneCommandeParent) {
        this.ligneCommandeParent = ligneCommandeParent;
    }

    public Collection<LigneCommande> getLigneCommandeEnfants() {
        return ligneCommandeEnfants;
    }

    public void setLigneCommandeEnfants(Collection<LigneCommande> ligneCommandeEnfants) {
        this.ligneCommandeEnfants = ligneCommandeEnfants;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Collection<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    
    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Formule getFormule() {
        return formule;
    }

    public void setFormule(Formule formule) {
        this.formule = formule;
    }

    public Collection<ChoixClient> getChoixClients() {
        return choixClients;
    }

    public void setChoixClients(Collection<ChoixClient> choixClients) {
        this.choixClients = choixClients;
    }

    public Parametres getParametre() {
        return parametre;
    }

    public void setParametre(Parametres parametre) {
        this.parametre = parametre;
    }           
    
      @Override
    public String toString() {
        return "entities.LigneCommande[ quantité : " +quantite+"prix HT : " +prixHT+ "TVA :" +
                tauxTVA+"ligne de commande enfant :"+ligneCommandeEnfants+"ligne commande parent : "
                +ligneCommandeParent+"commande :"+commande+"]";
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
