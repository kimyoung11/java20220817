package ch15.lecture;

import java.util.ArrayList;
import java.util.List;

public class leetcode1431 {
	public static void main(String[] args) {
		
		int[] candies = {4,2,1,1,2};
		int extraCandies = 1;
		List<Boolean> list = new ArrayList<>();
		int temp =0;
		int max = candies[0];
		for(int i=1;i<candies.length;i++) {
			if(max <= candies[i])
				max=candies[i];
		}
		for(int i=0;i<candies.length;i++) {
			temp = candies[i] + extraCandies;
			if(max >= temp)
				list.add(true);
			else
				list.add(false);
		}
		
		System.out.println(list);
	}
}
