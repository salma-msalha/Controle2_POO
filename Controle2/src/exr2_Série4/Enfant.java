package exr2_Série4;
import java.lang.Exception;

public class Enfant    {
	public int age  ; 
	

public Enfant(int age) {
	//Exception dans le Constructeur 
	Exception AgeEnfantException = new Exception ("[ "+age+" ] ans n'est pas un âge valide !") ;
	try {
		if (age<1 || age>10) {
			throw(AgeEnfantException) ; 
			
		}
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage()) ;
	}
		
		this.age = age;
	}


	public static void main (String[] args) {
		Enfant e1 = new Enfant (17) ; 
//		Exception hors construceur 
//		Exception AgeEnfantException = new Exception ("[ "+e1.age+" ] ans n'est pas un âge valide !") ;
//		try {
//			if(e1.age<1 || e1.age>10) {
//				throw(AgeEnfantException) ; 
//				
//			}
//			
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage()) ;
//		}
	}
}
