package Lecture29;

public class QueueClient {
	
	public static void main(String[] args) throws Exception {
		Queue q =  new Queue(5);
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.Display();
		
		q.Dequeu();
		q.Dequeu();
		
		q.Display();
		
		q.Enqueue(100);
		
		q.Display();
		
		
		
	}
}
