import java.util.Scanner;
class OperatorEx2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		//1. �������Է�
		System.out.print("�޴�(1:�簢������, 2:�簢���ѷ�)->");
		int menu = scan.nextInt();
		System.out.print("�غ�->");
		int width = scan.nextInt();
		System.out.print("����->");
		int height = scan.nextInt();
		//2. ���
		int result = (menu==1)? width*height : (width+height)*2;
		String msg = (menu==1)? "����":"�ѷ�";
		//3. ���
		System.out.printf("�簢���� %s�� %d\n", msg, result);
	}
}
/*
�μ� �Է¹޾� �簢���� ���� �Ǵ� �簢���� �ѷ��� ���϶�.
�簢���� ���� = �غ�(����) * ����(����)
�簢���� �ѷ� = (�غ�+����)*2

����
�޴�(1:�簢������, 2:�簢���ѷ�)-> 2
�غ� ->
���� ->

�簢���� �ѷ��� ___
�簢���� ���̴� ___
*/