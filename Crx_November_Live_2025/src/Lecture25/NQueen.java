package Lecture25;

public class NQueen {
	public static void main(String[] args) {
		int n = 5;
		boolean board[][] = new boolean[n][n];
		rec(0,n,board,0);
	}

	public static void rec(int qpsf, int tq, boolean[][] board, int row) {
		// TODO Auto-generated method stub
		if(qpsf == tq) {
			Display(board);
			return;
		}
		if(row == board.length) {
			return;
		}
		
		for (int col = 0; col < board.length; col++) {
			if(Isitpossible(row,col,board)) {
				board[row][col] = true;//queen placed
				rec(qpsf+1, tq, board, row+1);
				board[row][col] = false;//backtracking
			}
			
		}
	}

	public static boolean Isitpossible(int row, int col, boolean[][] board) {
		// TODO Auto-generated method stub
		//Up
		for (int r = row; r>=0; r--) {
			if(board[r][col]) {
				return false;
			}
		}
		//Upper right
		int cr = row;
		int cc = col;
		
		while(cr>=0 && cc<board.length) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc++;
		}
		
		//Upper Left
		cr = row;
		cc = col;
		
		while(cr>=0 && cc>=0) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc--;
		}
		
		return true;
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]) {
					System.out.print("q");
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
