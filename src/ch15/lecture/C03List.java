package ch15.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class C03List {
	public static void main(String[] args) {
		//List 특징 : 순서가 있다.
		
		List<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		list1.add("java");
		list1.add(null);
		System.out.println(list1);
		
		List<String> list2 = new Vector<>();
		list2.add("java");
		list2.add("css");
		System.out.println(list2);
	}
}
