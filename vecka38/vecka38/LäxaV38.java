package vecka38;

import java.util.Scanner;

public class LäxaV38 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int tal1 = 0;
		int tal2 = 0;
		int tal3 = 0;
		int tal4 = 0;
		int tal5 = 0;
		int dela = 5;

		System.out.println("Skriv 5 heltal:");
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		tal3 = input.nextInt();
		tal4 = input.nextInt();
		tal5 = input.nextInt();
		double medel = (tal1 + tal2 + tal3 + tal4 + tal5) / dela;// räknar ut medelvärdet

		if (tal1 >= tal2 && tal1 >= tal3 && tal1 >= tal4 && tal1 >= tal5) {
			
			System.out.println("Störst:" + "\t" + tal1);
		}
		else if (tal2 >= tal1 && tal2 >= tal3 && tal2 >= tal4 && tal2 >= tal5) {
			System.out.println("Störst:" + "\t" + tal2);
		}
		
		else if (tal3 >= tal1 && tal3 >= tal2 && tal3 >= tal4 && tal3 >= tal5) {
			System.out.println("Störst:" + "\t" + tal3);			
		}
		else if (tal4 >= tal1 && tal4 >= tal3 && tal4 >= tal3 && tal4 >= tal5) {
			System.out.println("Störst:" + "\t" + tal4);
		}
		else if (tal5 >= tal1 && tal5 >= tal3 && tal5 >= tal3 && tal5 >= tal4) {
			System.out.println("Störst:" + "\t" + tal5);
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
		System.out.println("medelvärde :" + medel);
	}
    
}
