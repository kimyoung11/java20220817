package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 듣보잡 {
	public static void main(String[] args) {
		//HashMap 풀이
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		HashMap<String, Integer> hm = new HashMap<>();
		ArrayList<String> al = new ArrayList<>();
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			hm.put(str, 1);
		}
		for (int j = 0; j < M; j++) {
			String str2 = sc.next();
			hm.put(str2, hm.getOrDefault(str2, 0) + 1);
		}
		
		for(Map.Entry<String,Integer> entry : hm.entrySet()) {
			if(entry.getValue()>1) {
				cnt++;
				al.add(entry.getKey());
			}
		}
		Collections.sort(al);
		System.out.println(cnt);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}