package Lecture26;

import java.util.Arrays;

public class Partition {
	public static void main(String[] args) {
		int arr[] = {-1,5,3,6,2,7,-9 };
		int idx  = partition(arr,0,arr.length-1);
		System.out.println(idx);
		System.out.println(Arrays.toString(arr));
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
