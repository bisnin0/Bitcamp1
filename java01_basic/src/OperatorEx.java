import java.util.Scanner;
class OperatorEx 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		//1. �޿��Է�
		System.out.print("�޿��Է�=");
		int salary = scan.nextInt();
		//2. ���        200�̻��϶�   200�̸�
		double bonus= (salary>=2000000)?  salary*0.05: salary*0.1;
		double payment = salary + bonus;
		//3. ���
		System.out.printf("�޿�=%d\n���ʽ�=%f\n���޾�=%f\n", salary, bonus, payment);
	}
}
/*
�޿��� �Է¹޾� �޿��� 200�����̸��̸� ���ʽ��� 10%�����ϰ�,
�޿��� 200�����̻��̸� ���ʽ��� 5%�����ϴ� ���α׷��� �ۼ��϶�.

����
�޿��Է�=_____

�޿�=_____
���ʽ�=_____
���޾�=_____
*/