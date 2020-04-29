package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOvning {

	public static void main(String[] args) {

		ArrayList<String> NameList = new ArrayList<String>();
		String[] Names = { "Billskog Gabriel", "Bratland Petter", "Dahlqvist Ida", "Erlandsson Malte", "Favoryt Kalle",
				"Gustafsson Emil", "Hasic Edvin", "Helenius Anton", "Jenslöv Max", "Jonsson Svante", "Kamo Vivian",
				"Khanzade Vakil Kandi Pedram", "Leisten David", "Lindqvist Lucas", "Lindström Linus",
				"Markström Stenhammar Zachris", "Nelin Jacob", "Niklasson Theodor", "Nilsson Fredrik", "Norberg Max",
				"Ohlsson Andreas", "Parsa Filip", "Richardsson Filippa", "Roman David", "Romland Linus",
				"Sandström Ludvig", "Simonsen Johan", "Simonsen Markus", "Tammpere Patrik", "Thilén Philip",
				"Utbult David", "Vins Andreas" };

		// Lägg in följande namn i arrayListen "namn"
		// ["Billskog Gabriel" , "Bratland Petter" , "Dahlqvist Ida" , "Erlandsson
		// Malte" , "Favoryt Kalle" , "Gustafsson Emil" , "Hasic Edvin" , "Helenius
		// Anton" , "Jenslöv Max" , "Jonsson Svante" , "Kamo Vivian" , "Khanzade Vakil
		// Kandi Pedram" , "Leisten David" , "Lindqvist Lucas" , "Lindström Linus" ,
		// "Markström Stenhammar Zachris" , "Nelin Jacob" , "Niklasson Theodor" ,
		// "Nilsson Fredrik" , "Norberg Max" , "Ohlsson Andreas" , "Parsa Filip" ,
		// "Richardsson Filippa" , "Roman David" , "Romland Linus" , "Sandström Ludvig"
		// , "Simonsen Johan" , "Simonsen Markus" , "Tammpere Patrik" , "Thilén Philip"
		// , "Utbult David" , "Vins Andreas"]
		for (int i = 0; i < Names.length; i++) {
			NameList.add(Names[i]);
			System.out.println(NameList.get(i));
		}
		System.out.println();

		Collections.swap(NameList, 4, 9);
		for (int i = 0; i < NameList.size(); i++) {
			System.out.println(NameList.get(i));
		}
		System.out.println();
		Collections.swap(NameList, 4, 9);// byter tillbaka 4 och 9

		NameList.add(0,"Erlandsson Malte");
		for (int i = 0; i < NameList.size(); i++) {
			System.out.println(NameList.get(i));
		}
		NameList.remove(0);
		System.out.println();
		
		for (int i = 0; i < NameList.size(); i++) {
			if (NameList.get(i).startsWith("L")) {
				NameList.remove(i);
			}
			System.out.println(NameList.get(i));
		}

		// Byt plats på 5:e och 10:e namnet och skriv ut listan

		// Lägg in en dublett av valfritt namn från listan på första platsen och skriv
		// ut listan

		// Ta bort alla namn som börjar på bokstaven L och skriv ut listan

		// Flytta ditt namn till första platsen och skriv ut listan

		// Sortera namnlistan omvänd från Ö till A

	}

}
