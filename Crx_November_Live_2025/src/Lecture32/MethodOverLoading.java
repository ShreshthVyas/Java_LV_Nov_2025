package Lecture32;

public class MethodOverLoading {
	
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		
	}

//	private static void add(int i, int j) {
//		// TODO Auto-generated method stub
//		int c = i+j;
//	}
//	private static void add(int i, double j) {
//		// TODO Auto-generated method stub
//		double c = i+j;
//	}
//	private static void add(int i, int j,int k) {
//		// TODO Auto-generated method stub
//		int c = i+j+k;
//	}
	private static void add(int ...args) {
		// TODO Auto-generated method stub
		
		int arr[] = args;
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
}
