package Lecture30;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5 , 2 ,6 ,9, 1000, 99, 4,101,3,7};
		int ans[] =  new int[arr.length];
		Stack<Integer> st =  new Stack<>();
		
		for (int i = 0; i < ans.length; i++) {
			while(!st.isEmpty() && arr[st.peek()]<arr[i]) {
				int idx  = st.pop();
				ans[idx] = arr[i];// arr[i] becomes NGE of arr[idx]
			}
			st.push(i);
		}
		
		// for elements with no NGE
		while(!st.isEmpty()) {
			int idx  = st.pop();
			ans[idx] = -1;
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
