package ThisIsJava.ch06;

public class regexEx {
	public static void main(String[] args) {
		
		String num = "^[0-9]*$";
		
		System.out.println("1231231231".matches(num));
		
		String alp = "^[a-zA-Z0-9]*$";
		System.out.println("asdfasdfm123".matches(alp));
		
		String all = "^[a-zA-Z0-9.]*$";
		System.out.println("sdifo_123m".matches(all));
		
		String al = "^[\\w]*$";
		System.out.println("sadfasdfm1_12".matches(al));
		
		String al2 = ".*";
		System.out.println("sdoifjsd".matches(al2));
		
		String p = ".";
		System.out.println("a".matches(p));
		
		String kor = "^[가-힣]*$";
		System.out.println("안녕".matches(kor));
		
		String email = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		System.out.println("myName@naver.com".matches(email));
	}
}
