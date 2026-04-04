package Lecture47;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 347;
		
		int ans  = countsetbit(n);
		int ans2 = countsetbitfaster(n);
		
		System.out.println(ans);
		System.out.println(ans2);
	}

	private static int countsetbitfaster(int n) {// O(SetBits)
		// TODO Auto-generated method stub
		int count = 0;
		while(n>0) {
			n = n&n-1;
			count++;
		}
		return count;
	}

	private static int countsetbit(int n) {//O(32)
		// TODO Auto-generated method stub
		int count = 0;
		while(n>0) {
			if((n&1) == 1) {// found one set bit
				count++;
			}
			n = n>>1;
		}
		return count;
	}

}
