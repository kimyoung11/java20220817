package programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class leet2032 {
	public static void main(String[] args) {
		
		int []nums1 = {1,1,3,2};
		int []nums2 = {2,3};
		int []nums3 = {3};
		
		Set<Integer> set = new HashSet<>();
		
		for(int item:nums1)
			set.add(item);
		for(int item:nums2)
			set.add(item);
		for(int item:nums3)
			set.add(item);
		

	}
}
