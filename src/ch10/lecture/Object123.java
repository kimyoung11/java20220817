package ch10.lecture;

public class Object123 {
	public static void main(String[] args) {
		
		
		
		Object o1 = 3;
		Object o2 = 3.14;
		Object o3 = true;
		Object[] o5 = {"hello",true,1};
				
		
		System.out.println(o1.getClass());
		System.out.println(o2.getClass());
		System.out.println(o3.getClass()); //타입변환 다됐네
		System.out.println(o5[0]);
		System.out.println(o5[1]);
		System.out.println(o5[2]);
		
	}
}
