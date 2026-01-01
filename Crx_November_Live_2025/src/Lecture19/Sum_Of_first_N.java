package Lecture19;

public class Sum_Of_first_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		int ans = sum(n);
		System.out.println(ans);
	}

	public static int sum(int n) {// 1==>10
		// TODO Auto-generated method stub
		if(n == 1) {
			return 1;
		}
		int sum_Of_NminusOne = sum(n-1);//1==>9
		
		return sum_Of_NminusOne+n;
	}

}
