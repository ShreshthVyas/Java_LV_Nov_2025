package Lecture39;

public class Car implements Comparable<Car>{
	int price;
	int speed;
	String name;
	
	public Car(int price , int speed, String name) {
		this.speed = speed;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.speed + " " + this.price;
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.price -  o.price;//ascending
//		return o.speed - this.speed;descending
//		return this.name.compareTo(o.name);
	}
}
