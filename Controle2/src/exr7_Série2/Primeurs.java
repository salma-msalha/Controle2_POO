package exr7_S�rie2;
import java.util.Date ;
public class Primeurs extends Article {
	Date date_p�remption ;

	public Primeurs(Date date_p�remption) {
		super();
		this.date_p�remption = date_p�remption;
	}

	public Primeurs() {
		
	}

	public String toString() {
		return "Primeurs [date_p�remption=" + date_p�remption + ", prix_achat=" + prix_achat + ", prix_vente="
				+ prix_vente + ", nom=" + nom + ", fournisseur=" + fournisseur + "]";
	}
	
	

	

}
