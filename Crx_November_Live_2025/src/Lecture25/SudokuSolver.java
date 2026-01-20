package Lecture25;

import java.util.Scanner;

public class SudokuSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][] =  new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		rec(arr, 0,0);
	}

	public static void rec(int[][] arr, int row, int col) {
		// TODO Auto-generated method stub
		if(col == 9) {
			col =0;
			row++;
		}
		if(row == 9) {
			Display(arr);
			return;
		}
		if(arr[row][col]!=0) {
			rec(arr, row, col+1);
		}
		else {
			for (int val = 1; val <=9; val++) {
				if(IsItPossible(arr,row,col,val)) {
					arr[row][col] = val;
					rec(arr, row, col+1);
					arr[row][col] = 0;//backtracking
				}
			}
		}
		
	}

	public static boolean IsItPossible(int[][] arr, int row, int col, int val) {
		// TODO Auto-generated method stub
		//row
		for (int c = 0; c < arr.length; c++) {
			if(arr[row][c] ==val) {
				return false;
			}
		}
		//column
		for (int r = 0; r < arr.length; r++) {
			if(arr[r][col] ==val) {
				return false;
			}
		}
		//3*3 square
		int r = row - row%3;
		int c = col - col%3;
		
		for (int i = r; i < r+3; i++) {
			for (int j = c; j < c+3; j++) {
				if(arr[i][j] == val) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void Display(int[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

}
