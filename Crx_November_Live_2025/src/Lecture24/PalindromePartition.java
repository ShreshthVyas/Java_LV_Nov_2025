package Lecture24;

public class PalindromePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aab";
		rec(s,"");
	}

	public static void rec(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length() ==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= s.length(); i++) {//ALl partitions
			String l = s.substring(0,i);
			if(isPal(l)) {
				rec(s.substring(i), ans + l + "|");
			}
		}
	}

	public static boolean isPal(String l) {
		// TODO Auto-generated method stub
		int i =0;
		int j = l.length()-1;
		while(i<j) {
			if(l.charAt(i)!=l.charAt(j)) {
				return false;
			}
			i++;
			j--;	
		}
		return true;
	}

}
