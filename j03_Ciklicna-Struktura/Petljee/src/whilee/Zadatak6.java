package whilee;

import java.util.Scanner;

public class Zadatak6 {
	public static void main(String[] args) {
		// faktorijel broja i jop nešto
		Scanner ulaz = new Scanner(System.in);
		int s, p;
		p = 1;
		s = 0;
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		int i = 1;
		while (i <= n) {
			p *= i;
			s += p;
			i++;
		}
		System.out.println("Suma s = " + s);

		// samo faktorijel
		i = 1;
		p = 1;
		while (i <= n) {
			p *= i;
			i++;
		}
		System.out.println("Faktorijel broja = " + p);
		
		ulaz.close();
	}
}