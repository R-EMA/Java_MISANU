package vozila;

import generickiNiz.*;

/**
 * 
 * @author emma
 * 
 * Zadatak 3 - klasa Voz, kao skup vozila (sa teretom), koristi Vagon (vagon koristi Teret)
 * Voz se sastoji od niza vozila. 
 * Stvara se prazan zadatog kapaciteta posle čega se 
 * vozila dodaju pojedinačno(greška je ako se voz preoptereti, tj. ako ukupna težina 
 * svih vozila i tereta premaši ukupnu vučnu silu vozila u vozu). 
 * Može da se dohvati broj vozila u vozu, da se proveri da li bi se voz preopteretio 
 * priključivanjem zadatog vozila i da se sastavi tekstualni opis voza koji sadrži 
 * tekstualne opise sadržanih vozila (jedno vozilo po redu). 
 *
 */
public class Voz {
	
	Skup<Vagon> vagoni = new Skup<Vagon>(); 
	Lokomotiva cira;
	private int brojac = 0; //broji broj priključenih vagona
	private double popunjenostKapaciteta = 0; // trenutna popunjenost voza
	
	public Voz(Lokomotiva l) {
		this.cira = l;
	}
	
	//lokomotiva, ako zatreba promena lokomotive
	public Lokomotiva getCira() {
		return cira;
	}
	public void setCira(Lokomotiva cira) {
		this.cira = cira;
	}

	//vagoni
	//dodavanje vagona
	public void addVagon(Vagon v) {
		
		if ( (this.popunjenostKapaciteta + v.ukupnaTezina()) <= cira.getVucnaSila()) {
			vagoni.add(v);
			popunjenostKapaciteta += v.ukupnaTezina();
			brojac++;
		}
		else {
			System.out.println("Vagon " + v.toString() + 
					" ne može da se priključi kompoziciji!");
		}			
		
	}	
	//broj vagona
	public int brojVagona() {
		//bez lokomotive
		return brojac;
	}
	//ispituje da li vagon može da se doda
	public boolean dobarVagon(Vagon v) {
		if( this.popunjenostKapaciteta + v.ukupnaTezina() <= cira.getVucnaSila()  ) 
			return true;
		else
			return false;		
	}
	
	//vozzzzzzz
	public double tezinaVoza() {
		double tezinaVoza = cira.getTezinaVozila();
		for(Vagon t : this.vagoni) {
			tezinaVoza = t.getTezinaVozila();
		}
		return tezinaVoza;
	}

	@Override
	public String toString() {
		// opis voza
		String opis = cira.toString() + "\n";
		for(Vagon t : this.vagoni) {
			opis += t.toString() + "\n";		
		}
	
		return opis; 
	}

	/*@Override
	public double ukupnaTezina() {
		// TODO Auto-generated method stub
		return 0;
	}*/

}
