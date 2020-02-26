package Talspel;

import java.util.Scanner;

public class Talspel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		difficulty();// kallar p� metoden difficulty
	}

	/**
	 * kollar vilken sv�righetsgrad du vill ha och skickar dig till metoden som �r
	 * sj�lva spelet Jag anv�nde String ist�llet f�r en int f�r att slippa anv�nda
	 * try catch
	 */
	private static void difficulty() {
		Scanner input = new Scanner(System.in);
		String val;
		boolean loop = true;
		boolean stop = true;

		int diff;
		String choice;

		while (loop == true) {
			System.out.println("v�lj sv�righetsgrad");
			System.out.println("skriv 1 f�r normal eller 2 f�r hard ");
			choice = input.next();
			if (choice.equals("1")) {
				System.out.println("du har 10 f�rs�k");
				diff = 10;
				Game(loop, diff);
				System.out.println("Skriv 1 f�r att k�ra om 2 f�r att avsluta");
				do {

					val = input.next();
					if (val.equals("1")) {break;
					} else if (val.equals("2")) {
						loop = false;
						break;
					} else {
						System.out.println("Skriv 1 f�r att k�ra om 2 f�r att avsluta");
					}
				} while (stop=true);

			} else if (choice.equals("2")) {
				System.out.println("du har 5 f�rs�k");
				diff = 5;
				Game(loop, diff);
				System.out.println("Skriv 1 f�r att k�ra om 2 f�r att avsluta");
				do {
					
				
				val = input.next();
				if (val.equals("1")) {break;
				} else if (val.equals("2")) {
					loop = false;
					break;
				} else {
					System.out.println("Skriv 1 f�r att k�ra om 2 f�r att avsluta");
				}}
				 while (stop = true);
			} else {
				System.out.println("Skriv 1 eller 2");
			}

		}
		System.out.println("thanks for playing <3");
	}

	private static void Game(boolean loop, int diff) {
		Scanner input = new Scanner(System.in);
		boolean success = true;
		int random = (int) (Math.random() * (100) + 1);
		String gissa;
		int guess = 0;
		int i = diff;
		int j = 0;
		do {
			System.out.println("Gissa nummret");
			System.out.println("du har " + i + " f�rs�k kvar" + '\n');

			do {
				gissa = input.next();
				isAnummer(gissa);
				if (isAnummer(gissa)) {
					guess = Integer.parseInt(gissa);
					break;
				} else {
					System.out.println("Skriv en siffra");
				}

			} while (success = true);

			i--;
			j++;
			if (guess == random) {
				System.out.println("grattis du vann " + "du anv�nde " + j + " f�rs�k" + '\n');
				loop = false;

			} else if (i == 0) {
				System.out.println("du f�rlorade talet var: " + random + '\n');
				loop = false;
			} else if (guess > random) {
				System.out.println("Talet �r l�gre");

			} else if (guess < random) {
				System.out.println("Talet �r h�gre");

			}

		} while (loop == true);

	}

	/**
	 * kollar om gissa inte inneh�ller n�gra bokst�ver och skickar tillbaka en true
	 * om den inte har bokst�ver eller false om den har bokst�ver
	 * 
	 * @param gissa
	 * @return
	 */
	public static boolean isAnummer(String gissa) {
		if (gissa == null) {// om gissa inte har n�got v�rde returnas false
			return false;
		}
		int glength = gissa.length();// skapar en int som �r = l�ngden p� Stringen gissa som sedan anv�nds f�r att
										// kolla igenom varje bokstav i loopen nedan
		for (int i = 0; i < glength; i++) {// en loop som g�r igenom varje tecken i Stringen gissa
			if (Character.isDigit(gissa.charAt(i)) == false) {// isDigit kollar om char �r en siffra eller annat tecken
																// och .charAt(i) specificerar vilken char den �r p�;
				return false;
			}
		}

		return true;// annars returnas true

	}
}
