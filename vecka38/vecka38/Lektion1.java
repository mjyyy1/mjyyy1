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

		Scanner input = new Scanner(System.in);// gör det möjligt att få input från konsolen

		System.out.println("hur gammal är du?");
		age = input.nextInt();

		if (age >= 18) {// jämför i detta fall 2 heltal

			System.out.println("Du får köra bil men jag får köra rymdraket");
			System.out.println("Du får köra moppe om du vill men du är 18 så...");
		} else if (age > 14 && age < 18) {
			System.out.println("Du får inte köra bil men visst du kan väll få köra moppe");
		} else {// om villkoret inte uppfylls körs else
			System.out.println("du får inte ens köra moppe");
		}

		System.out.println("Vill du fråga om ålder igen? Skriv (1) om ja, (2) om nej");

	}
}
