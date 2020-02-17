package vecka3;

import java.util.Arrays;
import java.util.Scanner;

public class Randomiser {

	public static void main(String[] args) {

		vari();
	}

	public static void vari() {
		Scanner input = new Scanner(System.in);
		System.out.println("skriv ett heltal");
		int antal = input.nextInt();
		int intervall = input.nextInt();
		int j�mf�r = 0;
		int[] numbers = new int[antal];
		boolean swap = false;

		calc(antal, intervall, j�mf�r, numbers, swap);
	}

	public static void calc(int antal, int intervall, int j�mf�r, int[] numbers, boolean swap) {
		int temp;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * intervall);// slumpar 37 heltal mellan 0 och 99
		}
		System.out.println(Arrays.toString(numbers));

		do {

			swap = false;

			for (int i = 0; i < numbers.length - 1; i++) {

				if (numbers[i] > numbers[i + 1]) {
					temp = numbers[i];// sparar tillf�lligt v�rde p� v�nstra sidan
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					j�mf�r++;
					swap = true;
				}

			}

		} while (swap);
		System.out.println(Arrays.toString(numbers));
		System.out.println("antal iterationer: " + j�mf�r);
	}

}