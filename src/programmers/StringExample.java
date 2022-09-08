package programmers;

public class StringExample {
	public static void main(String[] args) {
		
		String skill = "CBD";
		String skill_trees = "CBD";
		int answer = 0;
		
		
		for(int i=0;i<skill_trees.length();i++) {
			String t = String.valueOf(skill_trees.charAt(i));
			if(!skill.contains(t)) {
				skill_trees = skill_trees.replace(t, "");
			}
		}
		System.out.println(skill_trees);
		if(skill.indexOf(skill_trees) ==0) {
			answer+=1;
		}
		System.out.println(answer);
	}
}
