package exr7_Série2;

import java.util.Date;

public class Electroménagers extends Article implements  Susceptible_solde{

	int voltage ; 
	String marque ;
	//Constructeurs
	public Electroménagers(int voltage, String marque)  {
	
		this.voltage = voltage;
		this.marque = marque;
	}
	
	public Electroménagers() {
		
	}
	//toString
	
	public String toString() {
		return "Electroménagers [voltage=" + voltage + ", marque=" + marque + ", prix_achat=" + prix_achat
				+ ", prix_vente=" + prix_vente + ", nom=" + nom + ", fournisseur=" + fournisseur + "]";
	}
	
	
	
	// méthodes à définir
	public void lancer_solde(float pers1) {
		 prix_vente = prix_achat - (prix_achat * pers1 /100) ;
		
	}
	

	public void terminer_solde(float pers2) {
		prix_vente = prix_achat + (prix_achat * pers2 /100) ;
		
	}

	
	
	
	
	
	
	
}
