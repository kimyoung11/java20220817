package programmers;

import java.util.Scanner;

public class q14916 { //dp 풀이법 연구해봅시다..~~~
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int two = 2; //7
		int five = 5;//2
		int p=0;
		int q=0;
		boolean flag =true;

		for (int i = a / two; i >= 0; i--) {
			for (int j = a / five; j >= 0; j--) {
				if (flag){
					if((i * two + j * five) == a) {
						p=i;
						q=j;
						break;
						//flag=false;
					}
				}else {
					flag = false;
				}
			}
			if(!flag) {
				System.out.println(-1);
			}
		}
		if(p+q ==0) {
			System.out.println(-1);
		}else
			System.out.println(p+q);

	}
}
