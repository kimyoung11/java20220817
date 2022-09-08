package ThisIsJava.ch06;

class Car{
	public int speed;
	
	public void speedUp() {
		speed+=1;
	}
	
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}


class SportsCar extends Car{
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		super.speedUp();
	}
	
	@Override
	public void stop() {
		System.out.println("스포츠카 멈춤");
		speed = 0;
	}
}
public class SportsCarExample {

}
