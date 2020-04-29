package Talspel;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		StringBuffer myName = new StringBuffer("-------");
		Scanner in = new Scanner(System.in);
		char n = in.next().charAt(0);
		myName.setCharAt(4, n);
		System.out.println(myName);
	}
}
