package Tisdag;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int choice;

		System.out.println("Welcome to HELL choose wisely");
		System.out.println("(1) - New game");
		System.out.println("(2) - Load Game");
		System.out.println("(3) - Options");
		System.out.println("(4) - Credits");
		System.out.println("(5) - Leave HELL");
		System.out.println();

		choice = input.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Give me a sec");
			break;
			
		case 2:
			System.out.println("Welp you cant do that now");
			break;
			
		case 3:
			System.out.println("Ohh so u dnt like my settings");
			break;
			
		case 4:
			System.out.println("Why would u even look at this");
			break;
			
		case 5:
			System.out.println("So ur leaving now...");
			break;

		default:
			System.out.println("I cant let you do this");
			break;
		}

	}

}
