package Lecture17;

import java.util.Scanner;

public class CBNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		String s =  sc.next();
		int count =0;
		boolean [] vis =  new boolean[s.length()];
		for (int i = 1; i <= s.length(); i++) {// length of substring
			for (int j = 0; j<= s.length()-i; j++) {// starting point
				String t = s.substring(j,j+i);
				long num = Long.parseLong(t);
				if(isCb(num) && isValid(vis,j,j+i)) {
					count++;
					System.out.println(t);
					
					for (int k = j; k < j+i; k++) {// mark all digit visited
						vis[k] = true;
					}
					
				}
			}
		}
		System.out.println(count);
	}
	
	public static boolean isValid(boolean[] vis, int si, int ei) {
		// TODO Auto-generated method stub
		
		for (int i = si; i < ei; i++) {
			if(vis[i] == true) {// digit already used
				return false;
			}
		}
		return true;
	}

	public static boolean isCb(long l) {
		//0 and 1 are not considered CB numbers.
		if(l ==0 || l==1) {//point 1
			return false;
		}
		
		//point 2
		int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == l) {
				return true;
			}
		}
		
		//point 3
		for (int i = 0; i < arr.length; i++) {
			if(l%arr[i] ==0) {
				return false;
			}
		}
		
		return true;
	}

}
