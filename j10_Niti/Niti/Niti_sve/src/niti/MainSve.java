package niti;

public class MainSve {

	public static void main(String[] args) throws Exception {
		// rekapitulacija niti
		
		//objekat glavne niti
		Thread tMain = Thread.currentThread();
		System.out.println("Glavna nit:            " + tMain);
		System.out.println("Ime glavne niti:       " + Thread.currentThread().getName());
		System.out.println("Prioritet glavne niti: " + Thread.currentThread().getPriority());
		System.out.println("Pripadajuća grupa:     " + Thread.currentThread().getThreadGroup());
		
		//sporedna nit implementacija Runnable interfejsa
		Arun a = new Arun(); // kreiranje "Runnable" objekta
		Thread ta = new Thread(a,"nit A"); // kreiranje sporedne niti 
		System.out.println("\nSporedna nit:          " + ta);
		ta.start(); //pokreće nit
		
		//sporedna nit proširenje Thread klase
		Athread at = new Athread("nit At"); // kreiranje niti
		System.out.println("\nSporedna nit:          " + at);
		at.start(); // pokretanje niti
		
				
	}

}
