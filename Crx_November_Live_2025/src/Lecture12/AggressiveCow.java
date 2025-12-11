package Lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int stall[] = new int[nos];
		for (int i = 0; i < stall.length; i++) {
			stall[i] =sc.nextInt();
		}
		Arrays.sort(stall);
		int ans =  binarySearch(nos,noc,stall);
		System.out.println(ans);
	}

	public static int binarySearch(int nos, int noc, int[] stall) {
		// TODO Auto-generated method stub
		int lo =1;
		int hi = stall[stall.length-1] - stall[0];
		int ans =0;
		
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(IsItPossible(stall,mid,nos,noc)) {
				ans =mid;
				lo=mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		return ans;
	}

	public static boolean IsItPossible(int[] stall, int mid, int nos, int noc) {
		// TODO Auto-generated method stub
		int place = stall[0];
		int cpsf = 1;//cows placed so far
		
		for (int i = 1; i < stall.length; i++) {
			if(stall[i]- place >=mid) {// can place next cow on i
				place  = stall[i];
				cpsf++;
			}
			if(cpsf == noc) {
				return true;
			}
		}
		return false;
	}

}
