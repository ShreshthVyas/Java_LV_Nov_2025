package Lecture19;

public class PrintIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		print(n);
	}

	public static void print(int n) {//1->N
		// TODO Auto-generated method stub
		if(n ==0) {
			return;
		}
		print(n-1);// 1==>N-1
		System.out.println(n);//sub-problem
	}

//	public static void print(int n) {
//		// TODO Auto-generated method stub
//		if(n==6) {
//			return;
//		}
//		System.out.println(n);
//		print(n+1);
//		
//	}

}
