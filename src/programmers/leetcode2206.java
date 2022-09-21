package programmers;

import java.util.HashMap;
import java.util.Map;

public class leetcode2206 {
	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int[] nums = { 1, 2, 3, 4 };
		int length = nums.length / 2;
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		int cnt = 0;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
			if (entry.getValue() % 2 == 0) {
				cnt += entry.getValue() / 2;
			}
		}
		if(cnt ==0)
			return false;
		else
			return true;
	}
}
