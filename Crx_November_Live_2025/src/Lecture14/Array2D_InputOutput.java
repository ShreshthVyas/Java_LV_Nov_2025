package Lecture14;

import java.util.Scanner;

public class Array2D_InputOutput {

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
		
		for (int i = 0; i < arr.length; i++) {//rows
			for (int j = 0; j < arr[0].length; j++) {//col
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
