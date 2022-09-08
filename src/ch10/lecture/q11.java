package ch10.lecture;



public class q11 {
	public static void main(String[] args) {


		String skill ="CBD";
		String[] skill_trees= {"BCD","CBD","CB","BD"};
		int cnt= 0;
		for(int i=0;i<skill_trees.length;i++) {
			System.out.println(skill.contains(skill_trees[i]));
		}
		boolean flag = false;
		for(int i=0;i<skill_trees.length;i++) {
			if(skill.contains(skill_trees[i])) {
				flag=false;
				System.out.println("스킬트리요" + skill_trees[i]);
				int length = skill_trees[i].length();
				flag = true;
				System.out.println(length);
				for(int j=0;j<length;j++) {
					if(skill.charAt(j) != skill_trees[i].charAt(j)) {
						flag = false;
						break;
					}	
				}
			}
			if(flag) cnt++;
		}
		System.out.println(cnt);
	}
}
