package programmers;

import java.util.Arrays;

public class p_구명보트 {
	public static void main(String[] args) {
		
		int[] people = {70,50,80};
		int limit =100;
		
		Arrays.sort(people);
		
		int start = 0;
		int end = people.length-1;
		int answer = 0;
		while(start<= end) {
			if(people[start] + people[end] <=limit) {
				start++;
			}
			answer++;
			end--;
		}
		System.out.println(answer);
	}
}
