package vecka37;

import java.util.Scanner;
//skriv Scan och tryck ctrl+space

public class Lektion2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);// behövs om man vill ha input
		
		String namn1 = "Malte Erlandsson";
		
		String namn2 = "Namn Efternamn";
		
		String namn3 = "Nman Nmanretfe";
		
		System.out.println("skriv ett namn");//ger ett kommando till användaren
		
		String namn4 = input.nextLine();//läser in ett namn från konsolen/det som användaren skriver
		
		System.out.println("skriv ett namn");
		
		String namn5 = input.nextLine();
		
		System.out.println("\nNAMN;");//print skriver på samma rad, println skriver på nästa rad
		System.out.println("\t" + namn1 + "\n" + "\t" + namn2 + "\n" + "\t" + namn3 + "\n" + "\t" + namn4 + "\n" + "\t" + namn5);
}

}
