package programmers;

import java.util.HashMap;
import java.util.Map;

public class leet1512 {
	public static void main(String[] args) {
		int[] nums = {1,1,1,1};
		int cnt=0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);
		}
		
		for(Map.Entry<Integer,Integer> entry : hm.entrySet()) {
			if(entry.getValue()>1) {
				int temp = entry.getValue();
				cnt += (temp * (temp -1) / 2);
			}
		}
		System.out.println(cnt);
	}
}
