package Lecture39;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BusyMan {
	
	public static class pair{
		int st;
		int et;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int noa = sc.nextInt();
		while(noa-->0) {
			int n =  sc.nextInt();
			pair arr[] = new pair[n];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new pair();
				arr[i].st = sc.nextInt();
				arr[i].et = sc.nextInt();
			}
			Arrays.sort(arr, new Comparator<pair>() {

				@Override
				public int compare(pair o1, pair o2) {
					// TODO Auto-generated method stub
					return o1.et - o2.et;
				}
			});
			int count =1;
			int cet = arr[0].et;
			for (int i = 1; i < arr.length; i++) {
				if(arr[i].st>=cet) {
					count++;
					cet = arr[i].et;
				}
			}
			System.out.println(count);
		}
	}

}
