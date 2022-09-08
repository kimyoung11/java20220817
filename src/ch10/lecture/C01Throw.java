package ch10.lecture;

import javax.management.RuntimeErrorException;

public class C01Throw {
	public static void main(String[] args) {
		
		// 내가 예외를발생시키고 싶을때
		method1();
		
	}
	private static void method1() {
		System.out.println("메소드 1 코드");
		try {
			method2();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("메소드 1 실행 이어감");
	}
	private static void method2() throws Exception{
		throw new Exception("어떤 이유로 발생했는지");
	}
}

