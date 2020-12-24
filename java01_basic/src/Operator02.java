class Operator02 
{
	public static void main(String[] args) 
	{
		int num = 10;
		int data = 5;
		//비교(관계) 연산자 : >, <, >=, <=, ==(같다), !=(같지 않다.)
		boolean boo = 10 > 5;
		System.out.println("boo="+ boo);
		
		boolean boo2 = 20 <= num * 10 / 2 + 15 - --data;
		System.out.println("boo2="+ boo2);
		//  100  --> 

		num = -num;
		System.out.println("num="+ num); //-10
		
		//삼항 연산자 
		//  = (조건식)?참일때:거짓일때;
		String str = (num > 0)? "양수":"음수";
		System.out.println("str="+ str);
	}
}
