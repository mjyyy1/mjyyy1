package uppgifter;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		int x = 0;
		int z = 0;
		do {
			
			x = input.nextInt();
			z = z + x;
			if (x>0) {
				i++;
			}
			if (x == 0) {
				System.out.println("medelvärde " + z/i + "\n" + "summa av input " + z );
				break;
			}
			
			
			
		}
		while (x>0); 
		
		

	}

}
