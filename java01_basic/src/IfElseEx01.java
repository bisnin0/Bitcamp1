import java.util.Scanner;
class IfElseEx01 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�޴�(1:�簢���� ����, 2:���� ����)->");
		int menu = scan.nextInt();

		if(menu==1){//1
			System.out.print("�غ�=");
			int w = scan.nextInt();
			System.out.print("����=");
			int h = scan.nextInt();
			int result = w * h;
			System.out.println("�簢���� ���̴� "+result+"�Դϴ�.");
		}else{//1���� ��
			 if(menu==2){//2
				System.out.print("������=");
				int radius = scan.nextInt();
				double result = radius*radius*Math.PI; // 78.5398
				System.out.println("���� ���̴� "+result+"�Դϴ�.");
			 }else{//1,2�� ������ �޴��϶�..
				System.out.println("�޴��� �߸������Ͽ����ϴ�..");
			 }
		}
	}
}
/*
����
�޴�(1:�簢���� ����, 2:���� ����)-> 1
�غ�=
����=
�簢���� ���̴� ____�Դϴ�.

�޴�(1:�簢���� ����, 2:���� ����)-> 2
������=
������ ���̴� ____�Դϴ�.

*/
