package exr6_S�rie2;

import java.util.Date;

public class Main {

	public static void main (String [] args) {
		
		Associ� A1 = new Associ�(123 , "Msalha", "Salma",  new Date(2002 , 03 , 23 ), 50000, 1000000, 50) ;
		Cadre C1 = new Cadre (345, "Msalha", "Salma", new Date(2000 , 03 , 23), 3) ;
		Ouvrier O1 = new Ouvrier(1234,"Msalha", "Salma",  new Date(1996 , 03 , 23),new Date ( 2017 , 10 , 22 ) ) ; 
		 
		System.out.println(A1.getSalaire()) ; 
		System.out.println(C1.getSalaire()) ; 
		System.out.println(O1.getSalaire()) ; 
	}

	
	
	
}
