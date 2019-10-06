package modulus;

public class Lektion1part2 {

	public static void main(String[] args) {
		int turn = 0;
		while(true) {//skriver ut vems tur det är tills att det blir turn 100 där en break skippar loopen.
			
			turn ++;
			
			if(turn%3 == 0) {
				System.out.println("Davids tur");
			}
			else if (turn%3 == 1) {
				System.out.println("Johans tur");
			}
			else if (turn%3 == 2) {
				System.out.println("Lukas tur");
			}
			if(turn == 100) {
				break;
			}
			
		}
		
	}

}
