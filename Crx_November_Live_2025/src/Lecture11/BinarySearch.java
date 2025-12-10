package Lecture11;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,3,6,11,102,111,124,200};
		int ans = bs(arr,201);
		System.out.println(ans);
	}

	public static int bs(int[] arr, int target) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = arr.length-1;
		while(lo<=hi) {
			int  mid = (lo+hi)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid]>target) {
				hi =  mid-1;
			}
			else {// arr[mid]<target
				lo = mid+1;
			}
		}
		return -1;
	}

}
