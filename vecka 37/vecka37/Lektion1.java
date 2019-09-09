package vecka37;

public class Lektion1 {

	public static void main(String[] args) {
		//ett sätt att skriva kommentarer
		/*ett annat sätt att skriva kommentarer
		 */	
		
		int heltal1 = 25;//skapar en låda som heter heltal1 och fyller den med ett heltal.
		int svar; //deklarera (har inget värde)
		
		svar = heltal1*heltal1;
		
		System.out.println("svar:" + heltal1*heltal1);//syso (ctr space) + tecknet kallas konkatinera
		
		double pi = 3.14;
		int radie = 5;
		double area = pi*radie*radie;
		System.out.println("Arean är " + area + " cm^2");
		
		long stortHeltal = 9000000000000000000L;
		System.out.println(stortHeltal +1);
 	}

}
