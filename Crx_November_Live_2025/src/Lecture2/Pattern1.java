package Lecture2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int nst =  n;// No of Stars
		int row =1;
		
		while(row<=n) {
			int cst =0;// stars printed
			while(cst<nst) {
				System.out.print("* ");
				cst++;// cst = cst+1
			}
			System.out.println();//line change
			row++;
		}
		
	}

}
