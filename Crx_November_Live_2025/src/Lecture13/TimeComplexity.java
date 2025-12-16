package Lecture13;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			// some work
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime- startTime);
	}

}
