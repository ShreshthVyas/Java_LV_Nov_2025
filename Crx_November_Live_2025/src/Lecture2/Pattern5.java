package Lecture2;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int nst =  n;
		int row =1;
		int nsp = 0;//no of spaces
		while(row<=n) {
			// spaces
			int csp = 0;//count of spaces
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			int cst =0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			nst--;
			nsp++;
			row++;
		}
	}

}
