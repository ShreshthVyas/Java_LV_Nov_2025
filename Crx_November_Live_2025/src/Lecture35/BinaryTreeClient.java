package Lecture35;

public class BinaryTreeClient {
	//10 true 20 true 30 false false true 40 false false true 60 false true 70 false false
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt =  new BinaryTree();
		bt.Display();
		System.out.println(bt.Max());
		System.out.println(bt.Find(20));
		bt.PreOrder();
		bt.PostOrder();
		bt.InOrder();
		bt.LevelOrderTraversal();
	}

}
