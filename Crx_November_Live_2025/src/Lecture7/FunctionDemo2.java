package Lecture7;

public class FunctionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi from main");
		sub();
		System.out.println("Mid");
		add();
		System.out.println("Bye from main");
	}

	public static void add() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		int c = a+b;
		sub();
		System.out.println(c);
	}
	
	public static void sub() {
		int a = 10;
		int b = 10;
		int c = a-b;
		System.out.println(c);
	}

}
