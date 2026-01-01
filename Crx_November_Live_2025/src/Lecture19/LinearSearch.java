package Lecture19;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,6,-7,9,10,-14,11};
		int ans = ls(arr,-70,0);
		System.out.println(ans);
	}

	public static int ls(int[] arr, int target,int idx) {
		// TODO Auto-generated method stub
		if(idx == arr.length) {
			return -1;
		}
		if(arr[idx] == target) {
			return idx;
		}
		int roa = ls(arr, target, idx+1);
		return roa;
	}

}
