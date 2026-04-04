package Lecture45;

public class LCSBU {

	public int longestCommonSubsequence(String s, String t) {
		int dp[][] = new int[s.length()+1][t.length()+1];
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(s.charAt(i-1) == t.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					int skips = dp[i-1][j];
					int skipT = dp[i][j-1];
					dp[i][j] = Math.max(skips, skipT);
				}
			}
		}
		
		return dp[dp.length-1][dp[0].length-1];
	}
}
