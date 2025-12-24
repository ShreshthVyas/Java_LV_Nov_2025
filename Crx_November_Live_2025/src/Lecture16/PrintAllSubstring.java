package Lecture16;

import java.util.Scanner;

public class PrintAllSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		
		for (int sp = 0; sp < s.length(); sp++) {
			for (int ep = sp+1; ep <= s.length(); ep++) {
				System.out.println(s.substring(sp,ep));
			}
		}
		
	}

}
