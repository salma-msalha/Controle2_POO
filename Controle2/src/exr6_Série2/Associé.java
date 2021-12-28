package exr6_Série2;

import java.util.Date;

public class Associé extends Employé{
	
	private static double chiffre_affaires;
	private double BN ;
    private double pourcentage;



	public Associé(int matricule, String nom, String prenom, Date date_naissance, double chiffre_affaires, double bN, double pourcentage) {
		super(matricule, nom, prenom, date_naissance);
		this.chiffre_affaires = chiffre_affaires;
		BN = bN;
		this.pourcentage = pourcentage;
	}


	public String toString() {
		return "Associé [pourcentage=" + pourcentage + "]";
	}


	public  double getChiffre_affaires() {
		return chiffre_affaires;
	}

	public  void setChiffre_affaires(double chiffre_affaires) {
		Associé.chiffre_affaires = chiffre_affaires;
	}


	public double getPourcentage() {
		return pourcentage;
	}


	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}


	public double getBN() {
		return BN;
	}


	public void setBN(double bN) {
		BN = bN;
	}


	public double getSalaire() {
		
		return Math.round( (( BN*pourcentage/100 ) / 12) )    ;
	}

	

}
