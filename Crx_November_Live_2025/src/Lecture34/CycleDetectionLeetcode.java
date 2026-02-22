package Lecture34;

import Lecture33.LLReverseRecursive.ListNode;

public class CycleDetectionLeetcode {

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

	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while( fast.next!=null && fast.next.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}

}
