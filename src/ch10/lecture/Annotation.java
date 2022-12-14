package ch10.lecture;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface PrintAnnotation{
	String value() default "-";
	int number() default 15;
	char ch() default 'b';
}

class AnnotationEx{
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value="#", number=20 , ch='a')
	public void method3() {
		System.out.println("실행 내용3");
	}
}

public class Annotation {
	public static void main(String[] args) {
		Method[] declaredMethods = AnnotationEx.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				System.out.println(method.getName());
				for(int i=0;i<printAnnotation.number();i++) {
					System.out.print(printAnnotation.value());
				}

			}
		}
		
	}
}
