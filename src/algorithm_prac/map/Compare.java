package algorithm_prac.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Obj{
	String s;
	int n;
	Obj(String s, int n){
		this.s = s;
		this.n = n;
	}
}


public class Compare {
	public static void main(String[] args) {
		
		ArrayList<Obj> list = new ArrayList<>();
		
		list.add(new Obj("B",3));
		list.add(new Obj("E",5));
		list.add(new Obj("G",1));
		list.add(new Obj("A",8));
		list.add(new Obj("D",10));
		
		Collections.sort(list, new Comparator<Obj>() {

			@Override
			public int compare(Obj o1, Obj o2) {
				return Integer.compare(o1.n, o2.n);
			}
		});
		
		for(Obj o : list)
			System.out.println(o.s + " " + o.n);
	}
}
