import java.util.Scanner;
class Operator04 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("정수입력:");
		int inData = scan.nextInt();
		// and : &&, or : ||, not : !
		String result = (inData>=1 && inData<=100)?"있습니다.":"없습니다.";
		System.out.println(inData+"는 값의 범위내에 "+ result);
	}
}
/*
실행
정수입력:59
59는 값의 범위내에 있습니다.
-38는 값의 범위내에 없습니다.
0는 값의 범위내에 없습니다.

*/