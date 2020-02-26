package Talspel;

import java.util.Scanner;

public class Talspel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		difficulty();// kallar på metoden difficulty
	}

	/**
	 * kollar vilken svårighetsgrad du vill ha och skickar dig till metoden som är
	 * själva spelet Jag använde String istället för en int för att slippa använda
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
			System.out.println("välj svårighetsgrad");
			System.out.println("skriv 1 för normal eller 2 för hard ");
			choice = input.next();
			if (choice.equals("1")) {
				System.out.println("du har 10 försök");
				diff = 10;
				Game(loop, diff);
				System.out.println("Skriv 1 för att köra om 2 för att avsluta");
				do {

					val = input.next();
					if (val.equals("1")) {break;
					} else if (val.equals("2")) {
						loop = false;
						break;
					} else {
						System.out.println("Skriv 1 för att köra om 2 för att avsluta");
					}
				} while (stop=true);

			} else if (choice.equals("2")) {
				System.out.println("du har 5 försök");
				diff = 5;
				Game(loop, diff);
				System.out.println("Skriv 1 för att köra om 2 för att avsluta");
				do {
					
				
				val = input.next();
				if (val.equals("1")) {break;
				} else if (val.equals("2")) {
					loop = false;
					break;
				} else {
					System.out.println("Skriv 1 för att köra om 2 för att avsluta");
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
			System.out.println("du har " + i + " försök kvar" + '\n');

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
				System.out.println("grattis du vann " + "du använde " + j + " försök" + '\n');
				loop = false;

			} else if (i == 0) {
				System.out.println("du förlorade talet var: " + random + '\n');
				loop = false;
			} else if (guess > random) {
				System.out.println("Talet är lägre");

			} else if (guess < random) {
				System.out.println("Talet är högre");

			}

		} while (loop == true);

	}

	/**
	 * kollar om gissa inte innehåller några bokstäver och skickar tillbaka en true
	 * om den inte har bokstäver eller false om den har bokstäver
	 * 
	 * @param gissa
	 * @return
	 */
	public static boolean isAnummer(String gissa) {
		if (gissa == null) {// om gissa inte har något värde returnas false
			return false;
		}
		int glength = gissa.length();// skapar en int som är = längden på Stringen gissa som sedan används för att
										// kolla igenom varje bokstav i loopen nedan
		for (int i = 0; i < glength; i++) {// en loop som går igenom varje tecken i Stringen gissa
			if (Character.isDigit(gissa.charAt(i)) == false) {// isDigit kollar om char är en siffra eller annat tecken
																// och .charAt(i) specificerar vilken char den är på;
				return false;
			}
		}

		return true;// annars returnas true

	}
}
