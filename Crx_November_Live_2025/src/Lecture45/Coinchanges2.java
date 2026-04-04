package Lecture45;

public class Coinchanges2 {

	public int change(int amount, int[] coins) {
		Integer dp[][] = new Integer[coins.length][amount+1];
		return rec(amount, coins, 0, dp);
	}

	private int rec(int amount, int[] coins, int i, Integer dp[][]) {
		// TODO Auto-generated method stub
		if (amount == 0) {
			return 1;
		}
		if (i == coins.length) {
			return 0;
		}
		if(dp[i][amount]!=null) {
			return dp[i][amount];
		}
		int inc = 0;
		int exc = 0;
		if (amount >= coins[i]) {
			inc = rec(amount - coins[i], coins, i,dp);
		}
		exc = rec(amount, coins, i + 1,dp);
		return dp[i][amount] = inc + exc;
	}
}
