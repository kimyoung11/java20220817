package ch13.lecture;

//class Container<K,V>{
//	Object K;
//	Object V;
//	public void set(K k,V v) {
//		// TODO Auto-generated method stub
//		this.K = k;
//		this.V = v;
//	}
//	public <T,K> T getKey() {
//		return null;
//	}
//	
//	public <T,K> K getValue() {
//		return null;
//	}
//	
//}

class Container<K, V> {
	private K key;
	private V value;
	
	public void set(K t, V u) {
		key = t;
		value = u;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
public class ContainerExample {
	public static void main(String[] args) {
		Container<String,String> container1 = new Container<>();
		container1.set("홍길동","도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String,Integer> container2 = new Container<>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		
	
		
		
	}
}
