package exr7_S�rie2;
import java.util.Date ;
public class Primeurs extends Article implements Produits {
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

	public Date Date_de_p�remption() {
		// TODO Auto-generated method stub
		return null;
	}

	public int jours_restant() {
		 Date date = new Date();
	      long date1InMs = date.getTime();
	      long date2InMs = date_p�remption.getTime();

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
