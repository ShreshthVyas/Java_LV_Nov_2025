package Lecture28;

public class Person {
	int id;
	String name;
	public Person(int id,String name) {
		System.out.println("Hello from Constructor with 2 params");
		this.id =id;
		this.name = name;
	}
	public Person(int i) {
		System.out.println("Hello from Constructor with 1 param");
		id =i;
	}
	public Person() {
		System.out.println("Hello from Constructor with  param");
		
	}
	public void greet() {
		System.out.println("Hello from greet");
	}
	
}
