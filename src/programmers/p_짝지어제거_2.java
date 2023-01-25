package programmers;

import java.util.ArrayList;

public class p_짝지어제거_2 {
	public static void main(String[] args) {
		
		String s ="baabaa";
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<s.length();i++)
			list.add(s.charAt(i));
		
		int i=0;
		while( i < list.size() -1) {
			if(list.get(i) == list.get(i+1)) {
				list.remove(i);
				list.remove(i);
				i=0;
				continue;
			}
			i++;
		}
		if(list.size() ==0)
			System.out.println(1);
		else
			System.out.println(0);
	}
}
