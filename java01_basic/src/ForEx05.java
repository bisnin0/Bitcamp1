import java.util.Scanner;
class ForEx05 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Ǽ�=");
		int num = scan.nextInt();

		int sum=0;
		for(int i=1;;i++){//1,2,3,4.....
			sum += i;//�ձ��ϱ�
			if(num <= sum){
				System.out.println("1~"+i+"�� ���� "+sum);
				break;
			}
		}
	}
}
/*
���Ǽ��� �Է¹޾�
1���� ���� ���ϴµ� ���� �Է¹��� ���� ���ʷ� �ʰ��ϴ� ������ ���� ���� ���϶�.

1+2+3+4+5+6+7...

����
�����Ǽ�=253254
1���� ___������ ���� _____�̴�.

*/
