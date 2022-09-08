package ThisIsJava.ch06;


class Parent{
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
}

class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
}

public class Example {
	public static void main(String[] args) {
		
		Parent parent = new Parent("대한민국");
		System.out.println(parent.name);
		
		Child child = new Child("우",1);
		System.out.println(child.getStudentNo());
		System.out.println(child.name);
	}
}
