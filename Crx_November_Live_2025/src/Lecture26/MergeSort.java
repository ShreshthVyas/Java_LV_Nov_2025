package Lecture26;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,-1,11,2,9,5,7,-3};
		int ans[] = rec(arr,0,arr.length-1);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] rec(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si == ei) {// single element
			int temp[] =  new int[1];
			temp[0] = arr[si];
			return temp;
		}
		
		//Step 1: Find Mid
		int mid = (si+ei)/2;
		//Step 2 : Divide in two halves and ask recursion to sort
		int fh[] = rec(arr, si, mid);
		int sh[] = rec(arr, mid+1, ei);
		
		// merge and return the two sorted arrays
		return mergetwosortedarrays(fh, sh);
	}
	
	public static int[] mergetwosortedarrays(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int ans[] = new int[arr.length+brr.length];
		
		int i =0;
		int j = 0;
		int k = 0;
		
		while(i<arr.length&& j<brr.length) {
			if(arr[i]<brr[j]) {
				ans[k] = arr[i];
				i++;k++;
			}
			else {
				ans[k] = brr[j];
				j++;k++;
			}
		}
		
		while(i<arr.length) {
			ans[k] = arr[i];
			i++;k++;
		}
		while(j<brr.length) {
			ans[k] = brr[j];
			j++;k++;
		}
		return ans;
		
		
	}

}
