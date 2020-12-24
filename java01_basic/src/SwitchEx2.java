import java.util.Scanner;
class SwitchEx2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("국어=");
		int kor = scan.nextInt();
		System.out.print("영어=");
		int eng = scan.nextInt();
		System.out.print("수학=");
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
			System.out.println("총점="+tot);
			System.out.println("평균="+ave);
			System.out.println("학점="+grade);
		}
	}
}

/*
3과목의 점수를 입력받아 총점, 평균(실수), 학점을 출력하라.
90~100 A
80~89  B
70~79  C
60~69  D
0~59   F
학점은 switch로 구한다.

실행
국어=
영어=
수학=
총점=
평균=
학점=
*/
