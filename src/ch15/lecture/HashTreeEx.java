package ch15.lecture;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashTreeEx {
	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<>();
		TreeSet<Integer> ts = new TreeSet<>();
		SortedSet<Integer> ss = new TreeSet<>();
		
		hs.add("100");
		hs.add("200");
		hs.add("3");
		hs.add("99");
		hs.add("1");
		
		ts.add(200);
		ts.add(100);
		ts.add(3);
		ts.add(99);
		ts.add(1); 
		
		ss.add(300);
		ss.add(100);
		ss.add(99);
		ss.add(10000);
		ss.add(-1);
		
		System.out.println(ss.first());
		System.out.println("1:"+ss.last());
		System.out.println("2:"+ss.headSet(100));
		System.out.println("3:"+ss.tailSet(85));
	}
}
