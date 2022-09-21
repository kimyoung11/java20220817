package ch16.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C09Parallel {
	public static void main(String[] args) {
		
		List<String> list = List.of("java","spring","css","jsp","html");
		list.parallelStream().forEach((e) -> System.out.println(e));
		System.out.println("=================");
		list.parallelStream().forEachOrdered((e) -> System.out.println(e));
		System.out.println("================="); // 병렬이 열배정도 빠른듯
		
		//collect 메소드 : 종료 연산
		//스트림에 있는 원소들을 지정된 컨테이너에 수집
		//1. 원소가 들어갈 컨테이너
		//2. 컨테이너에 원소 넣는일
		//3. 여러 컨테이너 병합
		//a인자 - 담을 객체, 
		
		
		List<Integer> list1 = IntStream.range(1, 100)
				.filter(e -> e % 2 ==0)
				.collect(() -> new ArrayList<>(), (c,e) -> c.add(e) , (r1,r2) -> r1.addAll(r2));
		
		System.out.println(list1);
		
		List<Integer> list2 = IntStream.range(1, 100)
				.boxed()
				.filter(e -> e%2 ==0)
				.collect(Collectors.toList());
		
		System.out.println(list2);
		
	}
}
