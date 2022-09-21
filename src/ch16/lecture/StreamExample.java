package ch16.lecture;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExample {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions");
		
		list.stream()
		.filter((e) -> e.contains("java") || e.contains("Java"))
		//.filter((e) -> e.toLowerCase().contains("java"))
		.forEach(a -> System.out.println(a));
		
		
		int r1 = IntStream.of(10,9,20,2,3,-1).sum();
		System.out.println(r1);
		
		int r2 = Arrays.stream(new int[] {10,9,20,2,3,-1}).sum();
		System.out.println(r2);
		
		int r3 = IntStream.range(1, 11).sum();
		System.out.println(r3);
		
		int r4 = IntStream.rangeClosed(1, 10).sum();
		System.out.println(r4);
		
		
		
	}
}
