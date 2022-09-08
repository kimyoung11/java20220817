package ThisIsJava.ch06;

public class MyClass2 {
	public static void main(String[] args) {
		class LocalClass implements MyInterface22{

			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("HELLO WORLD@@@");
			}
			
		}
		
		MyInterface22 local = new LocalClass();
		local.method();
		
		
		
		MyInterface33 l = new MyInterface33() {
			
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("몰라#!@#!@#");
			}
		};
		l.method();
	}
}

interface MyInterface22{
	void method();
}

interface MyInterface33{
	void method();
}