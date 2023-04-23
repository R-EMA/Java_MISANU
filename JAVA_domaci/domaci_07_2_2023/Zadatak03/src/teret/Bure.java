package teret;

/**
 * 
 * @author emma
 * 
 * Zadatak 3 - klasa Bure, nasleđuje Teret
 * Bure je teret oblika valjka zadatog poluprečnika osnove i visine. Oznaka vrste je B.
 *
 */

public class Bure extends Teret {
	
	private int poluprecnik;
	private int visina;
	
	public Bure(double tezina, int r, int h) {
		super(tezina);
		super.setVrstaTereta('B');
		this.poluprecnik = r;
		this.visina = h;
	}

	@Override
	public double zapremina() {
		return ( poluprecnik * poluprecnik * visina * Math.PI );
	}

}
