package Lecture9;

public class RainWatertrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int ans = trap(arr);
		System.out.println(ans);
	}

	public static int trap(int[] height) {
		int left[] = new int[height.length];
		left[0] = height[0];

		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(height[i], left[i - 1]);
		}
		int right[] = new int[height.length];
		right[right.length - 1] = height[height.length - 1];

		for (int i = height.length - 2; i >= 0; i--) {
			right[i] = Math.max(height[i], right[i + 1]);
		}
		int ans = 0;

		for (int i = 0; i < right.length; i++) {
			ans += Math.min(left[i], right[i]) - height[i];
		}

		return ans;
	}

}
