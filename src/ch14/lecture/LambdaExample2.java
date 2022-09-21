package ch14.lecture;

import java.util.function.ToIntFunction;

public class LambdaExample2 {
	private static Student[] students = {
		new Student("홍길동",90,96),
		new Student("신용권",95,93)
	};
	
	public static double avg(ToIntFunction<Student> student) {
		double sum = 0;
		for(int i=0;i<students.length;i++) {
			sum += student.applyAsInt(students[i]);
		}
		return sum / students.length;
	}

	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어 점수" + englishAvg);
		double mathAvg = avg( s -> s.getMathScore());
		System.out.println("수학 점수" + mathAvg);
		
	}
	public static class Student{
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		public String getName() {	return name;	}
		public int getEnglishScore() {	return englishScore;	}
		public int getMathScore() {	return mathScore; 	}
	}
	
}
