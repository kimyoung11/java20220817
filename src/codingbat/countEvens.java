package codingbat;

import java.util.Arrays;

public class countEvens {
	public static void main(String[] args) {
		
		int[] nums = {13, 1, 2, 13, 2, 1, 13};
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] !=13)
				sum = sum + nums[i];
			else if(nums[i] ==13 && i<nums.length-1) {
				nums[i]=0;
				nums[i+1] = 0;
			}
		}
		System.out.println(sum);
	}
}
