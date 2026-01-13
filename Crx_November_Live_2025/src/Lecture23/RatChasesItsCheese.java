package Lecture23;

import java.util.Arrays;
import java.util.Scanner;

public class RatChasesItsCheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
//		char ch =  sc.next().charAt(0);
		char board[][] =  new char[n][m];
		for (int i = 0; i < board.length; i++) {//row
			String s =  sc.next();
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] =  s.charAt(j);
			}
		}
		int ans[][] =  new int[n][m];
		rec(board,ans,0,0,n-1,m-1);
	}

	public static void rec(char[][] board, int[][] ans, int cr, int cc, int n, int m) {
		// TODO Auto-generated method stub
		if(cr == n && cc ==m) {
			ans[cr][cc] =1;
			Display(ans);
			return;
		}
		if(cr<0 || cc<0 || cr>n|| cc>m|| board[cr][cc] =='X') {
			return;
		}
		ans[cr][cc] =1;
		board[cr][cc] ='X';
		rec(board, ans, cr+1, cc, n, m);//D
		rec(board, ans, cr-1, cc, n, m);//U
		rec(board, ans, cr, cc+1, n, m);//R
		rec(board, ans, cr, cc-1, n, m);//L
		ans[cr][cc] =0;
		board[cr][cc] ='O';
		
	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int[] is : ans) {
			System.out.println(Arrays.toString(is));
		}
	}

}
