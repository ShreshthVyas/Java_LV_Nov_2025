package Lecture40;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<String , Integer> map = new HashMap<>();
//		LinkedHashMap<String , Integer> map = new  LinkedHashMap<>();
		TreeMap<String ,Integer> map =  new TreeMap<>();
		map.put("A", 103);
		map.put("B", 1089);
		map.put("C", 10875);
		map.put("D", 1098);
		map.put("E", 10000);
		map.put("A", 100);
		map.put("D", null);
//		map.put(null, 12);
		map.put("null", 12345);
		
		
		System.out.println(map.get("A"));
		System.out.println(map.get("Adqfdwq"));
		
		
		System.out.println(map.containsKey("A"));
		
		System.out.println(map.containsKey("V"));
		
		System.out.println(map.remove("A"));
		
		System.out.println(map);
		
		System.out.println(map.getOrDefault("A", -10));
		
		for (String s : map.keySet()) {
			System.out.println(map.get(s));
		}
		
	}

}
