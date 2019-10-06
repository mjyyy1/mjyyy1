package homeworkV40;
import java.util.Scanner;
public class fizzbuzz {

	public static void main(String[] args) {

		        Scanner input = new Scanner(System.in);

		        int x = input.nextInt();
		        int y = input.nextInt();
		        int N = input.nextInt();

		        for (int i = 1; i <= N; i++) {// ger i ett värde, och kör programmet tills i == N
		        	
		        	if (i % x == 0 && i % y == 0) {//om i är delbart med x och y skriv fizzbuzz
		    			System.out.println("FizzBuzz");
		    		}
		    		else if (i % x == 0) {//om i är delbart med x skriv fizz
		    			System.out.println("Fizz");
		    		}
		    		else if (i % y == 0) {//om i är delbart med y skriv buzz
		    			System.out.println("Buzz");
		    		}
		    		else {
		    			System.out.println(i);
		    		}
		        }
		        
	}







		    }

		
	


