package Lecture16;

public class Stringequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello00";
		String t = "hello00";
//		t+="o";
//		System.out.println(s==t);
		boolean ans = equals(s,t);
		System.out.println(ans);
		System.out.println(s.equals(t));
	}

	public static boolean equals(String s, String t) {
		// TODO Auto-generated method stub
		if(s.length()!=t.length()) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=t.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
