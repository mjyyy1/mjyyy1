package arrays;

public class arrays2 {

	public static void main(String[] args) {
		
		double []numbers = new double[20];
		double []numbers2 = {12.2,34,-45-11231234};
		String [] namn = {"Gabriel", "Petter", "Malte", "Emil"};
	
		for (int i = 0; i < namn.length; i++) {
			int antalA = 0;
			
			for (int j = 0; j < namn.length; j++) {
				if (namn[i].contains("a")) {
					antalA++;
					
				}
			}
			
			System.out.println(antalA);
			
		}
		
	}

}
