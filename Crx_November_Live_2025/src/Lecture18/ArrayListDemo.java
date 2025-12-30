package Lecture18;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>  list = new ArrayList<>();
		list.add("AC");
		list.add("AD");
		list.add("AE");
		list.add("AF");
		list.add("AG");
		
		list.add(2, "EF");
		
		list.addFirst("AS");
		
		System.out.println(list);
		System.out.println(list.size());
		String a  = list.get(list.size()-1);//arr[i]
		System.out.println(a);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		for (String s : list) {
			System.out.print(s+" ");
		}
		
		list.set(3, "a");
		System.out.println(list);
		list.remove(2);
		Collections.sort(list);
	
		
		System.out.println(list);
		
		
	}

}
