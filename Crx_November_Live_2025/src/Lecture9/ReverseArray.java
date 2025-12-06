package Lecture9;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] =  new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  sc.nextInt();
		}
		reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
	}

	public static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		int i =0;
		int j = arr.length -1;
		while(i<j) {
			int temp  = arr[i];
			arr[i] =  arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
	}

}
