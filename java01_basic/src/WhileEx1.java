import java.util.Scanner;
public class WhileEx1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//�ݺ����� while�� �̿��Ѵ�.
		System.out.print("������ ����=");
		int max = scan.nextInt();

		int i=1; // 1,2,3,4,5,6,7,.......
		int sum=0;
		while(true){
			sum += i; // 
			if(sum>=max){
				System.out.println("1~"+i+"������ ���� "+sum);
				break;
			}
			i++;
		}
	}
}
/*
���Ǽ��� �Է¹޾�
1���� ���� ���ϴµ� ���� �Է¹��� ���� ���ʷ� �ʰ��ϴ� ������ ���� ���� ���϶�.

1+2+3+4+5+6+7...

����
�����Ǽ�=253254
1���� _____������ ���� _____�̴�.

*/
