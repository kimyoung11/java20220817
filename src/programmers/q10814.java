package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person{
	int age;
	String name;
	
	public Person(int age, String name) {
		this.age =age;
		this.name =name;
	}
	@Override
	public String toString() {
		return age + " " + name + "\n";
	}
}


public class q10814 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Person[] p = new Person[n];
		
		for(int i=0;i<n;i++) {
			p[i] = new Person(sc.nextInt(),sc.next());
		}
		
		Arrays.sort(p,new Comparator<Person>() {

			@Override
			public int compare(Person s1, Person s2) {
				return s1.age - s2.age;
			}
		});
		
	}
}
