package ch15.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student{
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(student.studentNum == this.studentNum)
				return true;
		}
		
		return false;
	}
}

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1,"홍길동"));
		set.add(new Student(2,"신용권"));
		set.add(new Student(1,"조민우"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}
}
