package Lecture47;

public class AllSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		int n =  s.length();
		for (int i = 0; i < (1<<n); i++) {
			print(s,i);
		}
	}

	private static void print(String s, int n) {
		// TODO Auto-generated method stub
		int pos = 0;
		while(n>0) {
			if((n&1) == 1) {
				System.out.print(s.charAt(pos));
			}
			pos++;
			n =  n>>1;
		}
		System.out.println();
	}

}
