package Lecture40;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<Integer> set =  new HashSet<>();
		TreeSet<Integer> set =  new TreeSet<>();
//		LinkedHashSet<Integer> set =  new LinkedHashSet<>();
		set.add(-10);
		set.add(10);
		set.add(10);
		set.add(100);
		set.add(20);
		set.add(10);
		
		System.out.println(set.contains(1000));
		
		set.remove(20);
		
		System.out.println(set);
		
		for (Integer i : set) {
			System.out.println(i);
		}
		
	}

}
