package reeeeeeeeeeeeeeeeeeeeeeEEEEEEEEEEEEEEEEeee;

import java.util.Arrays;

public class REEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEee {

	public static void main(String[] args) {
	
		// 100 tal i intervallet [0-9]
		int[] numbers1 = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};
		System.out.println("Antal 7or: " + Antal7(numbers1));
		System.out.println("Flest av " + Most(numbers1));
		System.out.println("Minst av " + Least(numbers1));
		System.out.println("Summa " + Summa(numbers1));
		System.out.println("Antal av varje siffra" + AntalSif(numbers1));
		
		String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
		System.out.println("Antal Tom " + AntalNamn(names));
		System.out.println("Plats på Drusilla " + Drusilla(names));
		L(names);
		Längd(names);
	
		
			

	}
/**
 * Söker efter 7or och räknar och skickar tillbaka antalet 7or
 * @param numbers1
 * @return
 */
	public static int Antal7(int[] numbers1) {
		int sum = 0;
		for (int i = 0; i < numbers1.length; i++) {
			
			if (numbers1[i] == 7) {
				sum++;
			}
		}

		return sum;
	}
	/**
	 * söker efter namn som är samma som Tom
	 * @param names
	 * @return
	 */
	public static int AntalNamn(String[] names) {
		int antal = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Tom")) {
				antal++;
			}
		}
		return antal;
	}
	/**
	 * räknar alla olika talen och skickar tillbaka det talet med flest antal
	 * @param numbers1
	 * @return
	 */
	public static int Most(int[] numbers1) {
		int Most = 0;
		
		int Max = 0;
		for (int i = 0; i < 10; i++) {
			int Count = 0;
			for (int j = 0; j < numbers1.length; j++) {
				if (numbers1[j] == i) {
				Count++;
				}	
			}
			
			if ( Max <= Count) {
				Most = i;
				Max = Count;
			}
			
		}

		return Most;
	}
	/**
	 * Söker efter talet med minst antal lika och skickar tillbaka det
	 * @param numbers1
	 * @return
	 */
	public static int Least(int[] numbers1) {
		int Least = 0;
		int Minst = 100;
		
		for (int i = 0; i < 10; i++) {
			int Count = 0;
			for (int j = 0; j < numbers1.length; j++) {
				if (numbers1[j] == i) {
				Count++;
				}	
			}
			
			if ( Minst >= Count) {
				Least = i;
				Minst = Count;
			}
			
		}

		return Least;
	}
	/**
	 * söker efter namnet drusilla och skriver ut vilken plats hon står på
	 * @param names
	 * @return
	 */
	public static int Drusilla(String[] names) {
		int Plats = 0;
		for (int i = 0; i < names.length; i++) {
			
			if (names[i].equals("Drusilla")) {
				Plats = i;
			}
			
		}
		return Plats;
		
	}
	/**
	 * räknar ihop alla jämna tal och skickar tillbaka summan
	 * @param numbers1
	 * @return
	 */
	public static int Summa(int[] numbers1) {
        int sum = 0;
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] % 2 == 0) {
                sum = sum + numbers1[i];
            }
        }
        return sum;
    }
	/**
	 * räknar antalet på varje siffra och skriver ut dem i ordning
	 * @param numbers1
	 * @return
	 */
	public static String AntalSif(int[] numbers1) {
		
		
        int[] amount = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < numbers1.length; j++) {

                if (numbers1[j] == i) {

                    amount[i]++;

                }

            }
        }

        return Arrays.toString(amount);
        
    }
	/**
	 * Räknar antal namn som börjar på L
	 * @param names
	 */
	public static void L(String[] names) {
		int a = 0;
		 for (int i = 0; i < names.length; i++) {
	            if (names[i].startsWith("L")) {
	             a++;
		
	}
	
		 }
		 System.out.println("Antal namn som börjar på L " + a);
	}
	/**
	 * räknar namn som är 5 bokstäver långa
	 * @param names
	 */
	public static void Längd(String[] names) {
		int a = 0;
		 for (int i = 0; i < names.length; i++) {
	            if (names[i].length() == 5) {
	             a++;
		
	}
	
		 }
		 System.out.println("Antal namn som är 5 bockstäver långa " + a);
	}
}
