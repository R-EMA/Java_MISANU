package dan1;

import java.util.Scanner;

public class Primer5_plus {

	public static void main(String[] args) {
		// obuhvata primere 5 i 6; i dodatne primere nastale kao varijacije na ova dva
		// unos i ... različite operacije nad članovima niza
		// najmanja i najveća cifra vrednosti člana / na nivou niza
		// proizvod cifara na nivou vrednosti člana niza
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj članova niza: ");
		int n = sc.nextInt();
		int x[] = new int[n];
		int maxC = 0, minC = 9; // najveca, najmanja cifra vrednosti člana niza (višak inicijalizacija)
		int maxArr = 0, minArr = 9; // najveca, najmanja cifra u nizu
		int tmpVal = 0; // vrednost člana niza koji se obrađuje
		int pc = 1; // za proizvod cifara članova niza (višak inicijalizacija)
		int cifra = 0; // cifra u članu (višak incijalizacija)
				
		System.out.println("Unesite niz celih brojeva: ");
		for(int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}
		// prikaz i obrada članova niza 
		System.out.printf("\t%5s\t%7s\t\t%7s\t%7s\t%10s%n", "index", "član", "maximum", "minimum","proizvod");
		System.out.println("------------------------------------------------------------");
		for(int i = 0; i < n; i++) {
			tmpVal = Math.abs(x[i]); // da ne bi prvu cifru video kao negativnu
			maxC = 0; // 0 je najmanja cifra pa je sve drugo veće
			minC = 9; // 9 je najveća cifra pa je sve drugo manje
			pc = 1; 
			while( tmpVal > 0 ) {	
				cifra = tmpVal % 10;
				pc *= cifra;
				if ( cifra  > maxC )
					maxC = tmpVal % 10;
				if ( cifra  < minC )
					minC = tmpVal % 10;
				tmpVal /= 10;
			}
			System.out.printf("\t%5d\t%7d\t\t%7d\t%7d\t%10d%n", i, x[i], maxC, minC, pc);
			if ( maxC > maxArr ) 
				maxArr = maxC;
			if ( minC < minArr ) 
				minArr = minC;			
		}
		System.out.println("------------------------------------------------------------");
		System.out.printf("\t%5s\t%7s\t\t%7d\t%7d%n", " ", " " , maxArr, minArr); // prazni stringovi su tu za lakše formatiranje
		sc.close();
 
	}

}
