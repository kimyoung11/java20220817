package ThisIsJava.ch06;


class SubClass1 extends SuperClass1{
	
}

class SubClass2 extends SuperClass1{
	
}

class SuperClass1{
	
}

class SuperClass3{
	
}

public class Polymorphism {
	public static void main(String[] args) {
		
		SubClass1 o1 = new SubClass1();
		SuperClass1 o2 = new SubClass1();
		SuperClass1 o3 = new SubClass2();
		SuperClass1 o4 = o1; // 자동형변환.
		
		SuperClass1 o5 = new SuperClass1();
		SubClass1 o6 = new SuperClass1();
		SubClass1 o7 = new SuperClass1();
		
		SubClass1 o8 = o4;
		SuperClass3 o9 = new SuperClass3();
		
		
	}
}
