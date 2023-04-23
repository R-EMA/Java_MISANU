package knjiga;

public class Book {
	
	private String naziv;
	private int str;
	
	Book() {
		naziv = "nema naziv";
		str = 1;
	}
	
	Book(String naziv, int str) {
		this.naziv = naziv;
		this.str = str;
	}
	
	Book(String naziv) {
		this.naziv = naziv;
		str = 100;
	}
	
	public void setKnjiga(String naziv, int str) {
		this.naziv = naziv;
		this.str = str;
	}
	
	public void getKnjiga() {
		System.out.println(naziv + " ima " + str + " stranica.");
	}
	

}

