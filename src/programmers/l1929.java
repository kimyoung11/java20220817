package programmers;

import java.util.Arrays;

public class l1929 {
	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		int[] res = new int[nums.length];
	
		
		for(int i=0;i<nums.length/2;i++) {
			res[i*2] = nums[i];
		}
		for(int i=nums.length/2;i<nums.length;i++) {
			res[2*i-5] = nums[i];
		}
		

		System.out.println(Arrays.toString(res));
	}
}
