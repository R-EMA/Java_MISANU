package enumi;

public class MainBoje {
	
	public static void main(String[] args) {
	
		Boje plava = Boje.PLAVA;
		Boje crvena = Boje.CRVENA;
		Boje bela = Boje.BELA;
		
		System.out.println(plava);
		
		
		//iteracija
		for(Boje b : Boje.values()) {
			System.out.print(b + " ");
		}
		System.out.println("");
		//primena metoda nad enum tipom, ugrađeni metodi
		// poređenje po vrednosti: false ako su različite vrednosti
		System.out.println("Plava Vs Bela (jednako): " + plava.equals(bela));
		// poređenje po lokaciji: 0 ista lokacija, 1 - nalazi se iza, -1 nalazi se ispred
		System.out.println("Plava Vs Bela (poređenje lokacije): " + plava.compareTo(bela)); // 1 plava je iza bele
		System.out.println("Plava Vs Crvena (poređenje lokacije): " + plava.compareTo(crvena)); // -1 plava je ispred crvene 

		
		
		//enum sa parametrom
		Boje2 plava2 = Boje2.PLAVA;
		System.out.println("\nprocenat učešća "+ plava2 + " boje: " + plava2.getUdeo());
		
		//iteracija kroz enum sa parametrima
		System.out.println("Pozicija Boja Udeo");
		for(Boje2 b : Boje2.values()) {
			System.out.println("    " + b.ordinal() + ".   " + b + " " + b.getUdeo() + "% ");
		}
	}	

}
