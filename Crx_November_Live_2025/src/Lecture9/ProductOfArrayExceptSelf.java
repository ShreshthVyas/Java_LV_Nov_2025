package Lecture9;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		int ans[] = productExceptSelf(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]+" ");
		}
		
	}
	public static int[] productExceptSelf(int[] arr) {
		int left[] =  new int[arr.length];
		
		left[0] =1;
		
		for (int i = 1; i < left.length; i++) {
			left[i] = arr[i-1] * left[i-1];
		}
		int right[] =  new int[arr.length];
		
		right[right.length-1] =1;
		
		for (int i = right.length-2; i>=0; i--) {
			right[i] = right[i+1] * arr[i+1];
		}
		for (int i = 0; i < left.length; i++) {
			left[i] = left[i] * right[i];
		}
		return left;
	}
//	public static int[] productExceptSelf(int[] arr) {
//		int ans[] =  new int[arr.length];
//		
//		for (int i = 0; i < ans.length; i++) {
//			int mul = 1;
//			for (int j = 0; j < ans.length; j++) {
//				if(i == j) {
//					continue;
//				}
//				mul = mul * arr[j];
//			}
//			ans[i] = mul;
//		}
//		
//		return ans;
//	}

}
