package programmers;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class q5635 {
	static class Member implements Comparable<Member>{
		String name;
		int dd;
		int mm;
		int yy;
		Member(String name,int dd,int mm,int yy){
			this.name = name;
			this.dd=dd;
			this.mm=mm;
			this.yy=yy;
		}
		@Override
		public int compareTo(Member o) {
			if(o.yy == yy) {
				if(o.mm == mm) {
					return o.dd -dd;
				}
				return o.mm - mm;
				
			}
			return o.yy - yy;
		}
		@Override
		public String toString() {
			return "Member [name=" + name + ", dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]" +"\n";
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		List<Member> list=new ArrayList<>();
		sc.nextLine();
		for(int i=0;i<a;i++) {
			String str = sc.nextLine();
			String[] temp = str.split(" ");
//			new Member()
			list.add(new Member(temp[0],Integer.parseInt(temp[1]),Integer.parseInt(temp[2]),Integer.parseInt(temp[3])));
		}
//		new Member("Kim",1,1,1);
//		new Member("Lee",2,2,2);
		Collections.sort(list);
		System.out.println(list.get(0).name);
		System.out.println(list.get(a-1).name);
	}

}

