package Lecture31;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int largestRectangleArea(int[] heights) {
		Stack<Integer> st = new Stack<>();
		int ans = 0;
		
		for (int i = 0; i < heights.length; i++) {
			while(!st.isEmpty() && heights[i]<=heights[st.peek()]) {
				// i tells me the next smaller
				int h = heights[st.pop()];
				if(st.isEmpty()) {
					int w = i;// all bars greater or equal to me before me
					ans = Math.max(ans, h*w);
				}
				else {
					int p =  st.peek();// previous smaller
					int w = i-p-1;
					ans = Math.max(ans, h*w);
				}
			}
            st.push(i);
		}
		int i =  heights.length;// Assume 0 sized bar on last 
		while(!st.isEmpty()) {
			// i tells me the next smaller
			int h = heights[st.pop()];
			if(st.isEmpty()) {
				int w = i;// all bars greater or equal to me before me
				ans = Math.max(ans, h*w);
			}
			else {
				int p =  st.peek();// previous smaller
				int w = i-p-1;
				ans = Math.max(ans, h*w);
			}
		}
		return ans;
	}

}
