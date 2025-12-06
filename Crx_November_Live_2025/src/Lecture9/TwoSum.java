package Lecture9;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		int arr[] =  new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  sc.nextInt();
		}
		
		twosum(arr,target);
	}

	public static void twosum(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+ arr[j] == target) {
					System.out.println(i +" " + j);
					return;
				}
			}
		}
		
	}

}
