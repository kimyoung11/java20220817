package ch01.lecture;

import java.util.ArrayList;
import java.util.Arrays;

public class newArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		System.out.println(al.remove(2));
		al.remove(2);
		System.out.println(al);
	}

}
