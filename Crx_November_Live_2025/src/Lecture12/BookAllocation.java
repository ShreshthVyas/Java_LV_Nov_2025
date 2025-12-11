package Lecture12;

import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nob = sc.nextInt();
		int nos = sc.nextInt();
		int books[] =  new int[nob];
		
		for (int i = 0; i < books.length; i++) {
			books[i] = sc.nextInt();
		}
		
		int ans =  binarySearch(books,nos,nob);
		System.out.println(ans);
	}

	public static int binarySearch(int[] books, int nos, int nob) {
		// TODO Auto-generated method stub
		int lo =0;
		int hi = 0;
		for (int i = 0; i < books.length; i++) {
			hi+= books[i];
		}
		int ans =-1;
		
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(IsItPossible(books,nos,nob,mid)) {
				ans = mid;
				hi = mid-1;
			}
			else {
				lo = mid+1;
			}
		}
		
		return ans;
	}

	public static boolean IsItPossible(int[] books, int nos, int nob, int mid) {
		// TODO Auto-generated method stub
		int cs =1;
		int pages_read =  0;
		
		for (int i = 0; i < books.length; ) {
			if(pages_read + books[i] <= mid) {
				pages_read = pages_read + books[i];
				i++;
			}
			else {
				cs++;
				pages_read =0;
			}
			if(cs>nos) {
				return false;
			}
		}
		return true;
	}

}
