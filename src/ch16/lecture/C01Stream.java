package ch16.lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class C01Stream {
	public static void main(String[] args) {
		
		List<String> list = List.of("java","css","spring","js","html");
		Stream<String> stream1 = list.stream();

		Set<String> set = Set.of("ironman","hangman","batman","superman","iceman");
		Stream<String> stream2 = set.stream();
		
		String[] arr = {"rm","jimin","v","jungkuk"};
		Stream<String> stream3 = Arrays.stream(arr);
	
		Stream<String> stream4 = Stream.of("captain","widow","panther");
		//stream 만드는 방법
		//안에있는 element 들이 객체다
		
		//끝날때 하는 연산 TerminalOperation
		//Stream 연산 1.중간 연산 	2.종료 연산
		
		//구분법 : 중간연산은 리턴 타입이 stream, 최종연산은 리턴 타입이 stream아님
		Stream<String> stream5 = List.of("java","css","spring","html","jsp").stream();
		
		Optional<String> option1 = stream5.findAny();
		System.out.println(option1.orElse("없어요"));
		
		Stream<String> stream6 = List.of("java","css","spring","html","jsp").stream();
		
		Optional<String> option2 = stream6.findFirst();
		System.out.println(option2.orElse("없다"));
		
		Stream<String> stream7 = List.of("java","css","spring","html","jsp").stream();
		Optional<String> option3 = stream7.max((a,b)-> a.compareTo(b));
		
		Integer r4 = Stream.of(3,4,5,6,7)
				.filter((e)-> e%2!=0)
				.reduce((x, y)-> x+y)
				.get();
		System.out.println(r4);
				
	}
}
