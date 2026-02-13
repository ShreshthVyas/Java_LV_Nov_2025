package Lecture29;

public class stack {

	protected int arr[];
	protected int top = -1;
	
	public stack(int size) {
		this.arr = new int[size];
	}
	public stack() {
		System.out.println("IN Stack");
		this.arr = new int[5];
	}
	//O(1)
	public boolean isEmpty() {
		return top==-1;
	}
	//O(1)
	public boolean isFull() {
		return top == arr.length -1;
	}
	
	//O(1)
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is Full");
		}
		top++;
		arr[top] = item;
	}
	//O(1)
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int temp = arr[top];
		arr[top] = 0;
		top--;
		return temp;
	}
	
	//O(1)
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return arr[top];
	}
	//O(1)
	public int size() {
		return top+1;
	}
	
	public void Display() {
		
		for (int i = top; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	

}
