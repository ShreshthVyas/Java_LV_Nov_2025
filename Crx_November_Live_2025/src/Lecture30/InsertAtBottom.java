package Lecture30;

import java.util.Stack;

public class InsertAtBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		iab(st,60);
		System.out.println(st);
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
