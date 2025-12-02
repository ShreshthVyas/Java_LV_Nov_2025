package Lecture7;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int row =0;
		int nst = 1;
		
		while(row<n) {
			int cst =0;
			int val =1;
			while(cst<nst) {
				System.out.print(val+" ");
				val = val * (row-cst) / (cst+1);
				cst++;
			}
			System.out.println();
			row++;
			nst++;
		}
	}

}
