package Lecture15;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
//		int a[] =  new int[2];
//		int b[] =  new int[20];
//		int c[] =  new int[30];
//		
//		arr[0] = a;
//		arr[1] = b;
//		arr[2] =c;
		int n = sc.nextInt();
		int arr[][] = new int[n][];
		
		for (int i = 0; i < arr.length; i++) {
			int c = sc.nextInt();// length of ith arr
			int[] b =new int[c];
			arr[i] = b;
			for (int j = 0; j < b.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
