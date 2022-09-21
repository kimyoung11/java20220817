package programmers;


import java.io.IOException;
import java.util.Scanner;

public class q2941 {
	public static void main(String[] args) throws IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		int cnt = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//			
//		}
		Scanner sc = new Scanner(System.in);
		String []str = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		String st = sc.nextLine();
		for(int i=0;i<str.length;i++) {
			if(st.contains(str[i])) {
				st=st.replace(str[i],"!");
			}
		}
		System.out.println(st);
		System.out.println(st.length());

	}
}
