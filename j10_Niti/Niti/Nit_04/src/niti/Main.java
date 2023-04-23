package niti;

public class Main {

	public static void main(String[] args) {
		// kontrola prioriteta izvršavanja
		
		A a = new A();
		B b = new B();

		a.setPriority(Thread.MIN_PRIORITY + 5);
		b.setPriority(Thread.MAX_PRIORITY - 7);

		a.start();
		b.start();

		/* prioritet izvršavanja niti
		* .setPriority(n) iz Klase Thread koristi se za dodelu priroriteta
		* n = 1-10 prioritet (0 najmanji, 10 najveći, 5 default)
		* mogu da se koriste i konstante
		* MIN_PRIORITY  - najmanji prioritet, n=1
		* MAX_PRIORITY  - najveći prioritet, n=10
		* NORM_PRIORITY - podrazumevana vrednost, n=5
		* postavka prioriteta nije obavezujuća ni za prevodioc, ni za procesor: 
		* to je samo preporuka kako niti (procesi) treba da se izvršavaju. 
		* Iz tog razloga, na različitim sistemima i hardverima, dolaziće do različitog redosleda izvršavanja.
		*/
		
		// jedna nit - objekat niti, poziva se samo jednom
		// teoretski, može da se poziva više puta ali to nije preporučljivo jer dolazi do izuzetka
		// izuzetak će biti bacan na različitim mestima.

	}

}
