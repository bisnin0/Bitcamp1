import java.util.Scanner;

class ForEx08 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Ȧ��=");
		int max = scan.nextInt(); // 11
		if(max%2==0){//¦���� Ȧ���� ����
			max++;
		}
		char txt = 'A';//����� �������� �ʱⰪ
		int step =2;
		for(int i=1; i>=1; i+=step){//1, 3, 5, 7, 9,11,9,7,5,3,1 
			//����
			for(int s=1; s<=(max-i)/2; s++){
				System.out.print(" ");
			}
			//����
			for(int j=1; j<=i; j++){// 1

				System.out.print(txt++);
				if(txt>'Z')	txt='A';
			}
			System.out.println();
			if(i>=max) step=-2; 
		}
	}
}

/*
����
Ȧ���Է�=11
          A
         BCD
		EFGHI
	   JKLMNOP
	  QRSTUVWXY
	 ZABCDEFGHIJ
	  LMNOPQRST
	   UVWXYZA
	    BCDEF
		 GHI
		  J

*/

