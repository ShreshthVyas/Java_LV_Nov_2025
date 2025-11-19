package Lecture3;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int nst =  n;// No of Stars
		int row =1;
		
		while(row<=n) {
			int cst =0;// stars printed
			int val =n;
			while(cst<nst) {
				System.out.print(val + " ");
				val--;
				cst++;// cst = cst+1
			}
			System.out.println();//line change
			row++;
		}
	}

}
