package Lecture24;

import java.util.ArrayList;
import java.util.List;

public class PalindromepartitionLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	List<List<String>> ans;
	public List<List<String>> partition(String s) {
		ans = new ArrayList<>();
		List<String> list = new ArrayList<>();
		rec(s, list);
		
		return ans;
		
	}
	public  void rec(String s, List<String> list) {
		// TODO Auto-generated method stub
		if(s.length() ==0) {
			List<String> temp = new ArrayList<>(list);
			ans.add(temp);
			return;
		}
		for (int i = 1; i <= s.length(); i++) {//ALl partitions
			String l = s.substring(0,i);
			if(isPal(l)) {
				list.add(l);
				rec(s.substring(i), list);
				list.remove(list.size()-1);//backtracking
			}
		}
	}

	public  boolean isPal(String l) {
		// TODO Auto-generated method stub
		int i =0;
		int j = l.length()-1;
		while(i<j) {
			if(l.charAt(i)!=l.charAt(j)) {
				return false;
			}
			i++;
			j--;	
		}
		return true;
	}

	

}
