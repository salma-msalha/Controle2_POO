package exr7_Série2 ; 
import java.util.Date;

public interface Produits {
	public Date date_fin_validité = new Date();
	
	//methodes
	public Date Date_de_péremption();
	public int jours_restant() ;
	

	
}
