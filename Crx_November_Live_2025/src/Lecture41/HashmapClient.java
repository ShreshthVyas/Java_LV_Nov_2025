package Lecture41;

public class HashmapClient {
	
	public static void main(String[] args) {
		Hashmap<String ,Integer> map = new Hashmap<>();
		map.put("A", 10);
		map.put("B", 102);
		map.put("C", 103);
		map.put("D", 104);
		map.put("E", 105);
		
		System.out.println(map);
		map.remove("B");
		map.put("A", 106);
		System.out.println(map);
		
		System.out.println(map.get("A"));
		System.out.println(map.containsKey("A"));
		System.out.println(map.get("Adh"));
		System.out.println(map.containsKey("Adnd"));
	}
}
