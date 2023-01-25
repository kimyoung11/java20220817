package algorithm_prac.sort;

import java.util.Arrays;

public class Select_sort {
	public static void main(String[] args) {
		int []arr = {4,2,3,1,5};
		int indexMin=0;
		int temp=0;
		
		for(int i=0;i<arr.length-1;i++) {
			indexMin = i; // 0
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[indexMin]) {
					indexMin = j; //1
				}
			}
			temp = arr[indexMin]; 
			arr[indexMin] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
