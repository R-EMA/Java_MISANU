package vozila;

/**
 * 
 * @author emma
 * 
 * Zadatak 3 - klasa Lokomotiva, nasleđuje Vozilo
 * Lokomotiva je vozilo zadate vučne sile. Tekstualni opis je L(ukTezina | vučnaSila).
 *
 */
public class Lokomotiva extends Vozilo {
	
	private double vucnaSila;
	
	//public Lokomotiva() {}
	
	public Lokomotiva(double t, double sila) {
		super(t); //težina lokomotive
		this.vucnaSila = sila; //koliko može da povuče
	}
	
	public double getVucnaSila() {
		return vucnaSila;
	}

	public void setVucnaSila(double vucnaSila) {
		this.vucnaSila = vucnaSila;
	}

	@Override
	public double ukupnaTezina() {
		// ukupna (maksimalna) težina lokomotive; težina lokomotive + vučna sila
		return this.vucnaSila + this.tezinaVozila;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "L(" + df.format(this.ukupnaTezina()) + " | " + df.format(this.vucnaSila) + ")";
	}

}
