package class_example;

public class Car_example {
	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "AR";
		c1.price = 2000;
//		System.out.println("name:" + c1.name);
//		System.out.println("price:" + c1.price);

		Bus b1 = new Bus();
		b1.setName("마을버스");
		b1.setPrice(5000);
//		System.out.println(b1.name); // name 필드에 접근할 수 없음
		System.out.println(b1.getName()); // getName 메소드를 통해 접근 가능
		System.out.println(b1.getPrice());
	}
}
