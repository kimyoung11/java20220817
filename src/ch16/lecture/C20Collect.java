package ch16.lecture;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C20Collect {
	public static void main(String[] args) {
		
		String res = IntStream.of(9,7,1,0)
				.boxed()
				.map(Object::toString)
				.collect(Collectors.joining(", ")); // 적절한 collector 넣어서
		
		System.out.println(res); // 9,7,1,0 출력
		
//		String res2 = IntStream.of(1,2,3,4)
//				.boxed()
//				.map(Object::toString)
//				.collect(Collectors.joining(", "));

		String res2 = IntStream.of(1,2,3,4)
				.boxed()
				.map(Object::toString)
				.collect(Collectors.joining(", "));
		
		System.out.println(res2);
		
		String res4 = IntStream.of(1,2,3,4)
				.boxed()
				.map(Object::toString)
				.collect(Collectors.joining(", "));
		
		//
		String res3 = IntStream.of(9, 7, 1, 0)
				.boxed()
				.map(String::valueOf)
				.collect(Collectors.joining(", ")); // 적절한 Collector를 넣어서
	}
}

