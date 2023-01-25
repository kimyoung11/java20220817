package algorithm_prac.sort;

import java.util.Arrays;

public class Bubble_sort {
	public static void main(String[] args) {
		
		int[] arr = {4,2,3,1,5};
		int temp;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] >arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// O(n^2) 번 돌면서 정렬
	}
}
