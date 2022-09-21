package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class q11652 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		HashMap<Long,Integer> hm = new HashMap<>();
		int max = 0;
		long maxKey = 0;
		ArrayList<Long> al = new ArrayList<>();
		
		for(int i=0;i<a;i++){
			long key = Long.parseLong(br.readLine());
			hm.put(key, hm.getOrDefault(key, 0)+1);
		}
		//System.out.println(hm);
		
		for(Map.Entry<Long, Integer> entry: hm.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue();
			}
		}


		for(Map.Entry<Long, Integer> entry: hm.entrySet()) {
			if(entry.getValue() == max) {
				al.add(entry.getKey());
			}
		}
		Collections.sort(al);
		System.out.println(al.get(0));

	}
}
