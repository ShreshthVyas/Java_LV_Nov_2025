package Lecture29;

public class stackclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stack  s = new stack(6);
		System.out.println(s.isEmpty());
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		s.Display();
		System.out.println(s.pop());
		s.Display();
		System.out.println(s.peek());
		
	}

}
