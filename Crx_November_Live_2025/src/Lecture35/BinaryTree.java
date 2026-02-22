package Lecture35;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

	public class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;
	
	Scanner sc = new Scanner(System.in);
	
	public BinaryTree() {
		this.root = createTree();
	}

	private Node createTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();// val input
		Node nn =  new Node();
		nn.val = item;
		
		boolean hlc = sc.nextBoolean();
		if(hlc) {
			nn.left = createTree();// rec creates left subtree
		}
		boolean hrc = sc.nextBoolean();
		if(hrc) {
			nn.right = createTree();// rec creates right subtree
		}
		return nn;
	}
	
	public void Display() {
		display(root);
	}

	private void display(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		String s = root.val+"";
		if(root.left!=null) {
			s = root.left.val + " <== " + s;
		}
		else {
			s = ". <== " + s;
		}
		if(root.right!=null) {
			s = s + " ==> " + root.right.val;
		}
		else {
			s = s + " ==> .";
		}
		System.out.println(s);
		display(root.left);
		display(root.right);
		
	}
	public int Max() {
		return max(root);
	}

	private int max(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int lm = max(root.left);
		int rm = max(root.right);
		
		return Math.max(root.val, Math.max(lm, rm));
	}
	
	public boolean Find(int target) {
		return find(root,target);
	}

	private boolean find(Node root, int target) {
		// TODO Auto-generated method stub
		if(root == null) {
			return false;
		}
		if(root.val == target) {
			return true;
		}
		boolean left = find(root.left, target);
		boolean right = find(root.right,target);
		
		return left || right;
	}
	
	public int Height() {
		return height(root);
	}

	private int height(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return -1;// in case of count branch or 0 based index
			// return 0;// In case of count node or 1 based index
		}
		int lh = height(root.left);
		int rh = height(root.right);
		return Math.max(lh, rh) + 1;
	}
	
	public void PreOrder() {
		pre(root);
		System.out.println();
	}

	private void pre(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		System.out.print(root.val+" ");
		pre(root.left);
		pre(root.right);
	}
	public void PostOrder() {
		post(root);
		System.out.println();
	}
	
	private void post(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		post(root.left);
		post(root.right);
		System.out.print(root.val+" ");
	}
	public void InOrder() {
		in(root);
		System.out.println();
	}
	
	private void in(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		in(root.left);
		System.out.print(root.val+ " ");
		in(root.right);
	}
	
	public void LevelOrderTraversal() {
		Queue<Node> q = new LinkedList<>();
		// Add root
		if(root == null) {
			return;
		}
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.remove();
			System.out.print(temp.val+" ");
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
		
	}
}
