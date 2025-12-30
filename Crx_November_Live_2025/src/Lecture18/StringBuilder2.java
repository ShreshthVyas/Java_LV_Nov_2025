package Lecture18;

public class StringBuilder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		sb.append("a");
		sb.append("a");
		sb.append("a");
		sb.append("a");
		sb.append("a");
		sb.append("a");
		sb.append("a");
		
		System.out.println(sb);
		String s = sb.toString();
		System.out.println(s);
		
		sb.charAt(1);
		for (int i = 0; i < sb.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		sb.replace(0, 2, "ab");
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
	}

}
