package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class p_튜플 {
	public static void main(String[] args) {
		// 정렬된 튜플 LIST 만들기

///////////////// Key 기준 정렬
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

// Map에 데이터 추가
		hm.put("B", 1);
		hm.put("C", 2);
		hm.put("E", 4);
		hm.put("A", 5);
		hm.put("D", 3);

		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(hm.entrySet());

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		System.out.println("*****Key 기준 오름 차순 정렬 *****");
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

/////////////// Value 기준 정렬
		list = new ArrayList<Entry<String, Integer>>(hm.entrySet());

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		System.out.println();
		System.out.println("*****Value 기준 오름 차순 정렬 *****");
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}
}
