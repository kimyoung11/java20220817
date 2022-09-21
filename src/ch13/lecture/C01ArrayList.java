package ch13.lecture;

import java.util.ArrayList;
import java.util.Arrays;

public class C01ArrayList {
	public static void main(String[] args) {
		
		int[] arr = {3,6,9};
		int[] arr2 = new int[arr.length+1];
		
		arr2 = arr.clone();
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2.length);
	
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10230);
		al.add(102301239);
		System.out.println(al);
		System.out.println(al.get(0));
	}
	
}
