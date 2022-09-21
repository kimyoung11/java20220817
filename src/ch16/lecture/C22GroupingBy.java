package ch16.lecture;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C22GroupingBy {
	public static void main(String[] args) {
		
		Map<String, List<Integer>> map = Stream.of(3,4,5,6,7,8,9,10)
				.collect(Collectors.groupingBy((e) -> e%2 ==0 ? "짝수" : "홀수"));
		
		System.out.println(map);
		
		
		
	}
}
