package homeworkV40;

import java.util.Scanner;

public class spavanac {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int timme = 0;
int minuter = 0;

timme = input.nextInt();
minuter = input.nextInt();

if(0 <= minuter && minuter <45) {
	timme -= 1;
	minuter += 60;
	minuter -= 45;
	
}
else {minuter -=45;}
if(timme < 0) {
	timme = 23;
}

System.out.println(timme + " " + minuter);
	}

}
