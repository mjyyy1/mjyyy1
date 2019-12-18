package Monday;

import java.util.Scanner;

public class FindPeoblemsWithUrCode {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		boolean success = false;

		System.out.println("Skriv ett heltal");

		while (!success) {

			try {
				number = input.nextInt();
				System.out.println(number);
				success = true;
			} catch (Exception e) {
				input.next();
				System.out.println("dumbass");
			}
		}
	}

}
