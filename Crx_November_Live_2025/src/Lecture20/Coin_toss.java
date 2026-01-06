package Lecture20;

public class Coin_toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		coin(n,"");
	}

	public static void coin(int n, String ans) {
		// TODO Auto-generated method stub
		if(n ==0) {
			System.out.println(ans);
			return;
		}
		coin(n-1,ans+"H");
		coin(n-1,ans+"T");
	}

}
