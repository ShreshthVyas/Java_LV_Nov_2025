package Lecture39;

public class AbstractChild extends AbstractClassDemo{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("Hi from f1");
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("Hi from f2");
	}
	
	public static void main(String[] args) {
		AbstractChild a =  new AbstractChild();
		a.f1();
		a.f2();
	}

}
