package Lecture12;

import java.util.Scanner;

public class KthRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			long n = sc.nextLong();
			long k = sc.nextLong();

			long ans = binarysearch(n,k);
			System.out.println(ans);
			t--;
		}
	}

	public static long binarysearch(long n, long k) {
		// TODO Auto-generated method stub
		long lo = 1;
		long hi = n;
		long ans =0;
		while(lo<=hi) {
			long mid =  (lo+hi)/2;
			if(Math.pow(mid, k)<=n) {
				ans = mid;
				lo =mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		return ans;
	}

}
