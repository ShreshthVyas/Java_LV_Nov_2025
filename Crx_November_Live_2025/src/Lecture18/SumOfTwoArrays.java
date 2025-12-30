package Lecture18;

import java.util.ArrayList;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,9,9};
		int brr[] = {1,2,3};
ArrayList<Integer> ans = new ArrayList<>();
		
		int carry = 0;
		int i = arr.length-1;
		int j = brr.length-1;
		while(i>=0 && j>=0) {
			int sum = arr[i]+brr[j]+carry;
			ans.addFirst(sum%10);
			carry = sum /10;
			i--;
			j--;
		}
		while(j>=0) {
			int sum = brr[j]+carry;
			ans.addFirst(sum%10);
			carry = sum /10;
			j--;
		}
		while(i>=0) {
			int sum = arr[i]+carry;
			ans.addFirst(sum%10);
			carry = sum /10;
			i--;
		}
		
		if(carry>0) {
			ans.addFirst(carry);
		}
		
		System.out.println(ans);
	}

	

}
