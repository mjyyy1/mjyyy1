package Talspel;

import java.util.Scanner;

public class Talspel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		difficulty();// kallar p� metoden difficulty
	}

	/**
	 * kollar vilken sv�righetsgrad du vill ha och skickar dig till metoden som �r
	 * sj�lva spelet
	 * Jag anv�nde String ist�llet f�r en int f�r att slippa anv�nda try catch
	 */
	private static void difficulty() {
		Scanner input = new Scanner(System.in);
		String val;
		boolean loop = true;
		int guess = 0;
		int diff;
		String choice;

		while (loop == true) {
			System.out.println("v�lj sv�righetsgrad");
			System.out.println("skriv 1 f�r normal eller 2 f�r hard ");
			choice = input.next();
			if (choice.equals("1")) {
				System.out.println("du har 10 f�rs�k");
				diff = 10;
				Game(loop, guess, diff);
				System.out.println("Skriv 1 f�r att k�ra om 2 f�r att avsluta");

				val = input.next();

				if (val.equals("1")) {
				} else if (val.equals("2")) {
					loop = false;
				} else {
					System.out.println("Skriv 1 f�r att k�ra om 2 f�r att avsluta");
				}

			} else if (choice.equals("2")) {
				System.out.println("du har 5 f�rs�k");
				diff = 5;
				Game(loop, guess, diff);
				System.out.println("Skriv 1 f�r att k�ra om 2 f�r att avsluta");
				val = input.next();
				if (val.equals("1")) {
				} else if (val.equals("2")) {
					loop = false;
				} else {
					System.out.println("Skriv 1 f�r att k�ra om 2 f�r att avsluta");
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
			System.out.println("du har " + i + " f�rs�k kvar" + '\n');
			// fixa -> gissa = input.next();
			guess = input.nextInt();

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

}
