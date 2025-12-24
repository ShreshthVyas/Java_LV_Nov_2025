package Lecture16;

public class PlayingwithGoodString {
	
	public static void main(String[] args) {
		String s = "cbaieacdeaaaaeeaaa";
		int count =0;
		int max =-1;
		for (int i = 0; i < s.length(); i++) {
			char ch =  s.charAt(i);
			if(isVowel(ch)) {// vowel
				count++;
			}
			else {//consonant
				max = Math.max(max, count);
				count=0;
			}
		}
		max = Math.max(max, count);
		System.out.println(max);
	}

	public static boolean isVowel(char ch) {
		// TODO Auto-generated method stub
		if(ch =='a' || ch =='e'|| ch =='i'|| ch=='o'|| ch=='u') {
			return true;
		}
		return false;
	}
}
