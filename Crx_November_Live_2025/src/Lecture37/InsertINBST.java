package Lecture37;

import Lecture37.BalancedBinaryTree.TreeNode;

public class InsertINBST {
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

	public TreeNode insertIntoBST(TreeNode root, int val) {
		if(root == null) {
			TreeNode n = new TreeNode(val);
			return n;
		}
		if(root.val>val) {
			root.left = insertIntoBST(root.left, val);
		}
		else {
			root.right = insertIntoBST(root.right, val);
		}
		return root;
	}

}
