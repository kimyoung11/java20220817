package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class p9 {
	public static void main(String[] args) {
			String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses","eyewear"},{"green_turban", "headgear"}};
			int answer = ;
			HashMap<String,Integer> hm = new HashMap<>();
			for(int i=0;i<clothes.length;i++) {
				hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0)+1);
			}
			
			System.out.println(hm);
			
			if(hm.size() > 1) {
				int cnt =1;
				for(String key:hm.keySet()) {
					cnt = cnt * (hm.get(key) + 1);
				}
				answer = cnt -1;
			}
			System.out.println(hm.get(clothes[0][1]));
			System.out.println(hm.get(clothes[1][1]));
			System.out.println(answer);
	}
}
