package Lektion1;

import java.util.Scanner;

public class Metoder {

	public static void main(String[] args) {

		TwoNumbers();

	}
/**
 * Skriver två heltal och skickar d vidare
 */
	public static void TwoNumbers() {

		Scanner input = new Scanner(System.in);
		System.out.println("skriv in två heltal eller DÖ");
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();

		System.out.println(minstaTal(tal1, tal2));

	}

	/**
	 * jämför två heltal och tar reda på villket som är minst och skickar tillbaka
	 * "metoden är klar"
	 * 
	 * @param tal1
	 * @param tal2
	 * @return String hej
	 */
	public static String minstaTal(int tal1, int tal2) { // om man skickar tillbaka en string ska det stå string efter
															// static, är det en int ska det stå int
		Scanner input = new Scanner(System.in);
		System.out.println("skriv in två heltal eller DÖ");
		int a = input.nextInt();
		int b = input.nextInt();

		System.out.println(minstaTal(tal1, tal2));
		if (tal1 >= tal2) { //
			System.out.println("minsta talet är: " + tal2);
		} else {
			System.out.println("minsta talet är: " + tal1);
		}
		String hej = "Programmet är färdigt";

		return hej;

	}

}
