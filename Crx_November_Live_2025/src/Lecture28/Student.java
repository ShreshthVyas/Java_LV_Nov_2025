package Lecture28;

public class Student {
	int id;
	String name;
	private int age;
	static int count=0;
	public Student(int id, String name ) {
		this.id =id;
		this.name = name;
		count++;
	}
	
	public int getAge() {
		return age;
	}

//	public void setAge(int age) throws Exception {
//		if(age<0) {
//			throw new Exception("Age cannot be negetive");
//		}
//		this.age = age;
//	}
	public void setAge(int age) {
		try {
			if(age<0) {
				throw new Exception("Age cannot be negetive");
			}
			else {
				this.age = age;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("hello from finally");
		}
	}

	public  void greet(String name) {
		System.out.println(this.name +" greet "+ name);
		count++;
	}
	
	public static void func() {
		System.out.println("Hi from static func");
	}
	
	static {
		int a =10;
		double d =2.2;
		System.out.println("Hello from static block");
	}
}
