package Lecture5;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = 0;
		
		while(n>0) {
			int d =  n%10;
			ans =  ans *10 +d;
			n = n/10;
		}
		System.out.println(ans);
		
	}

}
