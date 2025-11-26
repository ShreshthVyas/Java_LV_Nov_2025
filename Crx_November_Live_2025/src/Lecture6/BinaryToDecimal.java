package Lecture6;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int ans =0;
		int mul =  1;
		while(n>0) {
			int d =  n%10;
			ans = ans + d*mul;
			mul  = mul*2;
			n =  n/10;
		}
		System.out.println(ans);
	}

}
