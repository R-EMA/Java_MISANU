package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String imena[] = {"Mika", "Žika", "Ana", "Lana", "Hana", "Una", "Pera"};
		
		List<String> listaImena = new ArrayList<String>();
		
		// niz -> kolekcija
		for(String s : imena) {
			listaImena.add(s);
		}
		System.out.println(listaImena);
		
		//lista za brisanje
		String imenaZaBrisanje[] = {"Mika", "Lana", "Hana"};
		List<String> listaImenaZaBrisanje = new ArrayList<String>();
		for(String s : imenaZaBrisanje) {
			listaImenaZaBrisanje.add(s);
		}
		System.out.println(listaImenaZaBrisanje);
		
		//kreiranje iteratora kolekcije i štampanje iste pomoću iteratora
		// iterator je interfejs koji eliminiše primenu for petlje za obradu liste
		Iterator<String> itrString = listaImena.iterator(); // iterator liste listaImena
		System.out.println("Štampanje elemenata liste primenom iteratora");
		while(itrString.hasNext()) 
			System.out.println(itrString.next());
		
		//brisanje članova liste primenom iteratora i listeImenaZaBrisanje
		itrString = listaImena.iterator(); //moraju ponovo da se povežu
		while(itrString.hasNext()) {
			if(listaImenaZaBrisanje.contains(itrString.next()))
				itrString.remove();
		}
		
		//lista nakon brisanja, standardna for petlja
		System.out.println("\nLista imena nakon brisanja");
		for(int i=0; i<listaImena.size(); i++)
			System.out.print(listaImena.get(i) + " ");
		
		System.out.println("\nLista imena za brisanje - ista kolekcija");
		itrString = listaImenaZaBrisanje.iterator();
		while(itrString.hasNext()) 
			System.out.print(itrString.next());
	}

}
