package teret;

/**
 * 
 * @author emma
 * 
 * Zadatak 3 - Klasa Sanduk, nasleđuje Teret
 * Sanduk je teret oblika kvadra zadatih dužina ivica. Oznak vrste je S.
 *
 */

public class Sanduk extends Teret {

	private int a;
	private int b;
	private int c;
	
	public Sanduk(double tezina, int a, int b, int c) {
		super(tezina); //specifična tezina sanduka
		super.setVrstaTereta('S');
		this.a = a;
		this.b = b;
		this.c = c;
	}
	 
	@Override
	public double zapremina() {
		// zapremina sanduka
		return a*b*c;
	}
	

}
