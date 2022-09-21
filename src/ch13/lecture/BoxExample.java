package ch13.lecture;

class Box<T>{
	private T object;
	public void set(T object) {
		this.object = object;
	}
	public T get() {
		return object;
	}
}

class Apple{
	String name;
	int price;
	public Apple() {
		this.name="사과";
		this.price=10000;
	}
}

public class BoxExample {
	public static void main(String[] args) {
		
		Box<String> box = new Box();
		box.set("홍길동");
		String name =box.get();
		System.out.println(box.get().getClass());
		System.out.println(name);
		
		Box<Apple> apple =new Box();
		apple.get();
		System.out.println(apple.getClass());
	}
}
