package programmers;

import java.util.ArrayList;

public class leet119 {
	public static void main(String[] args) {
		
		int rowIndex = 3;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1); //list = [1]
		
		
		for(int i=0;i<rowIndex;i++) {
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(1); //temp = [1]
			for(int j=1;j<list.size();j++) { //temp.size = 1;
				temp.add(j, list.get(j-1)+list.get(j)); //
			}
			temp.add(1); //temp= [1,1]
			list = temp; // list =[1,1];
		}
		System.out.println("맨처음:" + list);
		

		
	}
}
