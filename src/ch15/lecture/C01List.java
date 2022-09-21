package ch15.lecture;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01List {
	public static void main(String[] args) {
		
		
		// 컬렉션 리스트 / 셋 / 맵 으로 나뉜다
		// 리스트는 인터페이스 -> Arraylist, vector, LinkedList
		//List : 순서 있음 
		List<String> list1 = new ArrayList<>();
		
		//element(item) 추가
		list1.add("abc"); // 타입을 String으로 정해줬으니 String타입만 넣기 가능
		list1.add("def");
		list1.add("ghi");
		
		//get : elemet(item)얻기
		System.out.println(list1.get(0)); //인덱스 0번쨰 값 출력 abc
		System.out.println(list1.get(1)); //       1             def
		
		//ArrayIndexOutOfBoundsException 주의
		//System.out.println(list1.get(3)); // arraylist 범위에 넘어가는 값에 접근할때 exception 처리됨
		System.out.println(list1.get(list1.size()-1)); //마지막 아이템에 접근
		//List 메소드 사용할떄, list 인터페이스 참고
		
		System.out.println(list1);
		list1.remove(2); //인덱스 2번째 아이템 삭제
		System.out.println(list1); //abc,def 출력

		// ---------- 다양하게 리스트 만드는 방법
		List<String> list2 = Arrays.asList("홍길동","신용권","감자바"); // String 객체 요소로 갖는 arraylist에  배열을 매개값으로 줌
		System.out.println(list2); //홍길동,신용권,감자바
		
		List<Integer> list3 = Arrays.asList(1,2,3); //Integer타입 
		System.out.println(list3); //1,2,3
		
		List<String> list4 = List.of("java","css","spring");
		System.out.println(list4); 
		
		//주의할점 : asList, of 메소드는 추가 불가능.
		// list3은 추가X 변경O list2.add("김철수"); 에러 list2.set(0,"js"); 가능
		// list4는 추가X 변경X
		
		
	}
}
