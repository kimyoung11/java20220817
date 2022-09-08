package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class knumber {
	public static void main(String[] args) {
		
		int n = 17;
		int k = 10;
		ArrayList<Integer> temp;
		temp = ntok(n,k);
		System.out.println(temp);
		int cnt = 0;
		long cur = 0;
		for(Integer item : temp) {
				//211020101011
			// 마지막 처리 어떻게?
			if(item ==0) {
				cnt = cnt+ isPrime(cur);
				cur = 0;
				continue;
			}
			cur = 10 * cur + item;
			System.out.println(cnt);
		}
		cnt+= isPrime(cur);
		System.out.println(cnt);
	}
	static ArrayList<Integer> ntok(int n, int k) {

		int temp =0;
		ArrayList<Integer> al = new ArrayList<>();
		
		while(n>0) {
			temp =n%k; 
			n= n/k;
			al.add(temp);
		}
		Collections.reverse(al);
		
		return al; //211020101011
	}
	static int isPrime(long n) { //211 2 1 1 11
		// n = 211;
		if(n <=1)
			return 0;
		for(long i=2;i*i <=n;i++) {
			if(n % i ==0)
				return 0;
		}
		return 1;
	}
}
