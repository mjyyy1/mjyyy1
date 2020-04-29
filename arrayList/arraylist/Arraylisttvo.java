package arraylist;

import java.util.ArrayList;

public class Arraylisttvo {
public static void main(String[] args) {
	ArrayList<Integer> alist = new ArrayList<Integer>();
	for (int i = 0; i < 50; i++) {
		alist.add(new Integer(i+100));
	}
	for (int i = 0; i < alist.size(); i++) {
		System.out.println(alist.get(i).intValue());
	}
	System.out.println(alist);
}
}
