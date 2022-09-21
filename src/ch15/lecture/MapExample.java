package ch15.lecture;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			totalScore += entry.getValue();
			maxScore = Math.max(maxScore, entry.getValue());
//			if(entry.getValue()> maxScore) {
//				maxScore = entry.getValue();
//				name = entry.getKey();
//			}
		} 
			for (String key : map.keySet()) {
				if (map.get(key) == maxScore) {
					name = key;
					break;
				}
			}

			// 풀이법1 : Math.max를 사용하려면 keySet을 돌면서 최댓값 key를 따로 뽑아줘야됨
			// 풀이법2 : 그냥 entry의 value값만 비교하면서 제일 큰놈을 key랑 value한번에 뽑아줌.

			System.out.println("평균점수:" + totalScore / map.size());
			System.out.println("최고점수:" + maxScore);
			System.out.println("아이디:" + name);

		}
	}

