package paket;

public class NaprednaFor {

	public static void main(String[] args) {
		// foreach u JAVI,napredna for petlja
		int niz[] = {2,5,7,9,29};
		
		//štampanje standardnom for petljom
		System.out.println("Standardna for petlja: ");
		for(int i=0; i<niz.length; i++) 
			System.out.print(niz[i] + "  ");
		
		//štampanje unapređenom for petljom
		System.out.println("\n\nUnapređena for petlja - foreach petlja");
		for(int i : niz )
			System.out.print(i + "  ");		

	}

}
