package ch10.lecture;


class Book extends Object{
	//equals로 true가 나왔다면
	//hashcode 값이 같아야된다~~~
	String name;
	int price;
	Book(){}
	Book(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]" + "HashCode :" + this.hashCode();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return price * 10;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) { // 클래스 타입 확인
			Book o = (Book) obj; // 오브젝트 갖고와서 강제 형변환 후 비교
			if(obj != null) { // 널포인트 확인
				return this.name == o.name;
			}
		}
		
		return false;
	}
	
	
}

public class C03Equals extends Object {
	public static void main(String[] args) {
		Book b1 = new Book("오렌지나무", 20000);
		Book b2 = new Book("오렌지나무", 20000);
		System.out.println(b1.toString());
		System.out.println(b1);
		System.out.println(b2.toString());
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b2));
		Book b3 = new Book();
		Book b4 = new Book();
//		System.out.println(b3.equals(b4));
		
		Object[] arr = {"java",3,true};
		int k = 10;
		System.out.println(arr[1].getClass());
		
		Object d = 99;
		Integer e = (int) d;
		System.out.println(e);
		}
}
