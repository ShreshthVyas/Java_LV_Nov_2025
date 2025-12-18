package Lecture14;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int arr[][] =  new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {//rows
			for (int j = 0; j < arr.length; j++) {//col
				arr[i][j] = sc.nextInt();
			}
		}
		transpose(arr);
		for (int i = 0; i < arr.length; i++) {//rows
			for (int j = 0; j < arr[0].length; j++) {//col
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void transpose(int[][] arr) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < arr.length; i++) {//rows
//			for (int j = i+1; j < arr[0].length; j++) {//col
//				int temp = arr[i][j];
//				arr[i][j] = arr[j][i];
//				arr[j][i] = temp;
//			}
//		}
		for (int i = 0; i < arr.length; i++) {//rows
			for (int j = 0; j < i; j++) {//col
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}

}
