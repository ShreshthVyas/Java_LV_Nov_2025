package Lecture11;

public class MaxSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int ans = maxSubArray(arr);
		System.out.println(ans);
	}

	public static int maxSubArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {// starting point
			int sum = arr[i];
			max = Math.max(max, sum);
			for (int j = i+1; j < arr.length; j++) {//ending point
				sum += arr[j];
				max = Math.max(max, sum);
			}
		}
		return max;
	}
//	public static int maxSubArray(int[] arr) {
//		int max = Integer.MIN_VALUE;
//		for (int i = 0; i < arr.length; i++) {// starting point
//			for (int j = i; j < arr.length; j++) {//ending point
//				int sum = 0;
//				for (int k = i; k <=j; k++) {//  all between i and j
//					sum+=arr[k];
//				}
//				max = Math.max(max, sum);
////				System.out.println(sum);
//			}
//		}
//		return max;
//	}

}
