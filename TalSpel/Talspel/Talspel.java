package Talspel;

import java.util.Scanner;

public class Talspel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		difficulty();// kallar på metoden difficulty
	}

	/**
	 * kollar vilken svårighetsgrad du vill ha och skickar dig till metoden som är
	 * själva spelet
	 * Jag använde String istället för en int för att slippa använda try catch
	 */
	private static void difficulty() {
		Scanner input = new Scanner(System.in);
		String val;
		boolean loop = true;
		int guess = 0;
		int diff;
		String choice;

		while (loop == true) {
			System.out.println("välj svårighetsgrad");
			System.out.println("skriv 1 för normal eller 2 för hard ");
			choice = input.next();
			if (choice.equals("1")) {
				System.out.println("du har 10 försök");
				diff = 10;
				Game(loop, guess, diff);
				System.out.println("Skriv 1 för att köra om 2 för att avsluta");

				val = input.next();

				if (val.equals("1")) {
				} else if (val.equals("2")) {
					loop = false;
				} else {
					System.out.println("Skriv 1 för att köra om 2 för att avsluta");
				}

			} else if (choice.equals("2")) {
				System.out.println("du har 5 försök");
				diff = 5;
				Game(loop, guess, diff);
				System.out.println("Skriv 1 för att köra om 2 för att avsluta");
				val = input.next();
				if (val.equals("1")) {
				} else if (val.equals("2")) {
					loop = false;
				} else {
					System.out.println("Skriv 1 för att köra om 2 för att avsluta");
				}
			} else {
				System.out.println("Skriv 1 eller 2");
			}

		}
		System.out.println("thanks for playing <3");
	}

	private static void Game(boolean loop, int guess, int diff) {
		Scanner input = new Scanner(System.in);
		boolean success = false;
		int random = (int) (Math.random() * (100) + 1);
		String gissa;
		int i = diff;
		int j = 0;
		do {
			System.out.println("Gissa nummret");
			System.out.println("du har " + i + " försök kvar" + '\n');
			// fixa -> gissa = input.next();
			guess = input.nextInt();

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

}
