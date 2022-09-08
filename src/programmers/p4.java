package programmers;

public class p4 {
	public static void main(String[] args) {
		
		int n = 15; //완전탐색 아이디어 ㄱ
		int answer = 0;
		
		for(int i=1;i<=n;i++) {
			int sum = 0;
			for(int j=i;j<=n;j++) {
				sum = sum + j;
				if(sum == n) {
					System.out.println("같아요~");
					answer++;
					break;
				}else if(sum > n) {
					break;
				}
			}
		}
		
		System.out.println(answer);
	}
}
