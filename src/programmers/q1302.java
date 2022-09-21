package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class q1302 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> hm = new HashMap<>();
		ArrayList<String> al = new ArrayList<>();
		for(int i=0;i<n;i++) {
			String str = sc.next();
			hm.put(str, hm.getOrDefault(str, 0)+1);
		}

		int max = 0;
		for(Entry<String, Integer> item : hm.entrySet()) {
			if(item.getValue()>max) {
				max= item.getValue();
			}
		}
		for(Entry<String,Integer> item : hm.entrySet()) {
			if(item.getValue() == max) {
				al.add(item.getKey());
			}
		}
		Collections.sort(al);
		System.out.println(al.get(0));
		
	}
}
