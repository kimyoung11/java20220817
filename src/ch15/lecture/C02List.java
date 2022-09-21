package ch15.lecture;


import java.util.Iterator;
import java.util.List;

public class C02List {
	public static void main(String[] args) {
		
		// 리스트 아이템 탐색 방법
		List<String> list1 = List.of("abc","def","ghi","jkl");
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));//그냥 출력
		System.out.println("-------------------");
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i)); //반복문
		}
		
		System.out.println("--------------------");
		for(String item: list1)
			System.out.println(item); //향상된 for문
		
		
		System.out.println("--------------------");
		list1.forEach(item->System.out.println(item)); //foreach문 -> 람다식 사용
		
		System.out.println("--------------------");
		Iterator it = list1.iterator(); //iterator
		while(it.hasNext())// 다음 객체가 있는지 있으면 true리턴, 없으면 false 리턴 있을때까지
			System.out.println(it.next()); //다음 객체 리턴  
		
		

	}
}
