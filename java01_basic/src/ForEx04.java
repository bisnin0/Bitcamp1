import java.util.Scanner;
class ForEx04 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("����� �Է�=");
		int max = scan.nextInt();

		int sum=0, oddSum=0, evenSum=0;
		for(int i=1; i<=max ; i++ ){//1,2,3,4....max
			sum += i;//��ü��
			if(i%2==0){//¦��
				evenSum += i;
			}else{//Ȧ��
				oddSum += i;
			}
		}
		System.out.println("1~"+max+"������ ���� "+sum);
		System.out.println("1~"+max+"������ Ȧ���� ���� "+ oddSum);
		System.out.println("1~"+max+"������ ¦���� ���� "+ evenSum);
	}
}
/*
���(����)�� �Է¹޾�
�Է¹��� ������ ¦���� ��, Ȧ���� ��, ��ü���� ���Ͽ���.

����
���Է�=1000
1~1000������ ���� 5050
1~1000������ Ȧ���� ���� 2500
1~1000������ ¦���� ���� 2550
*/
