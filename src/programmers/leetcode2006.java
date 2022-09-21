package programmers;

import java.util.HashMap;
import java.util.Map;

public class leetcode2006 {
	public static void main(String[] args) {
		
		int []nums = {1,2,2,1};
		int k = 1;
		int result = 0;
		Map<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);
		}
		
		for(Map.Entry<Integer,Integer> entry: hm.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
		
		for(Map.Entry<Integer,Integer> entry: hm.entrySet()) {
			Integer key = entry.getKey(); //2
			Integer target1 = key - k;
			Integer target2 = key + k;
			
			Integer value = entry.getValue();
			Integer targetValue1 = hm.get(target1);
			Integer targetValue2 = hm.get(target2);
			
			if(targetValue1 !=null) {
				result += value * targetValue1;
			}
			if(targetValue2 !=null) {
				result +=value * targetValue2;
			}
		}
		result = result /2;
		System.out.println(result);
		
	
	}
}
