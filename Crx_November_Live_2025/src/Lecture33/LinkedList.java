package Lecture33;

public class LinkedList {

	public class Node{
		int val;
		Node next;// address of the next node
		
		public Node() {
			
		}
		public Node(int val,Node next) {
			this.next = next;
			this.val = val;
		}
	}
	
	private Node head;
	private Node tail;
	private int size = 0;
	
	public void addFirst(int item) {
		if(size == 0) {//Empty List Or head = null
			Node nn =  new Node();
			nn.val = item;
			this.head = nn;
			this.tail  = nn;
			this.size++;
		}
		else {
			Node nn =  new Node();
			nn.val = item;
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}
	}
	
	public void addLast(int item) {
		if(size == 0) {
			Node nn =  new Node();
			nn.val = item;
			this.head = nn;
			this.tail  = nn;
			this.size++;
		}
		else {
			Node nn =  new Node();
			nn.val = item;
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}
	
	public void RemoveFirst() {
		if(size == 0) {
			return;
		}
		if(size == 1) {
			Node temp = head;
			this.head = this.head.next;
			temp.next = null;
			this.tail = null;
			this.size--;
		}
		else {
			Node temp = head;
			this.head = this.head.next;
			temp.next = null;
			this.size--;
		}	
	}
	
	public void RemoveLast() {
		if(size == 0) {
			return;
		}
		if(size == 1) {
			this.tail = null;
			this.head = null;
			this.size--;
		}
		else {
			Node temp = head;
			while(temp.next!=this.tail) {
				temp = temp.next;
			}
			temp.next =null;
			this.tail = temp;
			this.size--;
		}
	}
	
	public void Display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val + " ==> ");
			temp = temp.next;
		}
		System.out.println("End");
	}
	
	public void addAtIdx(int item, int idx) {
		int count = 0;
		Node temp = head;
		while(count!=idx-1) {
			temp = temp.next;
			count++;
		}
		Node nn =  new Node(item, temp.next);
		temp.next = nn;
		this.size++;
	}
	
	public void removeAtIdx(int idx) {
		int count = 0;
		Node temp = head;
		while(count!=idx-1) {
			temp = temp.next;
			count++;
		}
		temp.next = temp.next.next;
		this.size--;
	}
	
}
