package Lecture34;

public class CyclicLL {

	public class Node {
		int val;
		Node next;// address of the next node

		public Node() {

		}

		public Node(int val, Node next) {
			this.next = next;
			this.val = val;
		}
	}

	private Node head;
	private Node tail;
	private int size = 0;

	public void addFirst(int item) {
		if (size == 0) {// Empty List Or head = null
			Node nn = new Node();
			nn.val = item;
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			Node nn = new Node();
			nn.val = item;
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}
	}

	public void addLast(int item) {
		if (size == 0) {
			Node nn = new Node();
			nn.val = item;
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			Node nn = new Node();
			nn.val = item;
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ==> ");
			temp = temp.next;
		}
		System.out.println("End");
	}

	public void CreateCycle(int idx) {
		Node temp = getAtIdx(idx);
		this.tail.next = temp;
	}

	public Node getAtIdx(int idx) {
		int count = 0;
		Node temp = this.head;

		while (count < idx) {
			temp = temp.next;
			count++;
		}
		return temp;
	}

	public Node meetpoint() {
		Node slow = head;
		Node fast = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}
	// TC ==> O(N^2)
	public void RemoveCycle() {
		Node mp = meetpoint();
		if(mp == null) {// no cycle
			return;
		}
		Node sp = head;
		
		while(sp!=null) {// to check sp is in cylce or not
			Node t = mp;
			while(t.next!=mp) {// Traversal in cycle
				if(t.next == sp) {// sp found
					t.next = null;//cycle removed
					return;
				}
				t = t.next;
			}
			sp = sp.next;	
		}
	}
	// TC O(C + NC) ==> O(N)
	public void RemoveCycleOptimised() {
		Node mp = meetpoint();
		if(mp == null) {// no cycle
			return;
		}
		// Find Cycle length
		int count=1;
		Node t = mp;
		while(t.next!=mp) {// Traversal in cycle
			count++;
			t = t.next;
		}
		// Move fast cycle length times
		Node fast = head;
		for (int i = 0; i < count; i++) {
			fast =  fast.next;
		}
		
		Node slow = head;
		// Move slow and fast together nc times
		
		while(slow.next!=fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;// cycle removed
	}
	
	public void FloydCycleRemoval() {
		Node mp = meetpoint();
		if(mp == null) {// no cycle
			return;
		}
		Node fast =  mp;
		Node slow = head;
		// Move slow and fast together nc times
		while(slow.next!=fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public static void main(String[] args) {
		CyclicLL ll = new CyclicLL();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addLast(100);
		ll.addLast(200);
		ll.CreateCycle(2);
//		ll.RemoveCycle();
//		ll.RemoveCycleOptimised();
		ll.FloydCycleRemoval();
		ll.Display();

	}

}
