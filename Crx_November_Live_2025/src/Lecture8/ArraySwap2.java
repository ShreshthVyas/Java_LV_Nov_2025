package Lecture8;

public class ArraySwap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		System.out.println(arr[1] + " " + arr[3]);
		swap(1,3,arr);
		System.out.println(arr[1] + " " + arr[3]);
	}
	public static void swap(int a, int b,int arr[]) {
		// TODO Auto-generated method stub
		int temp = arr[a];
		arr[a]= arr[b];
		arr[b]= temp;
	}

}
