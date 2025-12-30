package Lecture18;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.nanoTime();
		String s = "";
		int n = 100000;
		for (int i = 0; i < n; i++) {//O(n^2)
			s+=i;
		}
		long end = System.nanoTime();
		System.out.println(end-start);
		
		StringBuilder sb = new StringBuilder();
		long start1 = System.nanoTime();
		for (int i = 0; i < n; i++) {//O(N)
			sb.append(i);
		}
		long end1 = System.nanoTime();
		System.out.println(end1-start1);
		
		
	}

}
