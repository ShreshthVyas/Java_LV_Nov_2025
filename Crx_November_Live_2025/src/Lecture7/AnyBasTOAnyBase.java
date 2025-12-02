package Lecture7;

import java.util.Scanner;

public class AnyBasTOAnyBase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int src = sc.nextInt();//5
		int dest = sc.nextInt();//3
		int num = sc.nextInt();//134
		
		//AnyToDecimal
		int dec = anytodec(num,src);
		
		//DecimalToAny
		int ans = DectoDest(dec , dest);
		
		System.out.println(ans);
		
	}

	public static int DectoDest(int n, int dest) {
		// TODO Auto-generated method stub
		int ans = 0;
		int mul =1;
		while(n>0) {
			int r = n%dest;
			ans =  ans + r*mul;
			mul = mul*10;
			n= n/dest;
		}
		return ans;
	}

	public static int anytodec(int n, int src) {
		// TODO Auto-generated method stub
		int ans =0;
		int mul =  1;
		while(n>0) {
			int d =  n%10;
			ans = ans + d*mul;
			mul  = mul*src;
			n =  n/10;
		}
		return ans;
	}
}
