package Lecture33;

import Lecture33.LLmidLeetcode.ListNode;

public class LLReverseIterative {

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

	public ListNode reverseList(ListNode head) {
		ListNode curr = head;
		ListNode prev = null;
		
		while(curr!=null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr =temp;
		}
		return prev;
	}
}
