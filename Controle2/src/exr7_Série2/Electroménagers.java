package exr7_S�rie2;

import java.util.Date;

public class Electrom�nagers extends Article implements  Susceptible_solde{

	int voltage ; 
	String marque ;
	//Constructeurs
	public Electrom�nagers(int voltage, String marque)  {
	
		this.voltage = voltage;
		this.marque = marque;
	}
	
	public Electrom�nagers() {
		
	}
	//toString
	
	public String toString() {
		return "Electrom�nagers [voltage=" + voltage + ", marque=" + marque + ", prix_achat=" + prix_achat
				+ ", prix_vente=" + prix_vente + ", nom=" + nom + ", fournisseur=" + fournisseur + "]";
	}
	
	
	
	// m�thodes � d�finir
	public void lancer_solde() {
		// TODO Auto-generated method stub
		
	}
	

	public void terminer_solde() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
