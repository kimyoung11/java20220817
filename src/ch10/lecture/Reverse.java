package ch10.lecture;



public class Reverse {
	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
//		for(int i=0;i<s.length/2;i++) {
//			char temp = s[i];
//			s[i] = s[s.length-i-1];
//			s[s.length-i-1]=temp;
//		}
//		System.out.println(s);
		
		int left=0; //0
		int right = s.length-1; //4
		
		while(left <= right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}
		System.out.println(s);
		// length가 짝수일때  
		// length가 홀수일때
	}
}
