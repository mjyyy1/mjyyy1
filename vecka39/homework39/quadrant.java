package homework39;

import java.util.Scanner;

public class quadrant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int y = 0;
		int x = 0; 
		x = input.nextInt();
		y = input.nextInt();
		if (x>0 && y>0) {
			System.out.println("1");
		}
		else if (x<0 && y>0) {
			System.out.println("2");
		}
		else if (x<0 && y<0) {
			System.out.println("3");
		}
		else if (x>0 && y<0) {
			System.out.println("4");
		}
	}

}
