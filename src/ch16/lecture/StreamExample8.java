package ch16.lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Member2{
	String name;
	String job;
	
	Member2(String name, String job){
		this.name=name;
		this.job=job;
	}
	
	String getName()	{	return name;	}
	String getJob()		{	return job;		}
}

public class StreamExample8 {
	public static void main(String[] args) {
		List<Member2> list = Arrays.asList(
				new Member2("홍길동","개발자"),
				new Member2("김나리","디자이너"),
				new Member2("신용권","개발자")
				);
		
		Map<String, List<String>> groupingMap= list.stream()
				.collect(Collectors.groupingBy(Member2::getJob, Collectors.mapping(Member2::getName, Collectors.toList())));
		
		groupingMap.get("개발자").stream().forEach(s -> System.out.println(s + " "));
		System.out.println();
		groupingMap.get("디자이너").stream().forEach(s ->System.out.println(s + " "));
		
	}
}
