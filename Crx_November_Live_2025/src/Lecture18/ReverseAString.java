package Lecture18;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		for (char ch : s.toCharArray()) {
			System.out.println(ch);
		}
		String str = reverse(s);
		System.out.println(str);

	}

	public static String reverse(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(s);

//		for (int i = s.length() - 1; i >= 0; i--) {// N
//			sb.append(s.charAt(i));
//		}
		
		return sb.reverse().toString();
	}

}
