package p2;

import java.util.LinkedList;
import java.util.List;

public class MainPovezaneListe {

	public static void main(String[] args) {
		
		String imena[] = {"Mika", "Žika", "Fića"};
		String imena1[] = {"Ana", "Lena", "Hana", "Una"};
		
		List<String> listaImena = new LinkedList<String>();
		List<String> listaImena1 = new LinkedList<String>();
		
		//niz -> kolekcija
		//imena - listaImena
		for(String s : imena) {
			listaImena.add(s);
		}
		System.out.println(listaImena);
		//imena1 -> listaImena1
		for(String s : imena1) {
			listaImena1.add(s);
		}
		System.out.println(listaImena1);
		
		//proširenje liste elementima druge liste
		//addAll(lista) - na kraju liste; addAll(index,lista) - počev od pozicije index
		listaImena.addAll(listaImena1);
		System.out.println(listaImena);
		
		//izdvajanje, ovde čitanje dela liste, od...do .subList(n,m); >=n i <m
		System.out.println(listaImena.subList(1, 4)); //pozicije 1,2 i 3.
		//brisanje izdvojenih članova, lančana primena metoda
		listaImena.subList(1, 4).clear();
		System.out.println(listaImena);

		
		
	}

}