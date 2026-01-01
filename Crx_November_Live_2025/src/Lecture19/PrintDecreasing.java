package Lecture19;

public class PrintDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 10;
		print(n);
	}

	public static void print(int n) {// n==> 1
		// TODO Auto-generated method stub
		if(n==0) {//base case
			return;
		}
		System.out.println(n);//small sub-problem
		print(n-1);// recursive call
	}

}
