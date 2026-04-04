package Lecture48;

public class SingleNumber3 {
	
	public int[] singleNumber(int[] nums) {
		int ans = 0;
		
		for (int i = 0; i < nums.length; i++) {
			ans = ans^ nums[i];
		}
		int mask = ans & (~(ans-1));// Gives the rightmost set bit rest all bits 0
		int a =0;
		int b =0;
		for (int i = 0; i < nums.length; i++) {
			if((mask & nums[i]) !=0) {
				a= a^nums[i];
			}
			else {
				b = b^ nums[i];
			}
		}
		int arr[] = new int[2];
		arr[0] = a;
		arr[1] = b;
		return arr;
	}
}
