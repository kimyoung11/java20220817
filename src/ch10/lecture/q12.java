package ch10.lecture;


import java.util.HashMap;
import java.util.Scanner;

public class q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer,Integer> hm = new HashMap<>(); // key, value 쌍으로 구조 설정
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int temp = sc.nextInt();
			hm.put(temp, hm.getOrDefault(temp, 0)+1); // key에 맞는 value집어넣는데 
		} //null이면 새로 만들어서 집어넣어주고 0이면 1더해줌
		//getOrDefault 기억좀
		StringBuilder sb = new StringBuilder(); 
		int b = sc.nextInt();
		for(int i=0;i<b;i++) { //입력 길이만큼
			int temp2 = sc.nextInt();
			if(hm.get(temp2) ==null) sb.append(0).append(" "); //키 없으면 0 집어 넣고
			else sb.append(hm.get(temp2)).append(" "); //키 있으면 그 키에 맞는 value들고옴
		}
		System.out.println(sb);
	}
}
