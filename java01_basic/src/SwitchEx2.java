import java.util.Scanner;
class SwitchEx2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("����=");
		int kor = scan.nextInt();
		System.out.print("����=");
		int eng = scan.nextInt();
		System.out.print("����=");
		int mat = scan.nextInt();

		int tot = kor+eng+mat;
		double ave = tot/3.0;

		if(ave >=0 && ave<=100){
			int gradeInt = (int)(ave/10);// 0~10
			String grade="";
			switch(gradeInt){
				case 10: case 9:
					grade = "A";
					break;
				case 8: 
					grade = "B";
					break;
				case 7:
					grade = "C";
				    break;
				case 6:
					grade = "D";
					break;
				default:
					grade = "F";
			}
			System.out.println("����="+tot);
			System.out.println("���="+ave);
			System.out.println("����="+grade);
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
������ switch�� ���Ѵ�.

����
����=
����=
����=
����=
���=
����=
*/
