package Lecture14;

import java.util.Scanner;

public class ArrayMax {

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
		
		int ans = max(arr);
		System.out.println(ans);
	}

	public static int max(int[][] arr) {
		// TODO Auto-generated method stub
		int ans= Integer.MIN_VALUE;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				ans =  Math.max(ans, arr[row][col]);
			}
		}
		return ans;
	}

}
