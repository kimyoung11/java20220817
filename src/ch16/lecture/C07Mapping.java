package ch16.lecture;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C07Mapping {
	public static void main(String[] args) {
		
		int sum = 
		Stream.of("3","6","9","1").map((s) -> Integer.valueOf(s)).reduce((a,b) -> a+b).get();
		System.out.println(sum);
		
		int sum2=
		Stream.of("3house","2water","1cup","7pc","9cpu").map((s) ->Integer.valueOf(s.substring(0,1))).reduce((a,b) ->a+b).get();
		System.out.println(sum2);
		
		int sum3=
		Stream.of("3house","2water","1cup","7pc","9cpu").mapToInt((s) -> Integer.parseInt(s.substring(0,1))).sum();
		System.out.println(sum3);
		
		IntStream.of(3,5,9,1,0)
		.boxed()
		.sorted((a,b) -> b-a)
		.forEach((e) -> System.out.println(e));
		
		//9,5,3,1,0 나오도록 출력 String res에 저장
		String res = IntStream.of(3,5,9,1,0).boxed().sorted((a,b) -> b-a).map(e -> e+ "").reduce((s1,s2)-> s1+ ", " +s2).get();
		System.out.println(res);
	}
}
