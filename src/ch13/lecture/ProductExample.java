package ch13.lecture;

class Tv{
	
}

class Car{
	
}

class Product<T, M>{
	private T kind;
	private M model;
	
	public T getKind() {
		return this.kind;
	}
	
	public M getModel() {
		return this.model;
	}
	
	void setKind(T kind) {
		this.kind = kind;
	}
	
	void setModel(M model) {
		this.model = model;
	}
}

public class ProductExample{
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		String tvModel = product1.getModel();
		System.out.println(tvModel);
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		System.out.println(carModel);
		
		double db = (int) 10;
		System.out.println(db);
	}
}
