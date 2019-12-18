package Monday;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class FindProblems2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int index;
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = i+1;
			
		}
		
		System.out.println("give me a number or face my UNICORN");
		index = input.nextInt();
		try {
			System.out.println(numbers[index]);
		} catch (Exception e) {
			System.out.println("Array index out of bound");
		}
		
	}

}
