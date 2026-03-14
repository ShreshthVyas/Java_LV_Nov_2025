package Lecture41;

public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 1002;
		
		System.out.println(a.hashCode());
		
		String s = "bdf";
		String f = "bdf";
		System.out.println(s.hashCode());
		System.out.println(f.hashCode());
		
		Long l = 123490909090909090l;
		System.out.println(l.hashCode());
		
	}

}
