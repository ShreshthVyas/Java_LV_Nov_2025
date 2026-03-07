package Lecture39;

import java.util.PriorityQueue;

public class MinSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		PriorityQueue<Integer> pq = new PriorityQueue();
		for (int i = 0; i < arr.length; i++) {
			pq.offer(arr[i]);
		}
		int ans = 0;
		
		while(pq.size()>1) {
			int a = pq.poll();
			int b = pq.poll();
			int sum = a + b;
			ans+=sum;
			pq.offer(sum);
		}
		System.out.println(ans);
		
	}

}
