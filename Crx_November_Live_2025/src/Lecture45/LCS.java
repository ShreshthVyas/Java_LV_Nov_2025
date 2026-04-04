package Lecture45;

public class LCS {
	public int longestCommonSubsequence(String s, String t) {
		Integer dp[][] =  new Integer[s.length()][t.length()];
		return rec(s,t,0,0,dp);
	}
	private int rec(String s, String t, int i, int j,Integer[][]dp) {
		// TODO Auto-generated method stub
		if(i == s.length() || j ==  t.length()) {
			return 0;
		}
		if(dp[i][j]!=null) {
			return dp[i][j];
		}
		if(s.charAt(i) == t.charAt(j)) {
			return dp[i][j] = 1 + rec(s, t, i+1, j+1,dp);
		}
		else {
			int skipS = rec(s, t, i+1, j,dp);
			int skipT = rec(s, t, i, j+1,dp);
			return dp[i][j] = Math.max(skipS, skipT);
		}
	}
//	private int rec(String s, String t, int i, int j) {
//		// TODO Auto-generated method stub
//		if(i == s.length() || j ==  t.length()) {
//			return 0;
//		}
//		if(s.charAt(i) == t.charAt(j)) {
//			return 1 + rec(s, t, i+1, j+1);
//		}
//		else {
//			int skipS = rec(s, t, i+1, j);
//			int skipT = rec(s, t, i, j+1);
//			return Math.max(skipS, skipT);
//		}
//	}
}
