package Lecture29;

public class Queue {
	private int arr[];
	private int size = 0;
	private int front  =0;
	public Queue() {
		this.arr = new int[5];
	}
	public Queue(int capacity) {
		this.arr = new int[capacity];
	}
	
	public boolean isFull() {
		return this.size == this.arr.length;
	}
	public boolean isEmpty() {
		return this.size == 0;
	}
	//O(1)
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is Full");
		}
		int idx = (this.front + this.size) % this.arr.length;
		this.arr[idx] = item;
		this.size++;
	}
	
	public int Dequeu() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Full");
		}
		int temp = arr[front];
		this.arr[front] = 0;
		front = (front+1) % arr.length;
		this.size--;
		return temp;
	}
	
	public void Display() {
		
		for (int i = 0; i < this.size; i++) {
			int idx = (front + i)% arr.length;
			System.out.print(arr[idx]+ " ");
		}
		System.out.println();
	}
}
