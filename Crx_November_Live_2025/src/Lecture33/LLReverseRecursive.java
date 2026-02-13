package Lecture33;

import Lecture33.LLReverseIterative.ListNode;

public class LLReverseRecursive {
	
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
		return rev(head,null);
	}

	private ListNode rev(ListNode curr, ListNode prev) {
		// TODO Auto-generated method stub
		if(curr == null) {
			return prev;
		}
		ListNode temp = rev(curr.next, curr);
		curr.next = prev;
		return temp;
	}

}
