package vecka38;

import java.util.Scanner;

public class Lektion1 {
// != betyder inte lika med, == betyder likamed, && betyder och,|| betyder eller
	public static void main(String[] args) {
		// && = och, = = likamed, ! = ej likamed
		// villkor
		// boolean = svar = sant/falskt
		boolean agane = true;
		int svar = 1;
		int age = 0;// initierat variabel

		Scanner input = new Scanner(System.in);// g�r det m�jligt att f� input fr�n konsolen

		System.out.println("hur gammal �r du?");
		age = input.nextInt();

		if (age >= 18) {// j�mf�r i detta fall 2 heltal

			System.out.println("Du f�r k�ra bil men jag f�r k�ra rymdraket");
			System.out.println("Du f�r k�ra moppe om du vill men du �r 18 s�...");
		} else if (age > 14 && age < 18) {
			System.out.println("Du f�r inte k�ra bil men visst du kan v�ll f� k�ra moppe");
		} else {// om villkoret inte uppfylls k�rs else
			System.out.println("du f�r inte ens k�ra moppe");
		}

		System.out.println("Vill du fr�ga om �lder igen? Skriv (1) om ja, (2) om nej");

	}
}
