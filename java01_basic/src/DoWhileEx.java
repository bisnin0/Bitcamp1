import java.util.Scanner;
class DoWhileEx 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		do{
			System.out.print("정수입력=");
			int max = scan.nextInt();// 56,85,0,-8
			if(max<0){
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			//0보다 크거나 같을때
			//1,2,3,4.......
			int i=0;
			int sum=0, oddSum=0, evenSum=0;
		
			while(i<max){
				i++;
				sum+=i;
				if(i%2==0){
					evenSum+=i;
				}else{
					oddSum+=i;
				}
			}
			System.out.println("1~"+max+"까지의 합은 "+sum);
			System.out.println("1~"+max+"홀수의 합은 "+oddSum);
			System.out.println("1~"+max+"짝수의 합은 "+evenSum);
		}while(true);
		//////
	}
}
/*
==반드시 while 또 do~while
== 0보다 작은수가 입력되면 프로그램이 종료
실행
정수입력=100
1~100까지의 합은 5050
1~100까지의 홀수의 합은 2500
1~100까지의 짝수의 합은 2550

정수입력=150
1~150까지의 합은 _____
1~150까지의 홀수의 합은 _____
1~150까지의 짝수의 합은 _____

정수입력=-1
프로그램이 종료되었습니다.
*/