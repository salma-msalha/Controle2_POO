package exr7_Série2;

public class Article {
	double prix_achat ;
	double prix_vente ; 
	String nom ;
	String fournisseur ;
	
	public double taux_de_rendement() {
		return prix_vente - prix_achat ;
	}

	public String toString() {
		return "Article [prix_achat=" + prix_achat + ", prix_vente=" + prix_vente + ", nom=" + nom + ", fournisseur="
				+ fournisseur + "]";
	}

	public double getPrix_achat() {
		return prix_achat;
	}

	public void setPrix_achat(double prix_achat) {
		this.prix_achat = prix_achat;
	}

	public double getPrix_vente() {
		return prix_vente;
	}

	public void setPrix_vente(double prix_vente) {
		this.prix_vente = prix_vente;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	

}
