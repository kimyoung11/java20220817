package programmers;

import java.util.HashSet;
import java.util.Set;

public class leetcode771 {
	public static void main(String[] args) {
		
		String jewels = "aA";
		String stones = "aAAbbbb";
		int cnt =0;
//		Set<Character> set = new HashSet<>();
//		
//		for(int i=0;i<jewels.length();i++)
//			set.add(jewels.charAt(i)); //aA 들어갔죠
//		
//		for(int i=0;i<stones.length();i++) {
//			for(int j=0;j<set.size();j++) {
//				if(set.contains(stones.charAt(i))){
//					cnt++;
//					break;
//				}
//			}
//		}

		boolean arr1[] = new boolean[26]; //소문자
		boolean arr2[] = new boolean[26]; //대문자
		for(int i=0;i<jewels.length();i++) {
			if(jewels.charAt(i)>='a' && jewels.charAt(i)<='z')
				arr1[jewels.charAt(i)-'a']=true;
			if(jewels.charAt(i)>='A' && jewels.charAt(i)<='Z')
				arr2[jewels.charAt(i)-'A']=true;
		}
		for(int i=0;i<stones.length();i++) {
			if((stones.charAt(i)>='a' && stones.charAt(i)<='z')&&(arr1[stones.charAt(i)-'a'])) {
				cnt++;
			}
			if((stones.charAt(i)>='A' && stones.charAt(i)<='Z')&&(arr2[stones.charAt(i)-'A'])) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
