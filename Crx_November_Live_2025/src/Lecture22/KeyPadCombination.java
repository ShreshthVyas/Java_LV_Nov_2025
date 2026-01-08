package Lecture22;

public class KeyPadCombination {
	//: 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 6 -> pqrs , 7 -> tuv , 8 -> wx , 9 -> yz
	public static void main(String[] args) {
		String keypad[] = {"","abc","def","ghi","jkl", "mno", "pqrs" ,"tuv" ,"wx" ,"yz"};
		rec("123","",keypad);
	}

	public static void rec(String s, String ans, String[] keypad) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch =  s.charAt(0);//'1'
		String temp = keypad[ch-'0'];//"abc"
		
		for (int i = 0; i < temp.length(); i++) {
			char c = temp.charAt(i);
			rec(s.substring(1), ans+c, keypad);
		}
	}
}
