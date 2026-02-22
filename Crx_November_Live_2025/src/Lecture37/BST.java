package Lecture37;


public class BST {
	
	public class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;
	
	public BST(int in[]) {
		this.root = createTree(in, 0, in.length-1);
	}

	private Node createTree(int in[], int si , int ei) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return null;
		}
		
		int mid = (si+ei)/2;
		Node nn = new Node();
		nn.val = in[mid];
		
		nn.left = createTree(in, si, mid-1);
		nn.right = createTree(in, mid+1, ei);
		
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
	
	public static void main(String[] args) {
		int in[] = { 3,5,7,12,14,17,23,90};
		BST bst =  new BST(in);
		bst.Display();
	}
}
