package Lecture22;

public class LexographicalCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1000;
		lexo(0,n);
	}

	public static void lexo(int ans, int n) {
		// TODO Auto-generated method stub
		if(ans>n) {
			return;
		}
		System.out.println(ans);
		int i=0;
		if(ans ==0) {
			i =1;
		}
		for (; i <=9; i++) {
			lexo(ans*10 + i, n);
		}
	}

}
