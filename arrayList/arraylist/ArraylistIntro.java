package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistIntro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> NameList = new ArrayList<String>();
		
		String name = input.nextLine();
		NameList.add(name);//l�ggs p� index 0
		NameList.add("malte");//L�ggs p� index 1
		NameList.add(1,"Emil");//l�ggs p� index 1 och flyttar p� den tidigare index 1 s� att den hamnar p� index 2
		for (int i = 0; i < NameList.size(); i++) {
			
			System.out.println(NameList.get(i));//skriver ut ArrayList inneh�llet med .size() och .get()
		}
		//NameList.remove("Emil");//tar bort ett namn
	//	System.out.println(NameList);
		
		//NameList.removeAll(NameList);//tar bort allt i NameList/ t�mmer NameList
		
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		for (int i = 0; i <= 5; i++) {
			Numbers.add(i);
			System.out.println(Numbers.get(i));
		
		}
		
		
	}

}
