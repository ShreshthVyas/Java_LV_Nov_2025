package Lecture10;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {5,4,3,2,1};
		
		for (int pass = 1; pass < arr.length; pass++) {// this is the loop to repeat our logic n-1 times
			for (int j = 0; j < arr.length-pass; j++) {// this is the loop for comparing one elemnt to rest
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		System.out.println(Arrays.toString(arr));
	}

}
