package ThisIsJava.ch06;


class Parent{
	
}

class Child extends Parent{
	
}

public class InstanceofExample {
	static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 -child로 변환 성공");
		}else {
			System.out.println("method1 - child로 변환X");
		}
	}
	static void method2(Parent parent) {
		System.out.println("method2 변환 성공");
	}
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
}
