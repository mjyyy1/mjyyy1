package uppgifter;

import java.util.Scanner;

public class Uppgift4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		int x = 0;
		int z = 0;
		while(!(z >= 100000 || i == 10)) {
			
			x = input.nextInt();
			z += x;
			System.out.println(z);
			if (x>0) {
				i++;
			}
			System.out.println();
			
			
		}
		
		
	}

}
