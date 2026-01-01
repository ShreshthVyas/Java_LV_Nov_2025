package Lecture19;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = pow(3,5);
		System.out.println(ans);
	}

	public static int pow(int a, int b) { // a^b
		// TODO Auto-generated method stub
		if(b == 0) {
			return 1;
		}
		int p = pow(a,b-1);
		return p * a;
	}

}
