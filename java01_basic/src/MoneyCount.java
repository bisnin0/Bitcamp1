import java.util.Scanner;
class MoneyCount 
{
	public static void main(String arg[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��ϼ���=");
		int money = scan.nextInt();

		//  50000, 10000, 5000, 1000, 500, 100, 50, 10
		// 50000
		int cnt = money / 50000;
		if(cnt>0){
			System.out.println("50000��="+cnt+"��");
			money = money - (cnt*50000);
		}
		// 10000
		cnt = money / 10000;
		if(cnt>0){
			System.out.println("10000��="+cnt+"��");
			money =  money - (cnt*10000);
		}
		//5000
		if((cnt = money / 5000)  >  0){
			System.out.println("5000��="+cnt+"��");
			money =  money - (cnt*5000);
		}
		//1000
		if((cnt = money/1000)>0){
			System.out.println("1000��="+cnt+"��");
			money = money-(cnt*1000);
		}	
		if((cnt = money/500)>0){
			System.out.println("500��="+cnt+"��");
		}
	}
}
