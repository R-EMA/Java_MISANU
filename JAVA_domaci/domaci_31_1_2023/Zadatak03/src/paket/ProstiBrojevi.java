package paket;

/**
 * 
 * @author emma
 * 
 * Zadatak 3.
 * Napisati program koji ispisuje sve proste brojeve od 1 do 10. 
 * Prost broj je deljiv samo jedinicom i samim sobom.
 *
 */

public class ProstiBrojevi {

	public static void main(String[] args) {
		// prosti brojevi
		
		boolean deljivo;
		System.out.print("Prosti brojevi od 1 do 10: 2 ");
		for(int i=3; i<=10; i++) {
			deljivo = false;
			for(int j=(i-1); j>1; j--) {	
				if( i % j == 0)	
					deljivo = true;				
			}
			if( !deljivo )
				System.out.print( i + " ");
		}	
		
	}

}
