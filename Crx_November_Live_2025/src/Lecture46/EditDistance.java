package Lecture46;

public class EditDistance {

	public int minDistance1(String s, String t) {
		Integer[][] dp = new Integer[s.length()][t.length()];
		return rec(s, t, 0, 0, dp);
	}

	private int rec(String s, String t, int i, int j, Integer[][] dp) {
		// TODO Auto-generated method stub
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		if (dp[i][j] != null) {
			return dp[i][j];
		}
		if (s.charAt(i) == t.charAt(j)) {
			return dp[i][j] = rec(s, t, i + 1, j + 1, dp);
		} else {
			int I = rec(s, t, i, j + 1, dp);
			int R = rec(s, t, i + 1, j + 1, dp);
			int D = rec(s, t, i + 1, j, dp);

			return dp[i][j] = 1 + Math.min(R, Math.min(I, D));
		}
	}

	public int minDistance(String s, String t) {
		int dp[][]=  new int[s.length()+1][t.length()+1];
		
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = i;
		}
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = i;
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s.charAt(i-1) == t.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				} else {
					int I = dp[i][j-1];
					int R = dp[i-1][j-1];
					int D = dp[i-1][j];

					dp[i][j] = 1 + Math.min(R, Math.min(I, D));
				}
			}
		}
		
		return dp[dp.length-1][dp[0].length-1];
	}

}
