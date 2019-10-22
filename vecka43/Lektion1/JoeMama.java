package Lektion1;

import java.util.Scanner;

public class JoeMama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ask me who Joe is");
		String Joe = input.next();
		String Mama = "Who is Joe";
		String hej = "who is joe";
		String haj = "who is Joe";
		String hel = "Who is joe";
		
		if(Joe == Mama || Joe == hej || Joe == haj || Joe == hel) {
System.out.println("JOE MAMA");
	}
	}
}

