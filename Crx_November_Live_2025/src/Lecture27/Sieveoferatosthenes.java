package Lecture27;

public class Sieveoferatosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1000;
		soe(n);
	}

	public static void soe(int n) {
		// TODO Auto-generated method stub
		boolean arr[] = new boolean[n+1];
		
		arr[0] =true;
		arr[1] = true;
		
		for (int i = 2; i*i <=n; i++) { // Sqrt N
			if(arr[i] == false) {
				for (int j = 2; j*i <=n; j++) {
					arr[i*j] = true;
				}
			}
		}
		
		for (int i = 2; i < arr.length; i++) {
			if(arr[i]== false) {
				System.out.println(i);
			}
		}
		
	}

}
