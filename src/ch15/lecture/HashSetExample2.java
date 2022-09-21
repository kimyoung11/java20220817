package ch15.lecture;

import java.util.HashSet;
import java.util.Set;

class Member{
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}


public class HashSetExample2 {
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));
		System.out.println(set.size());
	}
}
