package Lecture36;

import Lecture36.FlipEquivalent.TreeNode;

public class DiameterOptimised {

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

	public class Diapair {
		int h = -1;
		int d = 0;
	}

	public int diameterOfBinaryTree(TreeNode root) {
		 return rec(root).d;
	}

	private Diapair rec(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return new Diapair();
		}
		Diapair ldp =  rec(root.left);
		Diapair rdp = rec(root.right);
		int sd = ldp.h + rdp.h + 2;
		Diapair sdp = new Diapair();
		sdp.h = Math.max(ldp.h, rdp.h) +1;
		sdp.d = Math.max(sd, Math.max(ldp.d, rdp.d));
		
		return sdp;
	}
}
