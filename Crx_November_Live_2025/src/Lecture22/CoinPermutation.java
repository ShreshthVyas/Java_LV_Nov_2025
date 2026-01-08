package Lecture22;

public class CoinPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = {1,2,3};
		int target = 5;
		rec(coin,target,"");
	}

	public static void rec(int[] coin, int target, String ans) {
		// TODO Auto-generated method stub
		if(target ==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < coin.length; i++) {
			if(target>=coin[i]) {
				rec(coin, target-coin[i], ans+coin[i]);
			}
		}
		
	}

}
