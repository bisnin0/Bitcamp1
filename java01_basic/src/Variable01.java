class Variable01{
	public static void main(String[] args) 
	{	//1주석 : 설명 
		/*
			여러줄 주석문
			여러줄 주석문
		*/
		//변수 선언 = 기본데이터형, 레퍼런스형(객체형)
		// 정수 :  byte(1byte), short(2byte), int(4byte:기본타입), long(8byte)
		// 상수 :  100,  50
		//데이터형  변수    상수
		byte  korJumsu = 100;
		int  engJumsu = 50;

		int hap = korJumsu + engJumsu;
		//클래스.변수.메소드  print():출력후 줄 안바꿈, println():출력후 줄바꿈, printf()  
		System.out.println("국어="+korJumsu);
		System.out.println("영어="+engJumsu);
		System.out.println("합계="+hap);

		System.out.println(korJumsu+"+"+engJumsu+"="+hap);
		
		//         typecasting
		byte num = (byte)130;
		System.out.println("num="+num);

		int num2 = num;
		System.out.println("num2="+num2);
	}
}
/*
변수 생성 규칙
1. 소문자 시작한다.
2. 첫번째 문자는 영어, _, $만 가능
3. 특수문자(_, $제외)는 사용할수 없다.
4. 합성어일 경우 두번째 단어의 첫번째 문자는 대문자로 시작한다.
*/