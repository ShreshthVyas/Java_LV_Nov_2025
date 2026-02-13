package Lecture33;

public class LLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll =  new LinkedList();
		ll.addFirst(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
		ll.addFirst(100);
		
		ll.Display();
		ll.addAtIdx(1000, 2);
		ll.Display();
////		ll.RemoveFirst();
//		ll.RemoveLast();
//		ll.Display();
	}

}
