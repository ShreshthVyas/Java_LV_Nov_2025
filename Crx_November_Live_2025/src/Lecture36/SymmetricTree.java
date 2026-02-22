package Lecture36;

import Lecture36.PathSumLeetcode.TreeNode;

public class SymmetricTree {

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

	public boolean isSymmetric(TreeNode root) {
		return rec(root.left,root.right);
	}

	private boolean rec(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root1 == null && root2==null) {
			return true;
		}
		if(root1 == null || root2==null) {
			return false;
		}
		if(root1.val != root2.val) {
			return false;
		}
		
		boolean l = rec(root1.left, root2.right);
		boolean r = rec(root1.right, root2.left);
		return l&&r;
	}
}
