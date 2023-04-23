package petljaDoWhile;

import java.text.DecimalFormat; 

public class Primer6 { 
	
	public static void main(String[] args) { 
		
		double f, x; 
		DecimalFormat df = new DecimalFormat("#.##"); 
		// Štampanje zaglavlja 
		System.out.println("\tX\tF(X)"); 
		for (x = 1.0; x <= 2.0; x += 0.2) { 
			// Izračunavanje vrednosti funkcije 
			f = 41.926 * Math.sqrt(1 + Math.pow(x, 3)) + Math.pow(x, 1.0 / 3.0) * Math.exp(x); 
			// Štampanje rezultata 
			System.out.println("\t" + df.format(x) + "\t" + df.format(f)); 
		} 
		
		// drugi način while
		x = 1.0;
		// Štampanje zaglavlja 
		System.out.println("\n\tX\tF(X)"); 
		while (x <= 2.0) { 
			// Izračunavanje vrednosti funkcije 
			f = 41.926 * Math.sqrt(1 + Math.pow(x, 3)) + Math.pow(x, 1.0 / 3.0) * Math.exp(x); 
			// Štampanje rezultata 
			System.out.println("\t" + df.format(x) + "\t" + df.format(f)); 
			x += 0.2; 
		}
		
	}
}