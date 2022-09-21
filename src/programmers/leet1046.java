package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class leet1046 {
	public static void main(String[] args) {
		
		int[] stones = {2,7,4,1,8,1};
		ArrayList<Integer> list = new ArrayList<>();

		for(int stone:stones)
			list.add(stone);
		
//		System.out.println(list);
		while(list.size() !=1) {
		Collections.sort(list);
		System.out.println(list);
		int max1 = list.get(list.size()-1);
		int max2 = list.get(list.size()-2);
		int minus = max1 - max2;
		list.remove(Integer.valueOf(max1));
		list.remove(Integer.valueOf(max2));
		list.add(minus);
		}
		System.out.println(list);
//		while(list.size()!=1) {
//			
//	}
}
}
