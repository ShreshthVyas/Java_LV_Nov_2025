package Lecture45;

public class coinchanges2BU {

	public int change(int amount, int[] coins) {
		int dp[][] =  new int[coins.length+1][amount+1];
		
		for (int i = 0; i < dp[0].length; i++) {// base case amount =0
			dp[i][0] = 1;
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int amnt = 1; amnt < dp[0].length; amnt++) {
				int inc = 0;
				int exc = 0;
				if(amnt >= coins[i-1]) {
					inc = dp[i][amnt - coins[i-1]];
				}
				exc = dp[i-1][amnt];
				dp[i][amnt] = inc+exc;
			}
		}
		
		return dp[dp.length-1][dp[0].length-1];
	}

}
