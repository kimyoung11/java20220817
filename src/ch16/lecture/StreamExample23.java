package ch16.lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

class Member {
	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class StreamExample23 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동",30),
				new Member("신용권",40),
				new Member("감자바",26));	
		
		double avg = list.stream().mapToDouble((member) -> member.getAge()).sum();
		avg = avg / list.size();
		System.out.println("평균나이" + avg);
		
//		OptionalDouble avg = list.stream().mapToDouble((member) -> member.getAge()).average();
//		double avg2 = avg.getAsDouble();
//		System.out.println("평균나이" + avg2);
	}
}
