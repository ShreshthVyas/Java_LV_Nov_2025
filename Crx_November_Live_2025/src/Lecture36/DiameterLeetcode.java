package Lecture36;

import Lecture35.BinaryTree.Node;
import Lecture36.SymmetricTree.TreeNode;

public class DiameterLeetcode {

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

	public int diameterOfBinaryTree(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int ld = diameterOfBinaryTree(root.left);
		int rd = diameterOfBinaryTree(root.right);
		int sd = height(root.left) + height(root.right) + 2;
		
		return Math.max(sd, Math.max(ld, rd));
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
