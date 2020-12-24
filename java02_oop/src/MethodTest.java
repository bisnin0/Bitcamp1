import java.util.Scanner;
public class MethodTest {
	//int dan;//멤버변수는 기본 초기값이 있다.  정수=0, 실수=0.0, 논리=false, char=데이터없음
	        //                        모든 클래스 객체는 초기값이 null
	//레퍼런스 변수 :  클래스형 변수
	Scanner s;
	String name;
	
	public MethodTest() {}//매개변수가 없는 생성자 기본으로 생성해주는 것이 좋다.
	//단입력메소드
	public int getDan(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+"=");
		int dan = scan.nextInt();
		return dan;
	}
	//입력받은 단으로 구구한 출력
	public void danOutput(int dan) {
		for(int i=2; i<=9; i++) {
			calcurator(i, dan);//메소드 호출 : 같은 클래스의 메소드는 메소드명으로 호출된다.
		}		
	}
	//계산
	public void calcurator(int i, int dan) {
		int result = dan * i;
		System.out.println(dan+"*"+i+"="+result);
	}
	public void startDan() {
		int dan = getDan("단입력");
		danOutput(dan);
	}
}


