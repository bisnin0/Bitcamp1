import java.util.Scanner;
class ForEx03 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("���Է�=");
		int dan = scan.nextInt();

		for(int i=2 ; i<10; i++){// 2,3,4,5,6,7,8,9
			int result = dan * i;
			System.out.println(dan+" * "+i+" = "+result);
		}
	}
}

/*
�Է¹��� ���� ����ϴ� �ϴ� ���α׷�

����
���Է�=5
5 * 2 = 10
5 * 3 = 15
:
:
5 * 9 = 45
*/