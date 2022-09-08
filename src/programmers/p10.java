package programmers;

import java.util.ArrayList;

public class p10 {
	public static void main(String[] args) {

		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" }; // al.size
		String skill = "CBD";
		ArrayList<String> al = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		int answer = 0;

		for (int i = 0; i < skill_trees.length; i++) {
			for (int j = 0; j < skill_trees[i].length(); j++) {
				if (skill_trees[i].charAt(j) == 'C' || skill_trees[i].charAt(j) == 'B'
						|| skill_trees[i].charAt(j) == 'D') {
					sb.append(skill_trees[i].charAt(j));
				}
			}
			al.add(sb.toString());
			sb.setLength(0);
		}
		
		for(int i=0;i<al.size();i++) {
			for(int j=0;j<al.get(i).length();j++) {
				if(skill.indexOf(al.get(i))==0) {
					flag=true;
				}
			}
			if(flag) answer++;
		}
		System.out.println(answer);
	}
}
