package Lecture2;

public class MultiplesOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int i =1;
		
		while(i<=n) {
			if(i%3==0) {// if this becomes true in that case in can say i is a multiple of 3 
				System.out.println(i);
			}
			i= i+1;
		}
		
	}

}
