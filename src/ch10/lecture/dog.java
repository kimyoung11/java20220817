package ch10.lecture;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

@interface MyAnnotation{
	int num() default 0;
}
public class dog {
	public static void main(String[] args) throws ClassNotFoundException {
		
		String[] arr1 = {"aaa","bbb","ccc","aaa","aaa","ccc"};
		Map<String, Integer> map = new HashMap<>();
		for(String a: arr1)	map.put(a, map.getOrDefault(a,0)+1);
		System.out.println(map);
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>(); //LinkedHashset-> 순서O
		set.add(1);
		set.add(7);
		set.add(5);
		set.add(3);
		System.out.println(set);
		
		Class c;
		String s1 = "java";
		
		Class c1 = s1.getClass();
		System.out.println(c1.getName());
		
		Class c2 = Class.forName("java.lang.String");
		System.out.println(c2.getName());
		
		Class c3 = String.class;
		System.out.println(c3.getName());
		
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
		
		Class c4 = String.class;
		System.out.println(c4.getFields());
		
		//어노테이션 쓰는법? 숙지
		

	}
}
