import java.util.Scanner;
import java.util.Calendar;
public class CalendarOOP {
	
	Calendar date = Calendar.getInstance();//현재날짜 	
	public CalendarOOP(){}
	//입력 - 콘솔에서 정수입력
	public int getInt(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+"->");
		return scan.nextInt();
	}
	//요일 - 입력받은 년,월,1일이 무슨 요일인지 구한다.
	public int getWeek(int year, int month) {	
		date.set(year, month-1, 1);//년,월,1
		return date.get(Calendar.DAY_OF_WEEK);
	}
	//제목
	public void titlePrint(int week, int day) {
		String weekStr[] = {"일","월","화","수","목","금","토"};
		for(String w: weekStr) {
			System.out.print(w+"\t");
		}
		System.out.println();
		spacePrint(week,day);
		///////
	}
	//공백
	public void spacePrint(int week, int day) {
		for(int i=1;i<week;i++) {
			System.out.print("\t");
		}
		dayPrint(day,week);
		///////
	}
	//날짜
	public void dayPrint(int day, int week) {
		for(int d=1; d<=day;d++) {
			System.out.print(d+"\t");
			if((week-1+d)%7==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	public void start() {
		int y = getInt("년도"); //2020
		int m = getInt("월");//8
		int w = getWeek(y,m);
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);//마지막날구하기
//		titlePrint();
//		spacePrint(w);
//		dayPrint(lastDay,w);
		titlePrint(w, lastDay);
		////////
	}
	public static void main(String args[]) {
		CalendarOOP oop = new CalendarOOP();
		oop.start();
		System.out.println("프로그램이 종료되었습니다...");
	}
}
