package dan2;

public class Main {

	public static void main(String[] args) {
		// 
		
		Box b1 = new Box();
		b1.duzina = 10;
		b1.sirina = 15;
		b1.visina = 20;
		
		Box b2 = new Box();
		b2.duzina = 5;
		b2.sirina = 6;
		b2.visina = 7;
		
		double zapremina1 = b1.duzina * b1.sirina * b1.visina;
		double zapremina2 = b2.duzina * b2.sirina * b2.visina;
		
		System.out.println("Zapremina 1. kvadra je: " + zapremina1);
		System.out.println("Zapremina 2. kvadra je: " + zapremina2);
				

	}

}
