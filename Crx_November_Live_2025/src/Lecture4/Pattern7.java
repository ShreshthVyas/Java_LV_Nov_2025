package Lecture4;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = n-2;
		int nst = n;
		int row = 1;
		while(row<=n) {
			if(row==1 || row==n) {// first and Last row
				//print nst stars
				int cst =0;
				while(cst<nst) {
					System.out.print("* ");
					cst++;
				}
			}
			else {
				System.out.print("* ");
				// n-2 spaces
				int csp =0;
				while(csp<nsp) {
					System.out.print("  ");
					csp++;
				}
				System.out.print("* ");
			}
			System.out.println();
			row++;
		}
		
	}

}
