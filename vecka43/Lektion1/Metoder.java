package Lektion1;

import java.util.Scanner;

public class Metoder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("skriv in två heltal eller DÖ");
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		
		System.out.println(minstaTal(tal1, tal2));
	}

	public static String minstaTal(int tal1, int tal2) {
		
		if (tal1 >= tal2) {
			System.out.println("minsta talet är: " + tal2);
		} else {
			System.out.println("minsta talet är: " + tal1);
		}
		String hej = "Metoden är klar";
		
		return hej;

	}

}
