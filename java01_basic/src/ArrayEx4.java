import java.util.Scanner;
class ArrayEx4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String title[] = {"이름","국어","영어","수학","총점","평균","석차"};

		//학생수를 입력받아 이름저장 배열, 성적저장할 배열생성
		System.out.print("학생수=");
		int cnt = scan.nextInt();

		String names[] = new String[cnt];//이름저장할 배열
		double jumsu[][] = new double[cnt+2][6];// 점수를 저장할 배열

		//데이터입력
		for(int i=0; i<cnt; i++){// i=0,1,2,3,4  -> 학생수만큼 회전
			System.out.print(title[0]+"=");//이름
			scan.nextLine();
			names[i] = scan.nextLine();
			//세과목의 점수
			for(int j=0; j<3; j++){// j=1,2,3   0,1,2
				System.out.print(title[j+1]+"=");
				jumsu[i][j] = scan.nextInt();
			}
		}
		//개인별 총점, 평균, 과목별 총점
		for(int r=0; r<cnt; r++){//0, 1, 2,3,4
			for(int c=0; c<3; c++){//0,1,2
				jumsu[r][3]= jumsu[r][3] + jumsu[r][c];//개인총점
				jumsu[cnt][c] = jumsu[cnt][c] + jumsu[r][c];//과목별 총점
			}
			jumsu[r][4] = jumsu[r][3] / 3;//개인별 평균
		}
		//과목별 평균
		for(int c=0; c<=2; c++){// 0,1,2
			jumsu[cnt+1][c] = jumsu[cnt][c] / cnt;
		}

		//석차구하기 :  자신의 점수보다 높은 점수의 수를 구한다. 
		for(int r=0; r<cnt; r++){// 0,1,2,3,4
			
			for(int r2=0; r2<cnt; r2++){// 0,1,2,3,4
				// 내총점          상대방총점
				if(jumsu[r][3] < jumsu[r2][3]){
					jumsu[r][5]++;
				}
			}
			jumsu[r][5]++;
		}

		//출력------------------------------------
		for(String t : title){//제목출력
			System.out.print(t+"\t");
		}
		System.out.println();

		//이름과 점수 출력
		for(int i=0; i<jumsu.length; i++){// 0,1,2,3,4,5,6
			if(i==cnt){
				System.out.print("총점\t");
			}
			else if(i==cnt+1){
				System.out.print("평균\t");
			}else{
				System.out.print(names[i]+"\t");//이름
			}
			for(int j=0; j<jumsu[i].length; j++){
				System.out.printf("%.1f\t", jumsu[i][j]);
			}
			System.out.println();
		}
	}
}

/*
학생수 입력받고 이름, 3(국어, 영어, 수학)과목점수를 입력받은 후 개인별 총점, 평균, 석차를 구하고
각 과목별 총점과, 평균을 구하라.
단, 석차순으로 출력한다.

실행
학생수=3
이름=홍길동
국어=90
영어=80
수학=90
이름=박길동
:
:

이름	  국어	영어	   수학	총점   평균	석차
홍길동  90    80     90   260   _     _
박길동   _    _      _    _     _     _
_      _    _      _     _    _     _
총점    _    _      _
평균    _    _      _
*/
