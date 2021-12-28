package exr7_Série2;
import java.util.Date ;
public class Primeurs extends Article {
	Date date_péremption ;

	public Primeurs(Date date_péremption) {
		super();
		this.date_péremption = date_péremption;
	}

	public Primeurs() {
		
	}

	public String toString() {
		return "Primeurs [date_péremption=" + date_péremption + ", prix_achat=" + prix_achat + ", prix_vente="
				+ prix_vente + ", nom=" + nom + ", fournisseur=" + fournisseur + "]";
	}
	
	

	

}
