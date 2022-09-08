package ch10.lecture;

public class IndexOutOfBoundsException {
	public static void main(String[] args) {
//		String data1 = args[0];
//		String data2 = args[1];
//		
//		System.out.println(data1);
//		System.out.println(data2);
//		int a = 3;
//		int b = 0;
//		
//		try {
//			int c = a / b;
//			System.out.println("실행됨");
//			System.out.println(c);
//		}finally {
//			System.out.println("여긴 무조건 출력");
//		}
//		System.out.println("모름");
		
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값 수가 부족");
			System.out.println("실행 방법");
			return ;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);		
		}catch (Throwable e) {//상위 타입 에러 먼저 X ex) arithmetic exception 등등
			System.out.println("숫자로 변경 불가");
		}finally {
			System.out.println("다시 실행하세요");
		}
	}
}
