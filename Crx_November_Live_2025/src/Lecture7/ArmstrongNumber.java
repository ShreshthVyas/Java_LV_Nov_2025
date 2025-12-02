package Lecture7;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = noOfDigits(n);
		
		int sum = sumofpowDigits(n,count);
		
		if(n == sum) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

	public static int sumofpowDigits(int n, int count) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(n>0) {
			int dig = n%10;
			sum+= Math.pow(dig, count);// a to the power b
			n/=10;
		}
		return sum;
	}

	public static int noOfDigits(int n) {
		// TODO Auto-generated method stub
		int count =0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

}
