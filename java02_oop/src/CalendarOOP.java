import java.util.Scanner;
import java.util.Calendar;
public class CalendarOOP {
	
	Calendar date = Calendar.getInstance();//���糯¥ 	
	public CalendarOOP(){}
	//�Է� - �ֿܼ��� �����Է�
	public int getInt(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+"->");
		return scan.nextInt();
	}
	//���� - �Է¹��� ��,��,1���� ���� �������� ���Ѵ�.
	public int getWeek(int year, int month) {	
		date.set(year, month-1, 1);//��,��,1
		return date.get(Calendar.DAY_OF_WEEK);
	}
	//����
	public void titlePrint(int week, int day) {
		String weekStr[] = {"��","��","ȭ","��","��","��","��"};
		for(String w: weekStr) {
			System.out.print(w+"\t");
		}
		System.out.println();
		spacePrint(week,day);
		///////
	}
	//����
	public void spacePrint(int week, int day) {
		for(int i=1;i<week;i++) {
			System.out.print("\t");
		}
		dayPrint(day,week);
		///////
	}
	//��¥
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
		int y = getInt("�⵵"); //2020
		int m = getInt("��");//8
		int w = getWeek(y,m);
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);//�����������ϱ�
//		titlePrint();
//		spacePrint(w);
//		dayPrint(lastDay,w);
		titlePrint(w, lastDay);
		////////
	}
	public static void main(String args[]) {
		CalendarOOP oop = new CalendarOOP();
		oop.start();
		System.out.println("���α׷��� ����Ǿ����ϴ�...");
	}
}
