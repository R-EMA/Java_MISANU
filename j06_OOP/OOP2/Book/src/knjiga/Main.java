package knjiga;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Book k1 = new Book();
		Book k2 = new Book("Java u totalu", 5000);
		Book k3 = new Book("Knjiga o knjizi");
		
		k1.getKnjiga(); // pre promene vrednosti
		System.out.println("Koju knjigu trenutno čitate? ");
		String knjiga = sc.nextLine();
		System.out.println("Koliko stranica ima knjiga " + knjiga + "? ");
		int brStr = sc.nextInt();
		k1.setKnjiga(knjiga, brStr);
		
		k1.getKnjiga(); // posle promene vrednosti
		k2.getKnjiga();
		k3.getKnjiga();
		
		sc.close();

	}

}
