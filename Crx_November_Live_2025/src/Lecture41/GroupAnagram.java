package Lecture41;
import java.util.*;
public class GroupAnagram {

	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map =  new HashMap<>();
		List<List<String>> ans  = new ArrayList<>();
		for (String s : strs) {
			char arr[] =  s.toCharArray();
			Arrays.sort(arr);
			String t =  new String(arr);
			
			if(map.containsKey(t)) {
				map.get(t).add(s);
			}
			else {
				map.put(t, new ArrayList<>());
				map.get(t).add(s);
			}
		}
		
		for (String s: map.keySet()) {
			ans.add(map.get(s));
		}
		
		return ans;
	}
}
