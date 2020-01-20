package vecka3;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] numbers = { 4, 8, 1, 5, 9, 3, 6, 2, 7, 0 };

		boolean swap = false;
		int temp;
		System.out.println(Arrays.toString(numbers));
		do {
			
			swap = false;
			
			for (int i = 0; i < numbers.length - 1; i++) {

				if (numbers[i] > numbers[i + 1]) {
					temp = numbers[i];// sparar tillfälligt värde på vänstra sidan
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swap = true;
				}
				
			}

		} while (swap);
		System.out.println(Arrays.toString(numbers));

	} 
	

}
