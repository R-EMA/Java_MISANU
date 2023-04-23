package demo;

import java.io.*;

public class Main {
	
	//objekat klase kao parametar/argument funkcije
	public static void nacrtajRect(Rect r) {
		// na osnovu dimenzija "nacrtati" pravouganik
		int a = (int) r.getA();
		int b = (int) r.getB();
		int odnos = a/b;
		if (a > 20) {
			a = 10;
			b *= odnos;
		}
		for(int i=0; i<b; i++) {
			System.out.print("        ");
			for(int j=0; j<a; j++)
				System.out.print("*");
			System.out.println("");
		}
	}
	
	//graničnik
	public static void linija() {
		System.out.println("=========================================================\n");
	}

	public static void main(String[] args) throws Exception {
		/* 
		 * uvod u klase i objekte
		 */
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * kreiranje (instanciranje) objekata klase
		 * 
		 * Objekat je jedno pojavljivanje (instanca) klase
		 */
		A objA = new A();
		/*
		 * objekti mogu da pristupaju članicama klase
		 */
		objA.info();
		linija();
		
		/* Klasa B: članice klase */
		B objB = new B();
		System.out.print("Zdravo! Kako se zoveš? ");
		objB.ime = bf.readLine(); // dodela vrednosti atributu
		objB.info(); // izvršavanje metoda (sa čitanjem vrednosti atributa)
		linija();
		
		/* Klasa C: osovine članica klase */
		C.infoC(); // poziv statičkog metoda
		C objC = new C();
		objC.info(); // poziv nestatičkog metoda
		//objC.infoC(); // poziv statičkog metoda od strane objekta (nije greška, ali nije ni ispravna primena)
		linija();
		
		/* Klasa D: geteri i seteri */
		D objD = new D();
		System.out.print("Zdravo! Kako se zoveš? ");
		String ime = bf.readLine();
		objD.setIme(ime);
		System.out.println(objD.getIme() + "!? I ja se tako zovem!");
		linija();
		
		/* Klasa E: konstruktor-i i this */
		E objE1 = new E();
		E objE2 = new E("EMA");
		objE1.info();
		objE2.info();
		linija();
		
		/* 
		 * Klasa Rect: osnovna matematika pravougaonika i kvadrata
		*/
		Rect p1 = new Rect();
		Rect p2 = new Rect(5);
		Rect p3 = new Rect(3,4);
		//demonstracija metoda info nad kreiranim pravouganicima
		p1.info();
		p2.info();
		p3.info();
		//demonstracija ostalih metoda nad pravouganikom p3
		System.out.println("Obim: " + p3.obim());
		System.out.println("Površina: " + p3.povrsina());
		System.out.println("Dijagonala: " + p3.d());
		p3.setB(3);
		p3.info();
		linija();
		
		nacrtajRect(p3); //poziv f-je koja ima objekat kao argument
		
	}

}
