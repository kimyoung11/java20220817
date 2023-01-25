package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class p_더맵게 {
	public static void main(String[] args) {
		int[] scoville = { 1, 2, 3, 50, 51, 52 };
		int K = 7;
		int answer = 0;

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < scoville.length; i++)
			al.add(scoville[i]);

		while(al.size()!=0) {
			answer++;
			Collections.sort(al);
			int min1 = al.get(0);
			int min2 = al.get(1);
			int mul = min1 + 2 * min2;
			
			if(K<=mul) {
				break;
			}
			al.remove(0);
			al.remove(1);
			if(al.size()==0)
				answer=0;
			al.add(0,mul);	
		}
		System.out.println(answer);
//		int min1 = al.get(0);
//		int min2 = al.get(1);
//		int mul = min1 + 2*min2;
//		al.remove(0);
//		al.remove(1);
//		al.add(0,mul);
//		
//		System.out.println(al);
//		
//		min1 = Math.min(al.get(0), al.get(1));
//		min2 = Math.min(al.get(0), al.get(2));
//		mul = min1 + 2 * min2;
//		al.remove(0);
//		al.remove(1);
//		al.add(0,mul);
//		

	}
}
