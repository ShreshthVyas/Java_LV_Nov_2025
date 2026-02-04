package Lecture29;

import java.util.Stack;

public class JavaStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s);
		
		s.pop();
		
		s.push(100);
		
		System.out.println(s);
	}

}
