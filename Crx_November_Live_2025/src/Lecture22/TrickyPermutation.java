package Lecture22;

public class TrickyPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";
		permutation(s,"");
	}

	public static void permutation(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		boolean vis[] = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			char ch =  s.charAt(i);
			if(vis[ch-'a'] == false) {
				vis[ch-'a'] = true;// tells us char ch already visited
				String left = s.substring(0,i);// characters from 0 to i-1
				String right = s.substring(i+1);// characters from i+1 to end
				permutation(left+ right, ans+ch);
			}
		}
	}

}
