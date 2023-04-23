package p1;

import java.util.LinkedList;
import java.util.List;

public class PovezanaLista {

	public static void main(String[] args) {
		// povezana lista, elementi ne moraju da budu susedni

		List<String> plStr = new LinkedList<String>();
		
		//dodavanje elemenata u povezanoj listi
		plStr.add("A"); //prvo slobodno mesto
		plStr.add("B");
		plStr.add(2,"C"); //na poziciji 2 (treče mesto) dodaje se C
		
		//čitanje
		System.out.println("Elementi povezane liste " + plStr);
		
		//brisanje
		plStr.remove(0); // preko indeksa
		plStr.remove("B"); // preko vrednosti
		System.out.println("Elementi povezane liste posle brisanja" + plStr);
		
		//proširenje
		plStr.add("D");
		plStr.add("E");
		plStr.add("F");
		System.out.println("Elementi povezane liste posle proširenja" + plStr);
		
		//pretraga, po vrednosti, case sensitive
		boolean sadrzi = plStr.contains("E");
		if(sadrzi)
			System.out.println("Lista sadrži element E");
		else
			System.out.println("Lista ne sadrži element E");	
		
		//pristupanje-uzimanje vrednosti
		Object obj = plStr.get(3); // sa pozicije 3 - F
		System.out.println("Vrednost elementa - objekta je " + obj);
		//set - postavljanje  vrednosti na poziciji
		System.out.println("Elementi povezane liste pre izmene   " + plStr);
		plStr.set(1, "Z");
		System.out.println("Elementi povezane liste posle izmene " + plStr);
		
		
		
	}

}
