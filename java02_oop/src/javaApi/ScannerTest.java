package javaApi;
import java.util.Scanner;
class ScannerTest 
{
	public static void main(StringTokenizerTest[] args) 
	{
		//Scanner : 콘솔에서 숫자, 문자를 입력받을 수 있는 클래스 
		//1. 클래스명을 직접적으로 사용(객체를 만들지 않고 사용)
		//2. 객체를 생성하여 사용
		// new : 객체를 생성하는 키워드(예약어)
		Scanner scan = new Scanner(System.in);
		// nextInt() -> int, nextDouble() --> double,
		// next()  --> 한단어를 문자로 읽어옴
		// nextLine() -> 1줄을 문자로 읽어옴
		System.out.print("정수입력=");
		int data = scan.nextInt();// 문자로 입력받아 정수 바꿔주는 메소드

		//  1,2,3,4,5,6,.........
		//  
		//String result = (data%2==0)?"짝수":"홀수";
		//               9/2    9/2.0
		String result = (data/2==data/2.0)?"짝수":"홀수";

		System.out.println(data+"는 "+ result+"입니다.");
	}
}
