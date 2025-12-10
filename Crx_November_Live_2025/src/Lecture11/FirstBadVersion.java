package Lecture11;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int firstBadVersion(int n) {
		int lo = 1;
		int hi = n;
		int ans =0;
		while(lo<=hi) {
			int mid = lo + (hi-lo)/2;
			if(isBadVersion(mid) ==  true) {
				ans= mid;
				hi = mid-1;
			}
			else {// mid is good
				lo = mid+1;
			}
		}
		return ans;
	}
	boolean isBadVersion(int version) {// implemented by leetcode
		return false;
	}

}
