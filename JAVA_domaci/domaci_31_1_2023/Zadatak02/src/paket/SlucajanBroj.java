package paket;

/**
 * 
 * @author emma
 * 
 * Zadatak 2.
 * Napisati program koji generiše i ispisuje pet slučajna broja celobrojnog tipa.
 *
 */

import java.util.Random;

public class SlucajanBroj {

	public static void main(String[] args) {
		// vraća 5 celih brojeva u rasponu 1-100, uključujući i granične vrednosti
		
		// Način 1. metod Math.random()		
		for(int i=0; i<5; i++)
			System.out.print( (int) (Math.floor(Math.random()*100)+1) + " ");
		
		System.out.println("\n");
		// Način 2. klasa Random		
		Random slucajno = new Random();
		for(int i=0; i<5; i++)
			System.out.print( slucajno.nextInt(1,100) + " ");
	}

}
