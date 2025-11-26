package Lecture6;

public class PostFix_PreFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i =10;
//		
//		System.out.println(++i);
//		
//		System.out.println(i);
		
		int a =10;
		int b = 20;
		
		int sum=  a++ + b++ + 20+ --a+ a++ + --b + b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(sum);
	}

}
