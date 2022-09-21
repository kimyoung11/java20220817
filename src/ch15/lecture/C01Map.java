package ch15.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01Map {
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		map.put("a",1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.remove("e", 5);
		System.out.println(map.size());
		
		System.out.println("ENTRYSET 사용");
		for(Map.Entry<String,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("SET 사용");
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
