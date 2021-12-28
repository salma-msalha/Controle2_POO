package exr7_Série2;
import java.util.Date ;
public class Primeurs extends Article implements Produits {
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

	public Date Date_de_péremption() {
		// TODO Auto-generated method stub
		return null;
	}

	public int jours_restant() {
		 Date date = new Date();
	      long date1InMs = date.getTime();
	      long date2InMs = date_péremption.getTime();

	      long timeDiff = 0;
	      if (date1InMs > date2InMs) {
	         timeDiff = date1InMs - date2InMs;
	      } else {
	         timeDiff = date2InMs - date1InMs;
	      }

	      int daysDiff = (int)(timeDiff / (1000 * 60 * 60 * 24));

	      
	      return daysDiff ;
	}
	
	

	

}
