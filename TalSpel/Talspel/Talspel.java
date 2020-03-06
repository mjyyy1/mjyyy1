package Talspel;

import java.util.Scanner;
import java.util.Random;

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
		boolean stop = true;
		boolean loop = true;
		int diff;
		String choice;
		
		while (loop == true) {
			System.out.println("Skriv 1 f�r normal(10 gissningar),2 f�r hard(5 gissningar) eller 3 f�r eget antall gissningar");//en meny d�r du v�ljer sv�righetsgrad
			choice = input.nextLine();
			if (choice.equals("1")) {

				diff = 10;
				Game(loop, diff);
				END();

			} else if (choice.equals("2")) {
				diff = 5;
				Game(loop, diff);
				END();
			}

			else if (choice.equals("3")) {
				diff = Antal();
				Game(loop, diff);
				END();
			}

		}

	}
/**
 * en metod som l�ter dig skriva in ett antal gissningar som du vill ha och skickar tillbaka
 * @return
 */
	private static int Antal() {
		Scanner input = new Scanner(System.in);
		String antalG;
		boolean loop = false;
		int test = 5;
		System.out.println("skriv antal gissningar du vill ha");
		while (!loop) {
			antalG = input.nextLine();
			if (antalG.matches("[0-9]+")) {// kollar om Stringen inneh�ller bara siffror mellan 0 och 9 och minst 1
											// siffra(.matches kollar om gissa uppn�r de kriterier som ges)
				test = (int) Long.parseLong(antalG);// om gissa uppn�r kriterierna s� parsas Stringen och blir en int
				break;
			} else {
				System.out.println("Skriv en siffra utan mellanslag");
			}

		}
		return test;

	}
/**
 * deth�r �r huvuddelen av spelet d�r personen gissar talet
 * @param loop
 * @param diff
 */
	private static void Game(boolean loop, int diff) {
		Scanner input = new Scanner(System.in);
		boolean success = true;
		int random = 100;
		random = Random(random);//kallar p� metoden som skapar ett random tal
		System.out.println("du ska gissa ett tal mellan 1 och 100");

		String gissa;
		int guess = 0;
		int i = diff;
		int j = 0;
		do {

			System.out.println("du har " + i + " f�rs�k kvar" + '\n');

			do {
				gissa = input.nextLine();
				if (gissa.matches("[0-9]+")) {//kollar om gissa inneh�ller bara siffror och minst ett tecken
					guess = (int) Long.parseLong(gissa);
					break;
				} else {
					System.out.println("Skriv ett tal utan mellanslag och andra tecken");
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
 * den h�r metoden skapar ett slumpat tal
 * @param random
 * @return
 */
	private static int Random(int random) {
		Random r = new Random();//Random �r en java metod som skapar randomiser
		return r.nextInt(random);
	}
/**
 * denh�r metoden st�nger av programet helt
 */
	private static void END() {
		Scanner input = new Scanner(System.in);
		String val;

		boolean stop = true;
		do {
			System.out.println("Skriv 1 f�r att k�ra om 2 f�r att avsluta");
			val = input.nextLine();
			if (val.equals("1")) {
				break;
			} else if (val.equals("2")) {
				System.out.println("thanks for playing <3");

				System.exit(0);//system exit st�nger av programmet helt
				break;
			}
		} while (stop = true);

	}
}
