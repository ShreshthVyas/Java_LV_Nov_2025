package Lecture16;

import java.util.Scanner;

public class PrintAllPalindromicSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		
		for (int sp = 0; sp < s.length(); sp++) {
			for (int ep = sp+1; ep <= s.length(); ep++) {
				String temp = s.substring(sp,ep);
				if(ispal(temp)==true) {
					System.out.println(temp);
				}
			}
		}
	}
	public static boolean ispal(String s) {
		// TODO Auto-generated method stub
		int i =0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
