package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class p_베스트앨범 {
	public static void main(String[] args) {

		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };

		Map<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < genres.length; i++)
			hm.put(genres[i], hm.getOrDefault(genres[i], 0) + plays[i]);

		for (Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		ArrayList<String> genre = new ArrayList<>();
		for (String key : hm.keySet())
			genre.add(key);
		System.out.println(genre);
		Collections.sort(genre, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return hm.get(o2) - hm.get(o1);
			}
		});
		System.out.println("this is genre" + genre);

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < genre.size(); i++) {// 2 g = pop 일떄, g = classic 일떄
			String g = genre.get(i); // pop
			int max = 0;
			int firstIdx = -1;
			for (int j = 0; j < genres.length; j++) { // 5
				if (g.equals(genres[j]) && max < plays[j]) {
					max = plays[j];
					firstIdx = j;
				}
			}
			System.out.println("firstIdx" + firstIdx);

			max = 0;
			int secondIdx = -1;
			for (int j = 0; j < genres.length; j++) {
				if (g.equals(genres[j]) && max < plays[j] && j != firstIdx) {
					max = plays[j];
					secondIdx = j;
				}
			}
			System.out.println("secondIdx" + secondIdx);
			list.add(firstIdx);
			if (secondIdx >= 0)
				list.add(secondIdx);
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			answer[i] = list.get(i);

		System.out.println(Arrays.toString(answer));
	}
}
