package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class p_영어끝말잇기 {
	public static void main(String[] args) {
		
		
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		//String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", 
				//"ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};

		int[] answer = new int[2];
		ArrayList<String> list = new ArrayList<>();
		boolean flag = true;
		
		
		for(int i=0;i<words.length;i++) {
			flag = false;
			if(list.contains(words[i])){
				answer[0] = (i%n) +1;
				answer[1] = (i/n) +1;
				flag = false;
				break;
			}
			list.add(words[i]);
			
			if(i>0 && words[i-1].charAt(words[i-1].length()-1)!= words[i].charAt(0)) {
				answer[0] = (i%n) + 1;
				answer[1] = (i/n) + 1;
				flag = false;
				break;
			}
			
			if(flag) {
				answer[0] = 0;
				answer[1] = 0;
			}
		}

		
		System.out.println(Arrays.toString(answer));
	}
}
