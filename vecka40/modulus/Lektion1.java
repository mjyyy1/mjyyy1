package modulus;

public class Lektion1 {

	public static void main(String[] args) {
		//% == modulus
		int tal1 = 47;
		int tal2 = 19;
		int tal3 = 69;
		int tal4 = -137;
		
		System.out.println(tal1%3);//testar ifall tal1 �r delbart med 3
								   // �r den det s� blir svaret 0, om inte s� anges rest-
		int sum = 0;
		for (int i =0; i < 101 ; i++ ) {
		if (i % 3 == 0) {System.out.println("talet " + i + " �r delbart med 3");
		sum += i;
		
		}
		
		
		}
		System.out.println("summan av alla tal delbart med 3: " + sum);
	}

}
