package Lecture2;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int nst = n;
		int row =1;
		
		while(row<=n) {// printing n rows
			int cst =0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			nst--;// nst = nst-1
			row++;
		}
	}

}
