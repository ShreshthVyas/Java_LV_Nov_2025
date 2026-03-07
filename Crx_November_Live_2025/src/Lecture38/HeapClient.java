package Lecture38;

public class HeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap h =  new Heap();
		h.add(10);
		h.add(-100);
		h.add(23);
		h.add(59);
		h.add(98);
		h.add(41);
		h.add(22);
		h.display();
		System.out.println(h.get());
		h.remove();
		h.remove();
		h.display();
		System.out.println(h.get());
		
	}

}
