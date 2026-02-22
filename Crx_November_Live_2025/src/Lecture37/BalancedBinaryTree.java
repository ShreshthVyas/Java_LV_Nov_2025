package Lecture37;

import Lecture36.DiameterLeetcode.TreeNode;

public class BalancedBinaryTree {

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

	public boolean isBalanced(TreeNode root) {
		if(root == null) {
			return true;
		}
		boolean left = isBalanced(root.left);
		boolean right = isBalanced(root.right);
		int lh = height(root.left);
		int rh = height(root.right);
		boolean sb =  Math.abs(lh-rh) <= 1;
		
		return left && right && sb;
	}
	private int height(TreeNode root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return -1;// in case of count branch or 0 based index
			// return 0;// In case of count node or 1 based index
		}
		int lh = height(root.left);
		int rh = height(root.right);
		return Math.max(lh, rh) + 1;
	}

}
