package programmers;

import java.util.ArrayList;



public class Queue2 {
	public static void main(String[] args) {
		String skill = "CBD";
		int answer = 0;
		String[] skill_trees ={"BACDE", "CBADF", "AECB", "BDA"};
		ArrayList<String> al= new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<skill_trees.length;i++) {
			for(int j=0;j<skill_trees[i].length();j++) {
				if(skill_trees[i].charAt(j)=='C'|| skill_trees[i].charAt(j)=='B'||skill_trees[i].charAt(j)=='D') {
					sb.append(skill_trees[i].charAt(j));
				}
			}
			al.add(sb.toString());
			sb.setLength(0);	
	}
		System.out.println(al);
		System.out.println(skill.getClass());
		for(int i=0;i<al.size();i++) {
			if(skill.indexOf(al.get(i))==0) {
				answer++;
			}
		}
		System.out.println(answer);
}
}
