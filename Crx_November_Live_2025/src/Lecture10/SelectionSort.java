package Lecture10;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,-1,4,8,11,9};
		
		for (int i = 0; i < arr.length-1; i++) {// place mi at each i
			int min_idx =i;
			for (int j = i+1; j < arr.length; j++) {// find min in rest of the array ahead of i
				if(arr[j]<arr[min_idx]) {
					min_idx = j;
				}
			}
			if(min_idx!=i) {
				int temp = arr[i];
				arr[i] = arr[min_idx];
				arr[min_idx] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
