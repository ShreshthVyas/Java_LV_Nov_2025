package Lecture10;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,6,7,-3,11,-2,5};
		
		for (int i = 1; i < arr.length; i++) {//every i finds lowest possible idx
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];// shifting j towards right
				j--;
			}
			j++;
			arr[j]= temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
