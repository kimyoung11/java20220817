package ch16.lecture;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Mem{
	private String name;
	private String job;
	
	
	public Mem(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String getName() {	return name;	}
	public String getJob() {	return job;	}
}

public class StreamExample7 {
	public static void main(String[] args) {
		List<Mem> list = Arrays.asList(
				new Mem("홍길동","개발자"),
				new Mem("김나리","디자이너"),
				new Mem("신용권","개발자"));
		
		List<Mem> developers = list.stream().filter((e) -> e.getJob().equals("개발자")).collect(Collectors.toList());
		developers.stream().forEach(m -> System.out.println(m.getName()));
	}
}
