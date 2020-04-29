package Hang;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangMan {

	public static void main(String[] args) {
		
		int r;
		boolean spel = true;
		do {
			r = 30;
			RandomOrd(r);
			r = RandomOrd(r);
			Ord(r);
		} while (spel);

	}
	/**
	 * Denhär metoden skapar en random in som sedan används för att ta ett random index från ordlistan.
	 * @param r
	 * @return
	 */
	public static int RandomOrd(int r) {

		Random RanInd = new Random();
		return RanInd.nextInt(r);
	}

	public static void Ord(int r) {

		ArrayList<String> WordList = new ArrayList<String>();
		String[] Words = { "geography", "cat", "yesterday", "java", "truck", "opportunity",
                "fish", "token", "transportation", "bottom", "apple", "cake",
                "remote", "boots", "terminology", "arm", "cranberry", "tool",
                "caterpillar", "spoon", "watermelon", "laptop", "toe", "toad",
                "fundamental", "capitol", "garbage", "anticipate", "pesky" };

		for (int i = 0; i < Words.length; i++) {
			WordList.add(Words[i]);
		}
		String WordToGuess = WordList.get(r);
		String Ord = WordToGuess;
		Guess(Ord);
	}

	public static void Guess(String Ord) {
		ArrayList<String> GuessedChar = new ArrayList<String>();// denhär arraylisten sparar bokstäverna som du gissar
																// på
		StringBuffer sb = new StringBuffer(Ord.toUpperCase());// StringBuffer funkar som en string fast man kan ändra på
																// den till skillnad från en String som inte går att
																// ändra på

		GuessedChar.removeAll(GuessedChar);

		StringBuffer HiddenWord = new StringBuffer(Ord);
		boolean ind = true;
		boolean gissning = true;
		for (int i = 0; i < Ord.length(); i++) {
			HiddenWord.setCharAt(i, '-');
		}
		Scanner input = new Scanner(System.in);
		int Gkvar;
		Gkvar = 7;
		System.out.println("Guess the word");
		do {
			System.out.println(HiddenWord);
			if (Gkvar == 7) {
				System.out.println("you have " + Gkvar + " tries");
			}
			else {
				System.out.println("you have " + Gkvar + " tries left");	
			}
			
			if (!GuessedChar.isEmpty()) {
				System.out.println("you have guessed" + GuessedChar);
			}
			char Guess = input.next().toUpperCase().charAt(0);// tar första tecknet i det som användaren skriver och
																// använder det som gissning
			if (Character.isLetter(Guess)) {// Character.isLetter gör precis vad det låter, den kollar om charactern i
											// Guess är en bokstav och returnar true om det är och false om det inte är
											// en bokstav

				String guess = Character.toString(Guess);
				int index = sb.indexOf(guess);
				if (GuessedChar.contains(guess)) {
					System.out.println("guess something you have not guessed before");

				} else if (sb.toString().contains(guess)) {

					while (index >= 0) {

						if (index >= 0) {
							HiddenWord.setCharAt(index, Guess);
						}
						index = sb.indexOf(guess, index + 1);
						if (!HiddenWord.toString().contains("-")) {// kollar om hiddenword inte innehåller några -
																	// /kollar
																	// om ordet är rätt gissat
							System.out.println("Congratulations you won");
							Pagain(HiddenWord, gissning);
							gissning = false;
							break;

						}

					}
				} else if (!sb.toString().contains(guess)) {
					Gkvar--;
					if (Gkvar == 6) {
						System.out.println("  +---+\r\n" + "  |   |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
								+ "      |\r\n" + "=========");
					} else if (Gkvar == 5) {
						System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "      |\r\n" + "      |\r\n"
								+ "      |\r\n" + "=========");
					} else if (Gkvar == 4) {
						System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "  |   |\r\n" + "      |\r\n"
								+ "      |\r\n" + "=========");
					} else if (Gkvar == 3) {
						System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|   |\r\n" + "      |\r\n"
								+ "      |\r\n" + "=========");
					} else if (Gkvar == 2) {
						System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n"
								+ "      |\r\n" + "      |\r\n" + "=========");
					} else if (Gkvar == 1) {
						System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n"
								+ " /    |\r\n" + "      |\r\n" + "=========");
					} else if (Gkvar == 0) {
						System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n"
								+ " / \\  |\r\n" + "      |\r\n" + "=========");
						HiddenWord = sb;
						System.out.println("Game over you lost");
						Pagain(HiddenWord, gissning);
						gissning = false;

					}

				}
				if (!GuessedChar.contains(guess)) {
					GuessedChar.add(guess);
				}
			} else {
				System.out.println("you have to guess a letter");
				if (!GuessedChar.isEmpty()) {
					System.out.println("you have guessed " + GuessedChar);
				}

			}
		} while (gissning);

	}
	/**
	 * i den här metoden väljer spelaren om den vill köra igen eller stänga av.
	 * @param HiddenWord
	 * @param gissning
	 */
	public static void Pagain(StringBuffer HiddenWord, boolean gissning) {
		boolean valLoop = true;
		Scanner input = new Scanner(System.in);
		System.out.println("The word was " + HiddenWord.toString().toLowerCase());
		do {
			System.out.println("(1) play again");
			System.out.println("(2) Stop");
			String choise = input.nextLine();
			if (choise.equals("1")) {
				valLoop = false;
			} else if (choise.equals("2")) {
				System.out.println("thank you for playing");
				System.exit(0);
			} else {
				System.out.println("skriv 1 eller 2");
			}

		} while (valLoop);

	}

}
