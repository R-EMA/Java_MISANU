package en;

public class Main {

	public static void main(String[] args) {
		
		//ordinal() - rb, pozicija konstante.0,1,2, TODO Auto-generated method stub
		
		for(Boja b : Boja.values())
			System.out.println(b.ordinal() + " " + b);
		
		//compareto proverava i poredi pozicije vrendnosti 
		//poz.konst < rb od rb konstate - > neg broj, brnuto oizitivan br
		//jednake nula
		Boja b1, b2, b3;
		b1 = Boja.Crvena;
		b2 = Boja.Zelena;
		b3 = Boja.Plava;

		if(b1.compareTo(b2) < 0)
		    System.out.println(b1 + " dolazi pre " + b2);
		    
		if(b1.compareTo(b2) > 0)
		    System.out.println(b2 + " dolazi pre " + b1);
		
		//equals() pored ijednakost konnstante iz nabrajanja sa svakim drugim objektom
		if(b1.equals(b2))
		 System.out.println("greška");
		else
		System.out.println("ok je");
		    
		
	}

}
