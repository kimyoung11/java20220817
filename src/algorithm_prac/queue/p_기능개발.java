package algorithm_prac.queue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.StringTokenizer;

public class p_기능개발 {
	public static void main(String[] args) {
		
		int[] progresses =  {93, 30, 55};
		int[] speeds = {1, 30, 5};
		int[] days = new int[progresses.length];
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<progresses.length;i++) {
			if((100 - progresses[i]) % speeds[i] >0) {
				days[i] = (100-progresses[i]) / speeds[i] + 1;
				continue;
			}
			days[i] =(100-progresses[i]) / speeds[i] ;
		}

		stack.add(days[0]);
		for(int i=1;i<days.length;i++) {
			if(stack.peek()> days[i]) {
				stack.add(stack.peek());
			}else {
				stack.add(days[i]);
			}
		}

		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
		for(int i=0;i<stack.size();i++) {
			hm.put(stack.get(i),hm.getOrDefault(stack.get(i), 0)+1);
		}
		
		
		
		System.out.println(sb);
//		System.out.println(sb.toString().replace(",","").replace("[", "").replace("]", ""));
		
		String s1 = sb.toString();
		String[] nums = s1.substring(1, s1.length()-1).split(",");
		
		int[] answer = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			answer[i] = Integer.parseInt(nums[i].trim());
		}
		
		System.out.println(Arrays.toString(answer));
		
		
		
	}
}
