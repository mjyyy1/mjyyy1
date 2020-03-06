package Talspel;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String text = keyboard.nextLine();
		if (text.matches("[0-9]+")) {//kollar om Stringen innehåller bara siffror mellan 0 och 9 och minst 1 siffra
			int i = (int)Long.parseLong(text);
			System.out.println(i);
		}
		else {System.out.println("nono");}
	}
}
