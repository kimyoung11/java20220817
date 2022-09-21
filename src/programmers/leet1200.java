package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leet1200 {
	public static void main(String[] args) {
		
		int[] arr = {4,2,1,3};
		List<List<Integer>> lists = new ArrayList<>();
		List<Integer> abs = new ArrayList<>();
//		List<Integer> al = new ArrayList<>();
		int []arr2 = new int[100];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp = Math.abs(arr[i] - arr[j]);
				arr2[temp]++;
			}
		}
		//System.out.println(Arrays.toString(arr2));
		int max = -9999;
		for(int i=0;i<arr2.length;i++) {
			max = Math.max(max, arr2[i]);
		}
		max= arr2[max];
		Arrays.sort(arr);
//		System.out.println(max);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(Math.abs(arr[i]-arr[j]) == max) {
					//System.out.println(i + " " +j + " " + Math.abs(arr[i]-arr[j]));
					//System.out.println(abs);
					//System.out.println(abs.size());
					lists.add(i,new ArrayList<Integer>(Arrays.asList(arr[i],arr[j])));
				}
				Collections.sort(abs);
				//System.out.println(abs);
//				abs.clear();
			}
		}
		System.out.println(lists);
		//System.out.println(Arrays.toString(arr2));
		
	}
}
