import java.util.Scanner;
class OperatorEx 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		//1. 급여입력
		System.out.print("급여입력=");
		int salary = scan.nextInt();
		//2. 계산        200이상일때   200미만
		double bonus= (salary>=2000000)?  salary*0.05: salary*0.1;
		double payment = salary + bonus;
		//3. 출력
		System.out.printf("급여=%d\n보너스=%f\n지급액=%f\n", salary, bonus, payment);
	}
}
/*
급여를 입력받아 급여가 200만원미만이면 보너스를 10%지급하고,
급여가 200만원이상이면 보너스를 5%지급하는 프로그램을 작성하라.

실행
급여입력=_____

급여=_____
보너스=_____
지급액=_____
*/
