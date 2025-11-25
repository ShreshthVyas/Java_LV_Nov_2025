package Lecture5;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		for (int i = 2; i < n; i++) {
			
			if(n%i ==0) {
				count++;
				break;
			}
		}
		
		if(count==0) {
			System.out.println("PRIME");
		}
		else {
			System.out.println("NOT PRIME");
		}
	}

}
