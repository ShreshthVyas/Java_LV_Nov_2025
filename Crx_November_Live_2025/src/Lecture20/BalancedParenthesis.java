package Lecture20;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		rec(n,0,0,"");
	}

	public static void rec(int n, int op, int cl, String ans) {
		// TODO Auto-generated method stub
		if(op>n) {// -ve base case
			return;
		}
		if(op==n && cl==n) {
			System.out.println(ans);
			return;
		}
		rec(n, op+1, cl, ans+"(");
		if(op>cl) {
			rec(n, op, cl+1, ans+")");
		}
		
	}

}
