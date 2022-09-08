package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class p8 {
	public static void main(String[] args) {
		
		String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses","eyewear"},{"green_turban", "headgear"}};
		
		HashMap<String,ArrayList<String>> hm = new HashMap<>();
		int answer =0 ;
		for(int i=0;i<clothes.length;i++) {
			String str = clothes[i][0];
			ArrayList<String> al = hm.getOrDefault(clothes[i][1], null);
			if(al == null) al = new ArrayList<>();
			al.add(str);
			hm.put(clothes[i][1], al);
		}
		
		for(String key: hm.keySet()) {
			System.out.println(key + " "+ hm.get(key));
		}
		System.out.println("넌 누구냐" + hm.size());
		System.out.println(hm.keySet().size());
		System.out.println(hm.get(clothes));
		int mul = 1;
		for(int i=0;i<hm.size();i++) {
			mul = mul * hm.get(clothes[i][1]).size();
		}
		System.out.println(mul);
		if(clothes.length ==1)
			answer = mul;
		else
			answer = clothes.length + mul;
		//n =1일떄랑 n = 2 일떄 까지 완료했는데, n = 3이상일떄 처리 어떻게?
		
		System.out.println(answer);
	}
}
