package vecka37;

import java.util.Scanner;

public class L�xaVecka37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Vad heter du?");
		String Namn = input.nextLine();
		
		System.out.println("Hur gammal �r du?");
		String �lder = input.nextLine();
		
		System.out.println("Vad �r din adress?");
		String Adress = input.nextLine();
		
		System.out.println("Vad �r din postnummer?");
		String Postnummer = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String Stad = input.nextLine();
		
		System.out.println("Vad �r ditt telefonnummer?");
		String Mobilnummer = input.nextLine();
		
	}

}
