package programmers;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class leetcode1748_2 {
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,2};
		int sum = IntStream.of(1,2,3,2)
			.boxed()
			.collect(Collectors.groupingBy(e->e,Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e -> e.getValue() == 1)
			.mapToInt(e -> e.getKey())
			.sum();
		
		System.out.println(sum);
		
		//1512
		int[] num2= {1,2,3,1,1,3};
		long k = IntStream.of(1)
		.boxed()
		.collect(Collectors.groupingBy(e->e,Collectors.summarizingInt(num ->1)))
		.entrySet()
		.stream()
		.filter(e -> (e.getValue() !=0))
		.filter(e -> (e.getKey() !=0))
		.count();
		
		System.out.println(k);
		
	}
}
