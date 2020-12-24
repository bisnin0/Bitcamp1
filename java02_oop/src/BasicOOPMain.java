import java.lang.String;
public class BasicOOPMain {

	public static void main(String[] args) {
		String name = new String();
		
		//객체생성                 객체생성할때 1번 실행:객체의 초기화
		BasicOOP oop1 = new BasicOOP();
		BasicOOP oop2 = new BasicOOP();
		
		//객체 내의 메소드 호출  -> 객체명.메소드명
		oop1.sum();
		
		name = oop1.getName();
		System.out.println("name="+ name);
		
		//객체내의 멤버변수의 데이터를 얻어오거나 변경하기
		//  객체명.변수명
		oop1.a = 2500;
		
		System.out.println("oop1.a = "+ oop1.a);
		System.out.println("oop2.a = "+ oop2.a);
	}
}
