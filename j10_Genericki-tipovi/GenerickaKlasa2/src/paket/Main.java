package paket;

public class Main {

	public static void main(String[] args) {
		// objekti generičke klase sa dva parametra
		
		// integer, string
		A<Integer, String> obj1 = new A<Integer, String>(100,"Java");
		obj1.prikaziTip();
		
		int vred1 = obj1.getObjT();
		String vred2 = obj1.getObjV();
		System.out.println("T vrednost: " + vred1);
		System.out.println("V vrednost: " + vred2);
		
		//string, double
		A<String, Double> obj2 = new A<String, Double>("JAVA",123.45);
		obj2.prikaziTip();
		
		String vred12 = obj2.getObjT();
		double vred22 = obj2.getObjV();
		System.out.println("T vrednost: " + vred12);
		System.out.println("V vrednost: " + vred22);
		
		//Boolean, Integer
		A<Boolean, Integer> obj3 = new A<Boolean, Integer>(true,10);
		obj2.prikaziTip();
		
		boolean vred13 = obj3.getObjT();
		int vred23 = obj3.getObjV();
		System.out.println("T vrednost: " + vred13);
		System.out.println("V vrednost: " + vred23);
		
	}

}
