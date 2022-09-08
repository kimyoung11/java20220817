package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class p6 {
	public static void main(String[] args) {
		
		String[] phone_book1 = {"119", "97674223", "1195524421"};
		String[] phone_book3= {"123","456","789"};
		String[] phone_book2 = {"12","123","1235","567","88"};
		boolean answer=true; 
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<phone_book1.length;i++) {
			hs.add(phone_book1[i]);
		}
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			
		}
	}
}
