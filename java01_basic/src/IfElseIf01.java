import java.util.Scanner;
class IfElseIf01 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int kor, eng, mat;
		System.out.print("����=");
		kor = scan.nextInt();
		System.out.print("����=");
		eng = scan.nextInt();
		System.out.print("����=");
		mat = scan.nextInt();

		double total = kor + eng + mat;
		double ave = total / 3;
		//����
		char grade='X';
		if(ave>=90 && ave<=100){
			grade = 'A';
		}else if(ave>=80 && ave<90){
			grade = 'B';
		}else if(ave>=70 && ave<80){
			grade = 'C';
		}else if(ave>=60 && ave<70){
			grade = 'D';
		}else if(ave>=0 && ave<60){
			grade = 'F';
		}
	
		//���
		if(grade!='X'){
			System.out.printf("����=%f\n���=%f\n����=%s\n", total, ave, grade);
		}else{
			System.out.println("������ �߸��Է��Ͽ����ϴ�.");
		}
	}
}
/*
3������ ������ �Է¹޾� ����, ���(�Ǽ�), ������ ����϶�.
90~100 A
80~89  B
70~79  C
60~69  D
0~59   F

����
����=
����=
����=

����=
���=
����=

	if~elseif��

	if(���ǽ�){
		���๮;
	}elseif(���ǽ�){
		���๮;
	}elseif(���ǽ�){
		���๮;
	}else{
		//�׿� ó��
		���๮;
	}
*/
