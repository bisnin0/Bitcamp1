import java.util.Scanner;
class IfElse01 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//������ �Է¹޾� ����϶��� ����� 100�� ���Ͽ� ����ϰ�
		//            �����϶��� �Է¹��� ���� ����� ������ ���� 200�� ���Ͽ� ����϶�.
		System.out.print("�����Է�=");
		int inData = scan.nextInt();
		int result=0;
		
		if(inData<0){//-			
			result = -inData * 200;			
		}else{//0, +
			result = inData * 100;
		}
		
		System.out.println("result="+result);
	}
}
/*
if(���ǽ�){// ���϶�
	���๮;
	:
}else{// �����϶�
	���๮;
	:
}
*/
