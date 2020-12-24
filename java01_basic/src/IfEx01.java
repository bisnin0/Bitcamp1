import java.util.Scanner;
class IfEx01 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("년도=");
		int year = scan.nextInt();
		// 4의 배수인 년도 100을 나누어지지 안아야 한다.
		// 400년에 한번은 무조건 윤년이다.
		boolean result = year%4==0 && year%100!=0 || year%400==0;
		if(result){
			System.out.println(year+"는 윤년입니다.");
		}

		if(!result){
			System.out.println(year+"는 평년입니다.");
		}
	}
}
/*
콘솔에서 년도를 입력받아 윤년인지 아닌지 구별하여 출력라.
실행
년도=2020
2020년은 윤년입니다.

년도=2022
2022년은 윤년이 아닙니다.

*/
