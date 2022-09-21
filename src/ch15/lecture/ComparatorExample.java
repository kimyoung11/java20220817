package ch15.lecture;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample{
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>((a,b)-> a.price - b.price);
		treeSet.add(new Fruit("포도",3000));
		treeSet.add(new Fruit("수박",10000));
		treeSet.add(new Fruit("딸기",6000));
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name +":" + fruit.price);
		}
		
		TreeSet<Fruit> tree = new TreeSet<Fruit>(new DescendingComparator());
		tree.add(new Fruit("포도",3000));                                   
		tree.add(new Fruit("수박",10000));
		tree.add(new Fruit("딸기",6000));
		Iterator<Fruit> it = treeSet.iterator();
		while(it.hasNext()) {
			Fruit fruit = it.next();
			System.out.println(fruit.name +":" + fruit.price);
		}
		
	}
}
class Fruit{
	public String name;
	public int price;
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class DescendingComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price < o2.price)	return -1;
		else if(o1.price == o2.price) return 0;
		else	return 1;
	}																																			
	
}
