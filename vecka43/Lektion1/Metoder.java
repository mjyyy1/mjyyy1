package Lektion1;

import java.util.Scanner;

public class Metoder {

	public static void main(String[] args) {

		TwoNumbers();

	}
/**
 * Skriver tv� heltal och skickar d vidare
 */
	public static void TwoNumbers() {

		Scanner input = new Scanner(System.in);
		System.out.println("skriv in tv� heltal eller D�");
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();

		System.out.println(minstaTal(tal1, tal2));

	}

	/**
	 * j�mf�r tv� heltal och tar reda p� villket som �r minst och skickar tillbaka
	 * "metoden �r klar"
	 * 
	 * @param tal1
	 * @param tal2
	 * @return String hej
	 */
	public static String minstaTal(int tal1, int tal2) { // om man skickar tillbaka en string ska det st� string efter
															// static, �r det en int ska det st� int
		Scanner input = new Scanner(System.in);
		System.out.println("skriv in tv� heltal eller D�");
		int a = input.nextInt();
		int b = input.nextInt();

		System.out.println(minstaTal(tal1, tal2));
		if (tal1 >= tal2) { //
			System.out.println("minsta talet �r: " + tal2);
		} else {
			System.out.println("minsta talet �r: " + tal1);
		}
		String hej = "Programmet �r f�rdigt";

		return hej;

	}

}
