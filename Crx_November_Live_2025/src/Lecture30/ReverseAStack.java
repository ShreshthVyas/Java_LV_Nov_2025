package Lecture30;

import java.util.Stack;

public class ReverseAStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
	}

	private static void reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			return;
		}
		int a = st.pop();
		reverse(st);
		iab(st ,a);
	}
	private static void iab(Stack<Integer> st, int i) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			st.push(i);
			return;
		}
		int a = st.pop();
		iab(st, i);
		st.push(a);
	}

}
