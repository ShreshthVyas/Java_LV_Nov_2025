package Lecture1;

public class GreatestOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000;
		int b = 200;
		int c = 30;
		
		if(a>b && a>c) {// a is the greatest
			System.out.println("a");
		}
		else if(b>c) {// b is the greatest
			System.out.println("b");
		}
		else {//c is the greatest
			System.out.println("c");
		}
		
	}

}
