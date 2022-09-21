package ch13.lecture;

import java.util.ArrayList;

public class wildcard {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Number> list2 = new ArrayList<>();
		ArrayList<Object> list3 = new ArrayList<>();
		
//		setItems(list1);
//		setItems(list2);
		setItems(list3);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
	}
	public static void setItems(ArrayList<? super Object> list) {
		list.add(100);
		list.add(200);
		list.add(300);
//		list.add(3.14);
		
	}
}
