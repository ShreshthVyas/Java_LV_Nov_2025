package Lecture8;

public class ArrraySwap3 {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int brr[] = {7,8,9,10,11,12};
		System.out.println(arr[1] + " " + brr[1]);
		swap(arr,brr);
		System.out.println(arr[1] + " " + brr[1]);
	}

	public static void swap(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int temp[] = arr;
		arr = brr;
		brr = temp;
	}
}
