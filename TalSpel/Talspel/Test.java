package Talspel;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		int result;
		//is_numeric
		isNumeric(str);
	
	}
	public static boolean isNumeric(String str) {
	    if (str == null) {
	        return false;
	    }
	    int sz = str.length();
	    for (int i = 0; i < sz; i++) {
	        if (Character.isDigit(str.charAt(i)) == false) {
	        	System.out.println("false");
	            return false;
	        }
	    }
	    System.out.println("true");
	    return true;
	    
	}
}
