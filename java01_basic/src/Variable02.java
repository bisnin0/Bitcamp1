class Variable02 
{
	public static void main(String[] args) 
	{
		//실수 : float(4byte), double(8byte:기본)
		float num = (float)10.5; //float num = 10.5f;
		double num2 = 25.5;
		System.out.println("num="+ num);
		System.out.println("num2="+ num2);
		// 정수,정수=정수,   정수,실수=실수

		double result = num2 / 5;
		double resultInt = 15/(double)4;
		System.out.println("result="+result);
		System.out.println("resultInt="+resultInt);

		//논리형 데이터 처리 boolean형
		boolean boo = true;  // false
		System.out.println("boo="+ boo);
		//문자형 : 1글자
		char c1 = 'A';
		char c2 = '홍';
		System.out.println(c1+","+ c2);

		c1++;

		System.out.println("c1="+ c1);

		c1 = (char)(c1 + 1);
		System.out.println("c1="+c1);

		c1 = (char)120;
		System.out.println("c1="+c1);

		String userName = "홍길동";
		String addr = "서울시 마포구 신수동";

		System.out.println(userName);
		System.out.println(addr);
	}
}
