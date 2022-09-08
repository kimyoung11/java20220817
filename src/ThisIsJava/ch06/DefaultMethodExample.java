package ThisIsJava.ch06;

interface MyInterface{
	public void method1();
	public default void method2() {
		System.out.println("인터페이스 메소드2 실행");
	}
}

class MyClassA implements MyInterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("classA 메소드 실행");
	}	
}

class MyClassB implements MyInterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("classB 메소드 실행");
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		MyInterface.super.method2();
		System.out.println("몰라~~~~");
	}
	
}
public class DefaultMethodExample {
	public static void main(String[] args) {
		
		MyInterface m1 = new MyClassA();
		m1.method1();
		m1.method2();
		
		MyInterface m2 = new MyClassB();
		m2.method1();
		m2.method2();
	}
}
