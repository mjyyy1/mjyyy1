package vecka38;

import java.util.Scanner;

public class L�xaV38 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double tal1 = 0;
		double tal2 = 0;
		double tal3 = 0;
		double tal4 = 0;
		double tal5 = 0;
		double dela = 5;

		System.out.println("Skriv 5 heltal:");
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		tal3 = input.nextInt();
		tal4 = input.nextInt();
		tal5 = input.nextInt();
		double medel = (tal1 + tal2 + tal3 + tal4 + tal5) / dela;// r�knar ut medelv�rdet

		if (tal1 >= tal2 && tal1 >= tal3 && tal1 >= tal4 && tal1 >= tal5) {
			
			System.out.println("St�rst:" + "\t" + tal1);
		}
		else if (tal2 >= tal1 && tal2 >= tal3 && tal2 >= tal4 && tal2 >= tal5) {
			System.out.println("St�rst:" + "\t" + tal2);
		}
		
		else if (tal3 >= tal1 && tal3 >= tal2 && tal3 >= tal4 && tal3 >= tal5) {
			System.out.println("St�rst:" + "\t" + tal3);			
		}
		else if (tal4 >= tal1 && tal4 >= tal3 && tal4 >= tal3 && tal4 >= tal5) {
			System.out.println("St�rst:" + "\t" + tal4);
		}
		else if (tal5 >= tal1 && tal5 >= tal3 && tal5 >= tal3 && tal5 >= tal4) {
			System.out.println("St�rst:" + "\t" + tal5);
		};
		
		
		if  (tal1 <= tal2 && tal1 <= tal3 && tal1 <= tal4 && tal1 <= tal5) {
			System.out.println("Minst:" + "\t" + tal1);
		}
		else if (tal2 <= tal1 && tal2 <= tal3 && tal2 <= tal4 && tal2 <= tal5) {
			System.out.println("Minst:" + "\t" + tal2);
		}
		else if (tal3 <= tal1 && tal3 <= tal2 && tal3 <= tal4 && tal3 <= tal5) {
			System.out.println("Minst:" + "\t" + tal3);
			}
		else if (tal4 <= tal1 && tal4 <= tal3 && tal4 <= tal2 && tal4 <= tal5) {
			System.out.println("Minst:" + "\t" + tal4);
			}
		else if (tal5 <= tal1 && tal5 <= tal3 && tal5 <= tal4 && tal5 <= tal2) {
			System.out.println("Minst:" + "\t" + tal5);
			}
		System.out.println("medelv�rde :" + medel);
	}
    
}
