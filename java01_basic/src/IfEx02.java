import java.util.Scanner;
class IfEx02
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��°��=");
		int first = scan.nextInt();
		System.out.print("�ι�°��=");
		int second = scan.nextInt();

		if(first>0 && second>0){
			int add = first+second;
			int minus = first - second;
			int multiple = first * second;
			int devide = first / second;

			System.out.println(first+"+"+second+"="+add);
			System.out.println(first+"-"+second+"="+minus);
			System.out.println(first+"*"+second+"="+multiple);
			System.out.println(first+"/"+second+"="+devide);
		}

		float a = (float)3/2;
		System.out.println(a);

		float aa = 0.1f;
		double bb = 0.1;
		System.out.println(aa==bb);
	}
}
/*
�μ��� �Է¹޾� �μ� ��� ����̸� ��Ģ�������� ����϶�.
����
ù��°��=5
�ι�°��=3
5+3=8
:
:
*/
