package paket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// uvod u kolekcije, nizovi
		
		Scanner sc = new Scanner(System.in);
		int brojevi[] = new int[5];
		
		for(int i=0; i<brojevi.length; i++) {
			System.out.println("Unesite broj: ");
			brojevi[i] = sc.nextInt();
			
			if(i+1 == brojevi.length) {
				System.out.println("Niz je popunjen.");
			}
		}
		
		// štampanje niza
		System.out.println("Elementi niza su:");
		for(int i=0; i<brojevi.length; i++) {
			System.out.println(brojevi[i]);			
		}
		
		sc.close();
		
	}

}
