import java.util.Scanner;
class ForEx04 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("양수를 입력=");
		int max = scan.nextInt();

		int sum=0, oddSum=0, evenSum=0;
		for(int i=1; i<=max ; i++ ){//1,2,3,4....max
			sum += i;//전체합
			if(i%2==0){//짝수
				evenSum += i;
			}else{//홀수
				oddSum += i;
			}
		}
		System.out.println("1~"+max+"까지의 합은 "+sum);
		System.out.println("1~"+max+"까지의 홀수의 합은 "+ oddSum);
		System.out.println("1~"+max+"까지의 짝수의 합은 "+ evenSum);
	}
}
/*
어떤수(정수)를 입력받아
입력받은 수까지 짝수의 합, 홀수의 합, 전체합을 구하여라.

실행
수입력=1000
1~1000까지의 합은 5050
1~1000까지의 홀수의 합은 2500
1~1000까지의 짝수의 합은 2550
*/
