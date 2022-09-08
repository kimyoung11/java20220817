package programmers;

public class p1 {
	public static void main(String[] args) {
		String answer ="";
		int n =13;
		String[] numbers = {"4","1","2"};
		
		
		while(n >0) {
			int temp = n % 3; //temp=0; temp=1; temp=1
			n=n/3; // n = 4; n = 1;  n=0;
			
			answer = numbers[temp] + answer; // answer 4; answer 24
			
			
			if(temp ==0) {
				n=n-1;
			}
			if(n==0) 
				break;			
		}
		System.out.println(answer);
	}
}
