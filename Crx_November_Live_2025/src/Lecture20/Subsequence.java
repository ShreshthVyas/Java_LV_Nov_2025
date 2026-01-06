package Lecture20;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		int ans = rec(s,"");
		System.out.println(ans);
	}

	public static int rec(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return 1;
		}
		char ch =  s.charAt(0);
		int inc = rec(s.substring(1), ans+ ch);//inc
		int exc = rec(s.substring(1), ans);//exc
		
		return inc+exc;
		
	}

}
