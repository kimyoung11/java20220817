package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1316_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			String S = br.readLine();
			boolean check[] = new boolean[26]; // 알파벳 사용 내역 앞전에 나왔는지 중복 체크
			boolean tmp = true; // 그룹 단어 인지
			
			for (int j = 0; j < S.length(); j++) {
				int index = S.charAt(j)-'a'; // 맨처음 단어 인덱스 자리 a면 0번
				if(check[index]) { // 이전에 사용한적이 있는 문자라면
					if(S.charAt(j) != S.charAt(j-1)) { // 이전 문자와 연속되지 않는다면
						tmp = false; // 그룹 단어가 아님
						break;
					}
				}else { // 이전에 사용한적이 없는 문자라면
					check[index] = true; // 문자 사용 체크
				}
			}
			if(tmp) cnt++;
		}
		
		System.out.println(cnt);
	}
}
				
				
				
