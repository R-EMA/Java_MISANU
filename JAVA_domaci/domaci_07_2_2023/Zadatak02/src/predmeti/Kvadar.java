package predmeti;

public class Kvadar extends Predmet {
	
	double a;
	double b;
	double c;
	
	public Kvadar() {
		this.a = 1;
		this.b = 1;
		this.c = 1;
		super.oznakaPredmeta = 'K';
			
	}
	public Kvadar(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		super.oznakaPredmeta = 'K';
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	//racunanje zapremine kvadra
	public double izracunajZapreminu() {
		return a*b*c; //m3
	}

	@Override
	public String opisiPredmet() {
		
		double zapremina = this.izracunajZapreminu();
		double masa = super.izracunajTezinu(zapremina);
		
		return super.opisiPredmet() + 
				"Dimenzije  :       " + super.df.format(this.a) + " x " + 
				super.df.format(this.b) + "x" + super.df.format(this.c) + " m \n" +
				"Zapremina:         " + super.df.format(zapremina) + " m3 \n" +
				"Težina:            " + super.df.format(masa) + " kg";
	}	
	

}
