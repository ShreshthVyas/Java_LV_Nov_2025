package Lecture23;

public class QueenCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 4;
		int q = 2;
		boolean board[] =  new boolean[n];
		rec(board ,0,q , "",0);
	}

	public static void rec(boolean[] board, int qpsf, int noq, String ans,int idx) {
		// TODO Auto-generated method stub
		if(qpsf == noq) {// all queens placed
			System.out.println(ans);
			return;
		}
		
		for (int i = idx; i < board.length; i++) {
			if(board[i] == false) {// empty
				board[i] =  true;// queen placed on i
				rec(board, qpsf+1, noq, ans+"b"+i+"q"+qpsf,i+1);
				board[i] =  false;//backtracking
			}
		}
		
		
	}

}
