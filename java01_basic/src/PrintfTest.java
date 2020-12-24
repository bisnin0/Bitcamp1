public class PrintfTest 
{	//  final 상수 : 대문자로 시작
	// static public void main(String[] args)
	// public static void main(String args[])
	// public static void main(String data[])
	public static void main(String[] args) 
	{
		//
		String msg = "두번째 자바공부중...";
		System.out.println(msg);

		// printf() :  출력 형식을 포멧으로 설정한다.
		double result = 10 / (double)3;
		System.out.println("result="+ result);
		// 정수 , 실수 , 문자열
		int numInt = 1234;
		String username = "홍길동";
		// 정수 format : %10d
		System.out.printf("numInt(정수)=%10d\n",numInt);
		// 실수 format : %10.2f -> 전체 10자리중 소수이하 2자리
		System.out.printf("result=%10.2f\n", result);
		// 문자 format : %10s
		System.out.printf("이름=%10s",username);

		System.out.println();
		// 한번에 여러데이터 출력
		System.out.printf("%6.1f, %7d, %5s\n",result, numInt, username);

		//제어문자 : \",  \', \n(newline), \t(tab), \\
		//이름 출력 :  내이름은 "홍길동"입니다.
		System.out.printf("\t내이름은 \"%s\"입니다.\n" , username );
		
		//이름 출력 :  내이름은 \홍길동\입니다.
		System.out.printf("\t내이름은 \\%s\\입니다.\n" , username );
	}
}
