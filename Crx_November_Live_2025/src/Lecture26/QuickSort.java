package Lecture26;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-9, 5, 3, 6, 2, 7, -1 , 4};
		quicksort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quicksort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return;
		}
		// find pivot index
		int pivot  = partition(arr, si, ei);
		quicksort(arr, si, pivot-1);
		quicksort(arr, pivot+1, ei);
		
	}
	public static int partition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int temp = arr[ei];
		int idx =si;
		
		for (int i = si; i <ei; i++) {
			if(arr[i]<temp) {
				int j =  arr[idx];
				arr[idx] = arr[i];
				arr[i] = j;
				idx++;
			}
		}
		//swap ei and idx
		int j = arr[idx];
		arr[idx] = temp;
		arr[ei] = j;
		return idx;
	}

}
