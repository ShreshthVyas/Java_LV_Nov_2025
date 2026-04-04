package Lecrure44;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int rob1(int[] nums) {
		int dp[] = new int[nums.length];
		Arrays.fill(dp, -1);
		return rec(nums, nums.length - 1, dp);
	}

	private int rec(int[] nums, int i, int dp[]) {
		// TODO Auto-generated method stub
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int r = rec(nums, i - 2, dp) + nums[i];
		int dnr = rec(nums, i - 1, dp);
		return dp[i] = Math.max(r, dnr);
	}

	public int rob(int[] nums) {
		if(nums.length == 1) {
			return nums[0];
		}
		int dp[] = new int[nums.length];
		dp[0]= nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		
		for (int i = 2; i < dp.length; i++) {
			int r = dp[i-2] + nums[i];
			int dnr = dp[i-1];
			dp[i] = Math.max(r, dnr);
		}
		
		return dp[dp.length-1];
		
	}
//	private int rec(int[] nums, int i) {
//		// TODO Auto-generated method stub
//		if(i<0) {
//			return 0;
//		}
//		
//		int r = rec(nums, i-2) + nums[i];
//		int dnr = rec(nums, i-1);
//		return Math.max(r, dnr);
//	}

}
