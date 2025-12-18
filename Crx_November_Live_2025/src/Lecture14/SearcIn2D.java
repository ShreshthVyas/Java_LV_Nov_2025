package Lecture14;

import java.util.Scanner;

public class SearcIn2D {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m =  sc.nextInt();
		int arr[][] =  new int[n][m];
		
		for (int i = 0; i < arr.length; i++) {//rows
			for (int j = 0; j < arr.length; j++) {//col
				arr[i][j] = sc.nextInt();
			}
		}
		
		boolean ans = find(arr,12);
		System.out.println(ans);
	}

	public static boolean find(int[][] arr, int target) {
		// TODO Auto-generated method stub
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if(arr[row][col] == target) {
					return true;
				}
			}
		}
		return false;
	}
}
