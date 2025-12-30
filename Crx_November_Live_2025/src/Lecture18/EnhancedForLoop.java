package Lecture18;

import java.util.Arrays;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		for (int i : arr) {
//			System.out.println(i);
//		}
//		
//		String[] arr1 = {"A","b","b","B","K"};
//		
//		for (String s : arr1) {
//			System.out.println(s);
//		}
		
		for (int[] a : arr) {
			for (int i : a) {
				System.out.println(i);
			}
//			System.out.println(Arrays.toString(a));
		}
		
		
	}

}
