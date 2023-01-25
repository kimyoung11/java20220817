package programmers;

import java.util.Arrays;

public class p_전화번호목록 {
	public static void main(String[] args) {
		String[] phone_book = {"123","456","789"};
		boolean answer = true;
		
		Arrays.sort(phone_book);
		for(int i=0;i<phone_book.length;i++) {
			for(int j=i+1;j<phone_book.length;j++) {
				if(phone_book[j].contains(phone_book[i])) {
					answer = false;
				}
			}
		}

		System.out.println(answer);
	}
}
