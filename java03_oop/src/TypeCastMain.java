import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TypeCastMain {

	public TypeCastMain() {	
	}

	public static void main(String[] args) {
		TypeCast2 tc1 = new TypeCast2();
		tc1.prn();
		//하위클래스를 상위클래스 변수에 대입시킬경우 하위클래스의 변수, 메소드를 호출한다.
		TypeCast1 tc2 = tc1;
		tc2.prn();
		
		//상위클래스객체를 하위클래스 변수에 대입할 경우 강제로 형변환하여야 한다.
		TypeCast2 tc3 = (TypeCast2)tc2;
		tc3.prn();
		
		TypeCast1 tc4 = new TypeCast2();
		
		List lst = new ArrayList();
		
		InterfaceTest it = new InterfaceMain();
		System.out.println("it.minus="+it.minus(100, 50));
		
		InterfaceMain it2 = (InterfaceMain)it;
		System.out.println("it2.minus="+ it2.minus(1000, 200));
		
		System.out.println(tc1.equals(tc2));
	}
}











