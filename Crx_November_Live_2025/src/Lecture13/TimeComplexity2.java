package Lecture13;

import java.util.Iterator;

public class TimeComplexity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//O(1)
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		
		int i = 1;
		int n =10;
		int k =2;
		while(i<=n){
			System.out.println("Hello");
			i++;
		}//O(N)
		while(i<=n){
			System.out.println("Hello");
			i+=2;
		}//O(N)
		
		while(i<=n){
			System.out.println("Hello");
			i+=k;
		}//O(N/k)
		
		while(i>=n) {
			//Constant
			n--;
		}//O(N)
		
		while(i<=n) {
			//Constant
			n=n/2;
		}// O(LogN)
		while(i<=n) {
			//Constant
			n=n/3;
		}// O(LogN)
		
		while(i<=n) {
			//Constant
			n=n/k;
		}// O(LogN base k)
		
		while(i<=n) {
			//Constant
			i*=2;
		}//O(LogN)
		
		while(i<=n) {
			//Constant
			i*=k;
		}//O(LogN)
		
		for (int j = 0; j <=n; j++) {
			for (int a = 0; a <=n; a++) {
				//Constant
			}
		}//O(N^2)
		
		for (int j = 0; j <=n; j++) {
			for (int a = j; a <=n; a++) {
				//Constant
			}
		}//O(N^2)
		
		for (int j = 0; j*j <= n; j++) {
			// Constant Work
			
		}//O(Sqrt N)
		
		for (int a = 0; a <=n ; a++) {
			for (int b= 1; b <= a*a; b++) {
				for (int c = 0; c <=n/2; c++) {
					
				}
			}
		}//O(N^4)
		
		for (int a = n/2; a <=n ; a++) {
			for (int b= 1; b <= n/2; b++) {
				for (int c = 1; c <=n/2; c*=2) {
					
				}
			}
		}//O(N^2 LogN)
		
		
		// Linear Search - O(N)
		//BinarySearch - O(Log N)
		//Bubble Sort - O(N^2)
		//SelectionSort - O(N^2)
		//Insertion Sort - O(N^2)
		
		
	}

}
