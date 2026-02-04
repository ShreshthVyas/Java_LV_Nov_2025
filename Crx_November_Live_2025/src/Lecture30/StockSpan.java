package Lecture30;
import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 30,35,40,39,35,38,39,50};
		int ans [] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for (int i = 0; i < ans.length; i++) {
			while(!st.isEmpty() && arr[st.peek()]<= arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {// All elements are smaller before me
				ans[i] = i+1;
			}
			else {// numbers between me and the last number greater than me
				ans[i] = i - st.peek();
			}
			st.push(i);
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
