package Lecture21;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int m = 3;
		if(m>n) {
			m =n;
		}
		board(0,n,m,"");
	}

	public static void board(int i, int n,int m, String ans) {
		// TODO Auto-generated method stub
		if(i == n) {
			System.out.println(ans);
			return;
		}
		if(i>n) {
			return;
		}
		for (int j = 1; j <=m; j++) {// every frame in board has m face dice
			board(i+j, n, m, ans+j);
		}
	}
//	public static void board(int i, int n, String ans) {
//		// TODO Auto-generated method stub
//		if(i == n) {
//			System.out.println(ans);
//			return;
//		}
//		if(i>n) {
//			return;
//		}
//		board(i+1, n, ans+"1");
//		board(i+2, n, ans+"2");
//		board(i+3, n, ans+"3");
//	}

}
