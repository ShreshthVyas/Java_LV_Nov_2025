package Lecture8;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		System.out.println(arr[1] + " " + arr[3]);
		swap(arr[1],arr[3]);
		System.out.println(arr[1] + " " + arr[3]);
	}
	public static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp = a;
		a= b;
		b= temp;
		
	}

}
