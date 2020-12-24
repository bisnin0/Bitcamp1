import java.util.Scanner;
public class WhileEx1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//반복문은 while을 이용한다.
		System.out.print("임의의 정수=");
		int max = scan.nextInt();

		int i=1; // 1,2,3,4,5,6,7,.......
		int sum=0;
		while(true){
			sum += i; // 
			if(sum>=max){
				System.out.println("1~"+i+"까지의 합은 "+sum);
				break;
			}
			i++;
		}
	}
}
/*
임의수를 입력받아
1부터 합은 구하는데 합이 입력받은 값을 최초로 초과하는 시점의 수와 합을 구하라.

1+2+3+4+5+6+7...

실행
임의의수=253254
1에서 _____까지의 합은 _____이다.

*/
