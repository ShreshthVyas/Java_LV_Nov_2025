package Lecture24;

import java.util.ArrayList;

public class ArrayListCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =  new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		ArrayList<Integer> temp =  new ArrayList<>(list);
		
		System.out.println(list);
		System.out.println(temp);
		
		
	}

}
