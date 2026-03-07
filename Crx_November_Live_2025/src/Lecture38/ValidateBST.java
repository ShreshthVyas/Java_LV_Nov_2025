package Lecture38;

import Lecture38.DeleteINBST.TreeNode;

public class ValidateBST {

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
	public class bstpair{
		boolean isbst = true;
		Long max = Long.MIN_VALUE;
		Long min  =  Long.MAX_VALUE;
	}
	

	public boolean isValidBST(TreeNode root) {
		return rec(root).isbst;
	}


	private bstpair rec(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return new bstpair();
		}
		bstpair left = rec(root.left);
		bstpair right = rec(root.right);
		bstpair self = new bstpair();
		boolean check = root.val < right.min && root.val > left.max;
		self.isbst = check && left.isbst && right.isbst;
		self.min =  Math.min(root.val, Math.min(right.min, left.min));
		self.max =  Math.max(root.val, Math.max(right.max, left.max));
		return self;
	}

}
