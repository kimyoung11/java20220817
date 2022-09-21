package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class leet287 {
	public static void main(String[] args) {
		int[] nums = {1,3,4,2,2};
		//하나의 수만 중복되어있다. 중복된 수를 리턴하면된다
		Set<Integer> hs = new HashSet<>();
		
		for(int i=0;i<nums.length;i++){
			hs.add(nums[i]);
		}
		System.out.println("hs:"+ hs);
		//Arrays.sort(nums);
		System.out.println("array:"+ Arrays.toString(nums));
		for(int i=0;i<nums.length;i++) {
			if(hs.size()>1) {
				hs.remove(nums[i]);
			}else
				break;
		}
		System.out.println(hs);
	}
}
