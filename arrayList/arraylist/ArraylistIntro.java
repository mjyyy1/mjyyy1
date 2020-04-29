package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistIntro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> NameList = new ArrayList<String>();
		
		String name = input.nextLine();
		NameList.add(name);//läggs på index 0
		NameList.add("malte");//Läggs på index 1
		NameList.add(1,"Emil");//läggs på index 1 och flyttar på den tidigare index 1 så att den hamnar på index 2
		for (int i = 0; i < NameList.size(); i++) {
			
			System.out.println(NameList.get(i));//skriver ut ArrayList innehållet med .size() och .get()
		}
		//NameList.remove("Emil");//tar bort ett namn
	//	System.out.println(NameList);
		
		//NameList.removeAll(NameList);//tar bort allt i NameList/ tömmer NameList
		
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		for (int i = 0; i <= 5; i++) {
			Numbers.add(i);
			System.out.println(Numbers.get(i));
		
		}
		
		
	}

}
