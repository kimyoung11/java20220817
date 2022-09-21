package programmers;

import java.util.ArrayList;
import java.util.List;

public class leet118 {
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		int numRows = 3;
		
		list.add(firstRow);
		System.out.println(list.size());
		for(int i=1;i<numRows;i++) {
			List<Integer> next = new ArrayList<>();
			List<Integer> current = list.get(list.size()-1);
			next.add(1);

			for(int j=1;j<current.size();j++) {
				next.add(current.get(j) + current.get(j-1));
			}
			
			next.add(1);
			list.add(next);
		}
		System.out.println(list);
	}
}
