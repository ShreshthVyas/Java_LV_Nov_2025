package Lecture10;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,-3,4,-5,9,11,12};
		int target =7;
		
		int ans = ls(arr,target);
		
		System.out.println(ans);
	}

	public static int ls(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {// target found
				return i;
			}
		}
		
		return -1;
	}

}
