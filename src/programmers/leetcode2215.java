package programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class leetcode2215 {
	public static void main(String[] args) {

		int[] nums1 = {1,2,3};
		int[] nums2 = {2,4,6};

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> set3 = new HashSet<>();
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			set1.add(nums1[i]);
			set3.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++)
			set2.add(nums2[i]);
		
//		System.out.println(set1);
//		System.out.println(set2);
		
		// set1 - set2 
		set3.retainAll(set2); //set3 = [2];
//		System.out.println(set3);
		Iterator<Integer> it = set1.iterator();
//		System.out.println(set1.size());
		List<Integer> set4 = new ArrayList<>();
		while(it.hasNext()) {
			int num1 = it.next();
			if(!set3.contains(num1)) {
				set4.add(num1);
			}
		}
//		System.out.println(set3);
//		System.out.println(set4);
		list.add(set4);
		List<Integer> set5 = new ArrayList<>();
		it = set2.iterator();
		while(it.hasNext()) {
			int num2 = it.next();
			if(!set3.contains(num2)) {
				set5.add(num2);
			}
		}
		list.add(set5);
		System.out.println(list);
	
	


		
		// set2 - set1
		

	}
}
