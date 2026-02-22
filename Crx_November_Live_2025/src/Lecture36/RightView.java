package Lecture36;

import java.util.ArrayList;
import java.util.List;

import Lecture36.FlipEquivalent.TreeNode;

public class RightView {

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
	int maxLVL  = -1;
	List<Integer> ans;
	public List<Integer> rightSideView(TreeNode root) {
		ans = new ArrayList<>();
		rec(root,0);
		return ans;
	}
	private void rec(TreeNode root, int cl) {
		// TODO Auto-generated method stub
		if(root ==null) {
			return ;
		}
		if(cl> maxLVL) {
			ans.add(root.val);
			maxLVL = cl;
		}
		rec(root.right, cl+1);
		rec(root.left,cl+1);
	}
}
