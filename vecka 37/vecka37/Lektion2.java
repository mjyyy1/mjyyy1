package vecka37;

import java.util.Scanner;
//skriv Scan och tryck ctrl+space

public class Lektion2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);// beh�vs om man vill ha input
		
		String namn1 = "Malte Erlandsson";
		
		String namn2 = "Namn Efternamn";
		
		String namn3 = "Nman Nmanretfe";
		
		System.out.println("skriv ett namn");//ger ett kommando till anv�ndaren
		
		String namn4 = input.nextLine();//l�ser in ett namn fr�n konsolen/det som anv�ndaren skriver
		
		System.out.println("skriv ett namn");
		
		String namn5 = input.nextLine();
		
		System.out.println("\nNAMN;");//print skriver p� samma rad, println skriver p� n�sta rad
		System.out.println("\t" + namn1 + "\n" + "\t" + namn2 + "\n" + "\t" + namn3 + "\n" + "\t" + namn4 + "\n" + "\t" + namn5);
}

}
