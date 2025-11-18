package Lecture2;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int nst =  1;// No of Stars
		int row =1;
		
		while(row<=n) {
			int cst =0;// stars printed
			while(cst<nst) {
				System.out.print("* ");
				cst++;// cst = cst+1
			}
			System.out.println();//line change
			nst++;
			row++;
		}
	}

}
