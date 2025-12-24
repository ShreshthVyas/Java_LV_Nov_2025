package Lecture15;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String s1 = "hello";
		String s2 =  new String("hello");
		String s3 =  new String("hello");
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s2==s3);
		

//		System.out.println(s);
		
//		int arr[] = new int[5];
//		int brr[] = new int[5];
//		
//		int a =10;
//		int b = 10;
//		
//		System.out.println(a==b);
//		System.out.println(arr==brr);
		
	}

}
