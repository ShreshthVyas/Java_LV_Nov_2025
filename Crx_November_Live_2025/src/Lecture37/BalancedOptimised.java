package Lecture37;

import Lecture36.DiameterLeetcode.TreeNode;

public class BalancedOptimised {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public class balpair {
		int h = -1;
		boolean isbal = true;
	}

	public boolean isBalanced(TreeNode root) {
		return rec(root).isbal;
	}

	private balpair rec(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return new balpair();
		}
		balpair lbp = rec(root.left);
		balpair rbp = rec(root.right);
		balpair sbp = new balpair();
		boolean sb = Math.abs(lbp.h-rbp.h) <= 1;
		sbp.h= Math.max(lbp.h,rbp.h) +1;
		sbp.isbal = sb && lbp.isbal && rbp.isbal;
		return sbp;
	}
}
