package ch15.lecture;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student2> treeSet = new TreeSet<>((s1,s2)->s1.score - s2.score);
		treeSet.add(new Student2("blue", 96));
		treeSet.add(new Student2("hong", 86));
		treeSet.add(new Student2("white", 92));

		Student2 student = treeSet.last();
		System.out.println("최고점수:" + student.score);
		System.out.println("아이디:" + student.id);
	}
}

class Student2 {
	public String id;
	public int score;

	Student2(String id, int score) {
		this.id = id;
		this.score = score;
	}
}