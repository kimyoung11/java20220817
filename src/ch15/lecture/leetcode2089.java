package ch15.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode2089 { //leetcode2089 
	public static void main(String[] args) {
		
		int[] nums = {1,2,5,2,3};
		int target = 2;
		List<Integer> list = new ArrayList<>();
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target)
				list.add(i);
		}
		
		System.out.println(list);
	}
}
