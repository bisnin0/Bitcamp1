import java.util.Scanner;
class ForEx05 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("임의의수=");
		int num = scan.nextInt();

		int sum=0;
		for(int i=1;;i++){//1,2,3,4.....
			sum += i;//합구하기
			if(num <= sum){
				System.out.println("1~"+i+"의 합은 "+sum);
				break;
			}
		}
	}
}
/*
임의수를 입력받아
1부터 합은 구하는데 합이 입력받은 값을 최초로 초과하는 시점의 수와 합을 구하라.

1+2+3+4+5+6+7...

실행
임의의수=253254
1에서 ___까지의 합은 _____이다.

*/
