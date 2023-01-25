package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class p_스킬트리 {
	public static void main(String[] args) {
		String skill= "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		String temp;
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		List<String[]> list = new ArrayList<>();
		for(int i=0;i<skill_trees.length;i++) {
			for(int j=0;j<skill_trees[i].length();j++) { //
				if(skill_trees[i].charAt(j)!='C' &&
				   skill_trees[i].charAt(j)!='B' &&
				   skill_trees[i].charAt(j)!='D') {
					skill_trees[i] = skill_trees[i].replace(skill_trees[i].charAt(j),' ').trim().replace(" ","");
				}
			}
		}

	}
	
}
