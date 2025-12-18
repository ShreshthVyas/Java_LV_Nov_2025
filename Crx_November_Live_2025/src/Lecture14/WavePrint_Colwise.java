package Lecture14;

import java.util.Scanner;

public class WavePrint_Colwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m  = sc.nextInt();
		int arr[][] =  new int[n][m];
		
		for (int i = 0; i < arr.length; i++) {//rows
			for (int j = 0; j < arr.length; j++) {//col
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int col = 0; col < arr[0].length; col++) {
			
			if(col%2 ==0) {//even
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col]+", ");
				}
			}
			else {//odd
				for (int row = arr.length-1 ; row>=0; row--) {
					System.out.print(arr[row][col]+", ");
				}
			}
		}
		System.out.println("END");
		
	}

}
