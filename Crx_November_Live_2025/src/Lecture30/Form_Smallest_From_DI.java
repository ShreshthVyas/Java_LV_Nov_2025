package Lecture30;

import java.util.Arrays;
import java.util.Stack;

public class Form_Smallest_From_DI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IDIDDD";
		Stack<Integer> st =  new Stack<>();
		int ans[] =  new int[s.length()+1];
		
		int count =1;
		
		for (int i = 0; i <= s.length(); i++) {
			if( i == s.length() || s.charAt(i) == 'I') {// Assume an I at last
				ans[i] = count++;
				
				while(!st.isEmpty()) {// fill previous D in reverse order
					ans[st.pop()] = count++;
				}
			}
			else {
				st.push(i);
			}
		}
		System.out.println(count);
		System.out.println(Arrays.toString(ans));
		
	}

}
