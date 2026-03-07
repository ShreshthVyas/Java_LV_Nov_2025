package Lecture39;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {1,2,3,4,4,5};
		String arr1[] =  {"a", "a" ,"b"	};
		Double d[] = {1.1 , 2.2 ,3.3 ,4.5};
		Display(arr1);
		Display(arr);
		Display(d);
		

	}

	private static <T>void Display(T[] arr1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
