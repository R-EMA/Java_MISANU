package paket;

/**
 * 
 * @author emma
 * 
 * Zadatak 4.
 * Napisati program koji računa broj parnih i neparnih brojeva u nizu.
 * 
 * (nema provere ispravnosti unosa, pretpostavka je da će korisnik biti "poslušan" i uneti ono što se traži)
 *
 */

import java.util.Scanner;

public class ParNepar {

	public static void main(String[] args) {
		// prebrojavanje parnih i neparnih brojeva
		
		Scanner sc = new Scanner(System.in); // za unos podataka
		int	n,			// dužina niza, tj. broj elemenata-brojeva u nizu
			par = 0, 	// broj parnih brojeva
			nepar = 0; 	// broj neparnih brojeva
		int[] brojevi;  // deklaracija niza brojeva
		
		//dužina niza
		System.out.print("Unesite dužinu niza (n>0, ceo broj): ");
		n = sc.nextInt();
		// "Inicijalizacija" niza
		brojevi = new int[n];
		// "punjenje" niza
		System.out.println("Unesite " + n + " celih brojeva: ");
		for(int i=0; i<n; i++) {
			System.out.print("brojevi[" + i + "] = ");
			brojevi[i] = sc.nextInt();
			// ovde može odmah da se računa koliko ima parnih i neparnih brojeva
			// paran je svaki broj deljiv sa 2
			if ( brojevi[i] % 2 == 0 )
				par++;
			else
				nepar++;
		}
		// štampa rezultata
		System.out.println("\nU datom nizu ima: ");
		System.out.println(" - " + par + " parn-a/ih brojeva i ");
		System.out.println(" - " + nepar + " neparn-a/ih brojeva.");
		
		sc.close();

	}

}
