package Lecture40;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKsortedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode> pq =  new PriorityQueue<>(new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}
		});
		
		for (ListNode node : lists) {
			if(node !=null) {
				pq.add(node);
			}
		}
		
		ListNode dummy  =  new ListNode();
		ListNode temp = dummy;
		
		while(!pq.isEmpty()) {
			ListNode n = pq.poll();
			if(n.next!=null) {
				pq.offer(n.next);
			}
			temp.next = n;
			temp = temp.next;
		}
		return dummy.next;
		
	}

}
