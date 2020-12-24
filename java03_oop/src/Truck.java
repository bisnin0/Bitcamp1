import test.Car2;
public class Truck extends Car2 {

	public Truck() {
		System.out.println("Truck()생성자");
		wheel = 10;
		System.out.println("Truck.wheel="+wheel);
	}

	public static void main(String[] args) {
		new Truck().speedUp();
		
		//protected접근제한자는 다른 팩키지 클래스를 사용할 경우
		// 반드시 상속을 받아야 한다.
		//Car2 car2 = new Car2();
		Car2 car2 = Car2.getInstance();
		//car2.wheel = 12;
		
		//같은 팩키지인 경우 객체를 생성하여 접근가능하다.
		Car car = new Car();
		car.wheel = 15;
	}

}
