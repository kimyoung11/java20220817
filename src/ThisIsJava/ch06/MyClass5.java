package ThisIsJava.ch06;

import java.util.function.IntConsumer;

public class MyClass5 {
	public static void main(String[] args) {
		IntConsumer o1 = v -> System.out.println(v*v);
		
		//IntConsumer o1 = new IntConsumer();
		o1.accept(3);
		o1.accept(4);
		o1.accept(10);
		
		
	}
}

//class IntConsumer{
//	void accept(int n) {
//		System.out.println(n*n);
//	}
//}