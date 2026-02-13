package Lecture32;

import Lecture29.stack;

public class DynamicStack extends stack {

	@Override
	public void push(int item) throws Exception {
		if (isFull()) {
			int newarr[] =  new int[2*arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			this.arr = newarr;
		}
		super.push(item);
	}
	
	public static void main(String[] args) throws Exception {
		DynamicStack st =  new DynamicStack();
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.Display();
	}
}
