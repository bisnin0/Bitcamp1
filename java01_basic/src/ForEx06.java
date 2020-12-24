import java.util.Scanner;
import java.util.Calendar;
class ForEx06 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("년도=");
		int year = scan.nextInt();
		System.out.print("월=");
		int month = scan.nextInt(); 

	
		Calendar date = Calendar.getInstance();//오늘날짜, 시간
		//요일
		date.set(year, month-1, 1);//날짜변경
		int week = date.get(Calendar.DAY_OF_WEEK);
		//마지막
		int lastDay = 31;
		switch(month){
			case 4: case 6: case 9: case 11:
				lastDay = 30;
				break;
			case 2:
				if(month%4==0 && month%100!=0 || month%400==0){
					lastDay = 29;
				}else{
					lastDay = 28;
				}
		}
		//제목출력
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//1일 출력전 공백출력
		for(int s=1; s<week; s++){
			System.out.print("\t");
		}
		//날짜출력
		for(int i=1; i<=lastDay; i++){
			System.out.print(i+"\t");
			if((i+week-1)%7==0){//1줄에 공백포함 7개을 출력하면 줄을 바꿈
				System.out.println();
			}
		}
		System.out.println();
	}
}
/*
실행
년도=2020
월=7
일	월	화	수	목	금	토
			1	2	3	4
5	6	7	8	9	10	11
12	13	14	15	16	17	18
19	20	21	22	23	24	25
26	27	28	29	30	31
*/