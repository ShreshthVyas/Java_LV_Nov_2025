package Lecture47;

public class CheckIthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 456;
		int i = 7;
		
		int mask = 1<<i;
		
		if((n&mask) == 0) {
			System.out.println("Not Set");
		}
		else {
			System.out.println("Set");
		}
	}

}
