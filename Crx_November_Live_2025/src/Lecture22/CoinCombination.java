package Lecture22;

public class CoinCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = {1,2,3};
		int target = 5;
		rec(coin,target,"",0);
	}

	public static void rec(int[] coin, int target, String ans,int si) {
		// TODO Auto-generated method stub
		if(target ==0) {
			System.out.println(ans);
			return;
		}
		for (int i = si; i < coin.length; i++) {// starts from i
			if(target>=coin[i]) {
				rec(coin, target-coin[i], ans+coin[i],i);
			}
		}
		
	}

}
