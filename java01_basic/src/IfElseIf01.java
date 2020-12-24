import java.util.Scanner;
class IfElseIf01 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int kor, eng, mat;
		System.out.print("국어=");
		kor = scan.nextInt();
		System.out.print("영어=");
		eng = scan.nextInt();
		System.out.print("수학=");
		mat = scan.nextInt();

		double total = kor + eng + mat;
		double ave = total / 3;
		//학점
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
	
		//출력
		if(grade!='X'){
			System.out.printf("총점=%f\n평균=%f\n학점=%s\n", total, ave, grade);
		}else{
			System.out.println("점수를 잘못입력하였습니다.");
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

실행
국어=
영어=
수학=

총점=
평균=
학점=

	if~elseif문

	if(조건식){
		실행문;
	}elseif(조건식){
		실행문;
	}elseif(조건식){
		실행문;
	}else{
		//그외 처리
		실행문;
	}
*/
