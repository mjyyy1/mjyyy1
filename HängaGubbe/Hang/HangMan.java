package Hang;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangMan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String oneortwo;
		String pWord ="";
		int r;
		boolean spel = true;
		do {
			System.out.println("Hangman" + "\n");
			System.out.println("(1) 1 player");
			System.out.println("(2) 2 players");
			oneortwo = input.nextLine();
			if (oneortwo.equals("1")||oneortwo.equals("2")) {//kollar om det man har skrivit �r 1 eller 2 annars f�r man skriva om
				if (oneortwo.equals("1")) {
					System.out.println("you chose one player");
					r = 30;
					RandomOrd(r);
					r = RandomOrd(r);
					Ord(r,oneortwo,pWord);
				}
				else {
					System.out.println("you chose two players");
					pWord = playerWord(pWord);
					String Ord ="";
					Guess(Ord,pWord,oneortwo);
				}
			}

			
		} while (spel);

	}
	/**
	 * i denh�r metoden skriver spelaren in sitt or som den andra ska gissa p�
	 * @param pWord
	 * @return
	 */
	public static String playerWord(String pWord) {
		Scanner input = new Scanner(System.in);
		System.out.println("player 1 type a word");
		pWord = input.nextLine();
		return pWord;
		
	}
	
	
	/**
	 * Denh�r metoden skapar en random int som sedan anv�nds f�r att ta ett random index fr�n ordlistan.
	 * @param r
	 * @return
	 */
	public static int RandomOrd(int r) {

		Random RanInd = new Random();
		return RanInd.nextInt(r);
	}
/**
 * H�r finns alla orden och g�r d� om Ord till ett av orden som man ska gissa.
 * @param r
 */
	public static void Ord(int r,String oneortwo,String pWord) {

		ArrayList<String> WordList = new ArrayList<String>();
		String[] Words = { "geography", "cat", "yesterday", "java", "truck", "opportunity",
                "fish", "token", "transportation", "bottom", "apple", "cake",
                "remote", "boots", "terminology", "arm", "cranberry", "tool",
                "caterpillar", "spoon", "watermelon", "laptop", "toe", "toad",
                "fundamental", "capitol", "garbage", "anticipate", "pesky" };

		for (int i = 0; i < Words.length; i++) {
			WordList.add(Words[i]);
		}
		
		String Ord = WordList.get(r);
		Guess(Ord,pWord,oneortwo);
	}
	/**
	 * h�r gissar spelaren och gissningen kollas s� att den n�r alla kriterier
	 * @param Ord
	 */
	public static void Guess(String Ord,String pWord ,String oneortwo) {
		ArrayList<String> GuessedChar = new ArrayList<String>();// denh�r arraylisten sparar bokst�verna som du gissar p�
		StringBuffer sb = new StringBuffer(Ord.toUpperCase());// StringBuffer funkar som en string fast man kan �ndra p� den till skillnad fr�n en String som inte g�r att �ndra p�
		if (oneortwo.equals("2")) {
			sb.append(pWord.toUpperCase());//append g�r om en String till en StringBuffer
		}
		GuessedChar.removeAll(GuessedChar);
		
		StringBuffer HiddenWord = new StringBuffer(sb);
		boolean ind = true;
		boolean gissning = true;

		for (int i = 0; i < sb.length(); i++) {
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
			char Guess = input.next().toUpperCase().charAt(0);// tar f�rsta tecknet i det som anv�ndaren skriver och
																// anv�nder det som gissning
			if (Character.isLetter(Guess)) {// Character.isLetter g�r precis vad det l�ter, den kollar om charactern i
											// Guess �r en bokstav och returnar true om det �r och false om det inte �r
											// en bokstav

				String guess = Character.toString(Guess);
				int index = sb.indexOf(guess);
				if (GuessedChar.contains(guess)) {//kollar om det du gissa finns i arraylisten med bokst�ver du har gissat och om den g�r det s� f�r man gissa om annars g�r den vidare till n�sta
					System.out.println("guess something you have not guessed before");

				} else if (sb.toString().contains(guess)) {//h�r kollar den om det du gissar finns i ordet och om det g�r det s� fixar den s� att du kan se vilka du har i ordet

					while (index >= 0) {

						if (index >= 0) {
							HiddenWord.setCharAt(index, Guess);
						}
						index = sb.indexOf(guess, index + 1);
						if (!HiddenWord.toString().contains("-")) {// kollar om hiddenword inte inneh�ller n�gra -
																	// /kollar  
																	// om ordet �r r�tt gissat
							System.out.println("Congratulations you won");
							Pagain(HiddenWord, gissning);
							gissning = false;
							break;

						}

					}
				} else if (!sb.toString().contains(guess)) {//h�r m�las gubben upp om ordet inte inneh�ller bokstaven du gissat och drar ner antalet gissningar du har
					Gkvar--;
					ascii(Gkvar,HiddenWord,sb,gissning);               

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

	public static boolean ascii(int Gkvar,StringBuffer HiddenWord,StringBuffer sb,boolean gissning) {
		
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
		return gissning;

	}
	
	/**
	 * i den h�r metoden v�ljer spelaren om den vill k�ra igen eller st�nga av.
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
