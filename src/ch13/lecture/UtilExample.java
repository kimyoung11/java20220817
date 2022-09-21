package ch13.lecture;

class Util{
	public static <K,V> V getValue(Pair<K,V> pair, K k) {
		if(pair.getK().equals(k))
			return pair.getV();
		
		return null;
	}
}

class Pair<K,V>{
	private K k;
	private V v;
	
	Pair(K k,V v){
		this.k = k;
		this.v = v;
	}

	public K getK() {
		return k;
	}

	public V getV() {
		return v;
	}

	
}

class ChildPair<K,V> extends Pair<K,V>{

	ChildPair(K k, V v) {
		super(k, v);
		// TODO Auto-generated constructor stub
	}
	

}
public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동",35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원",20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);
		
		
	}
}
