package Lecture38;

import java.util.Collections;
import java.util.PriorityQueue;

public class JavaPQDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>  pq=  new PriorityQueue<>();
		//PriorityQueue<Integer>  pq=  new PriorityQueue<>(Collections.reverseOrder());
		pq.add(10);
		pq.add(-100);
		pq.add(23);
		pq.add(59);
		pq.add(98);
		pq.add(41);
		pq.add(22);
		System.out.println(pq);
		pq.offer(1000);
		pq.poll();
		pq.remove();
		System.out.println(pq);
	}

}
