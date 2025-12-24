package Lecture15;

import java.util.Scanner;

public class SpiralPrintClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m =  sc.nextInt();
		int arr[][] =  new int[n][m];
		
		for (int i = 0; i < arr.length; i++) {//rows
			for (int j = 0; j < arr[0].length; j++) {//col
				arr[i][j] = sc.nextInt();
			}
		}
		
		spiral(arr);
	}

	public static void spiral(int[][] arr) {
		// TODO Auto-generated method stub
		int minRow = 0;
		int maxRow = arr.length-1;
		int minCol = 0;
		int maxCol = arr[0].length-1;
		int total = arr.length* arr[0].length;
		int count =0;
		
		while(count<total) {
			for (int c = minCol; c <=maxCol && count<total; c++) {
				System.out.print(arr[minRow][c]+ " ");
				count++;
			}
			minRow++;
			for (int r = minRow; r <=maxRow && count<total; r++) {
				System.out.print(arr[r][maxCol]+ " ");
				count++;
			}
			maxCol--;
			for (int c = maxCol; c>=minCol && count<total; c--) {
				System.out.print(arr[maxRow][c]+ " ");
				count++;
			}
			maxRow--;
			for (int r = maxRow; r>=minRow && count<total; r--) {
				System.out.print(arr[r][minCol]+ " ");
				count++;
			}
			minCol++;
		}
		
		
	}

}
