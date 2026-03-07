package Lecture38;

import Lecture37.LCA.TreeNode;

public class DeleteINBST {

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

	public TreeNode deleteNode(TreeNode root, int key) {
		if(root == null) {
			return null;
		}
		if(root.val>key) {
			root.left = deleteNode(root.left, key);
		}
		else if (root.val< key) {
			root.right = deleteNode(root.right, key);
		}
		else {// key found
			if(root.left == null) {// both child null , left null right not null
				return root.right;
			}
			else if(root.right == null) {// right null left not null
				return root.left;
			}
			else {// Both child not null
				int leftmax = max(root.left);
				root.left = deleteNode(root.left, leftmax);
				root.val = leftmax;
			}
		}
		return root;
	}

	private int max(TreeNode node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		int right  = max(node.right);
		return Math.max(right, node.val);
	}

}
