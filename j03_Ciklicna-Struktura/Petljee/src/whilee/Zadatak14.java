package whilee;

import java.util.Scanner;

public class Zadatak14 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za a:");
		int a = ulaz.nextInt();
		int suma = 0, brojac = 0;
		while (a > 10 && a < 30) {
			suma += a;
			brojac++;
			System.out.println("Unesite vrednost za a:");
			a = ulaz.nextInt();
		}
		if (brojac != 0) {
			double sr = (double) suma / brojac;
			System.out.println("Aritmetička sredina je " + sr);
		}
		ulaz.close();
	}
}