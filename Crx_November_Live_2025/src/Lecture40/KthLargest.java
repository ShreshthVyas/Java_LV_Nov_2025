package Lecture40;

import java.util.PriorityQueue;

public class KthLargest {

	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> pq =  new PriorityQueue<Integer>();
		
		for (int i = 0; i < k; i++) {// top k elements in the heap
			pq.offer(nums[i]);
		}
		for (int i = k; i < nums.length; i++) {
			if(nums[i] > pq.peek()) {
				pq.remove();
				pq.add(nums[i]);
			}
		}
		
		return pq.poll();// Kth Largest
	}
}
