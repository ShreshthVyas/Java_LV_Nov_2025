package Lecture39;

import java.util.Arrays;
import java.util.Comparator;

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] c =  new Car[5];
		
		c[0] = new Car(100000, 200, "volkswagen");
		c[1] = new Car(19090, 300, "Lambor");
		c[2] = new Car(10567, 310, "AstonMartin");
		c[3] = new Car(1898989898, 340, "RollsRoyce");
		c[4] = new Car(10000, 140, "Alto");
		
		//sort(c);
		
//		System.out.println(Arrays.toString(c));
		
		Arrays.sort(c, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				return o2.speed-o1.speed;
			}
		});
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		
	}

	private static <T extends Comparable<T>>void sort(T[] arr) {
		// TODO Auto-generated method stub
		for (int pass = 1; pass < arr.length; pass++) {// this is the loop to repeat our logic n-1 times
			for (int j = 0; j < arr.length-pass; j++) {// this is the loop for comparing one elemnt to rest
				if(arr[j].compareTo(arr[j+1])>0) {
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
