package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class p_가장큰수 {
	
	
	//b가 a보다 큰수면 compareTo 했을때 양수나옴
	
	//comparable -> 자기 자신과 매개변수 객체를 비교
	
	//comparator -> 매개변수 객체를 비교
	
	//Arrays.sort / Collections.sort -> 정렬메소드 추가 인자로 넘기면
	
	//새로운 정렬 기준으로 객체 정렬 가능 comparable의 compareTo 
	public static void main(String[] args) {
		
		int[] numbers = {6,10,2};
		int[] numbers2 = {3,30,34,5,9};
		String[] arr = new String[numbers.length];
		String answer ="";
		
		for(int i=0;i<numbers.length;i++) {
			//arr[i] = numbers.toString();
			arr[i] = String.valueOf(numbers[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	
		Arrays.sort(arr,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2); 
				//6,10 -> (106)compareTo(610)			
			}
		});

		
		for(String s : arr)
			answer += s;
		
		System.out.println(answer);
		
	}
}
