import java.util.Scanner;
class DoWhileEx 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		do{
			System.out.print("�����Է�=");
			int max = scan.nextInt();// 56,85,0,-8
			if(max<0){
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			//0���� ũ�ų� ������
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
			System.out.println("1~"+max+"������ ���� "+sum);
			System.out.println("1~"+max+"Ȧ���� ���� "+oddSum);
			System.out.println("1~"+max+"¦���� ���� "+evenSum);
		}while(true);
		//////
	}
}
/*
==�ݵ�� while �� do~while
== 0���� �������� �ԷµǸ� ���α׷��� ����
����
�����Է�=100
1~100������ ���� 5050
1~100������ Ȧ���� ���� 2500
1~100������ ¦���� ���� 2550

�����Է�=150
1~150������ ���� _____
1~150������ Ȧ���� ���� _____
1~150������ ¦���� ���� _____

�����Է�=-1
���α׷��� ����Ǿ����ϴ�.
*/