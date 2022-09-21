package programmers;

import java.util.HashSet;
import java.util.Set;

public class leetcode1684 {
	public static void main(String[] args) {
		String allowed = "cad";
		String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
		int cnt=0;
		Set<Character> set = new HashSet<>();
		for(int i=0;i<allowed.length();i++) {
			set.add(allowed.charAt(i)); //a,b,c
		}
		for(int i=0;i<words.length;i++) {
			boolean flag = true;
			for(int j=0;j<words[i].length();j++) {
				if(!set.contains(words[i].charAt(j))) {
					flag = false;
				}
			}
			if(flag) cnt++;
		}
		System.out.println(cnt);
	}
}
