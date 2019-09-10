package vecka37;

import java.util.Scanner;

public class LäxaVecka37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Vad heter du?");
		String Namn = input.nextLine();
		
		System.out.println("Hur gammal är du?");
		String Ålder = input.nextLine();
		
		System.out.println("Vad är din adress?");
		String Adress = input.nextLine();
		
		System.out.println("Vad är din postnummer?");
		String Postnummer = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String Stad = input.nextLine();
		
		System.out.println("Vad är ditt telefonnummer?");
		String Mobilnummer = input.nextLine();
		
	}

}
