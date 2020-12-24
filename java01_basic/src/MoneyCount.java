import java.util.Scanner;
class MoneyCount 
{
	public static void main(String arg[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요=");
		int money = scan.nextInt();

		//  50000, 10000, 5000, 1000, 500, 100, 50, 10
		// 50000
		int cnt = money / 50000;
		if(cnt>0){
			System.out.println("50000원="+cnt+"장");
			money = money - (cnt*50000);
		}
		// 10000
		cnt = money / 10000;
		if(cnt>0){
			System.out.println("10000원="+cnt+"장");
			money =  money - (cnt*10000);
		}
		//5000
		if((cnt = money / 5000)  >  0){
			System.out.println("5000원="+cnt+"장");
			money =  money - (cnt*5000);
		}
		//1000
		if((cnt = money/1000)>0){
			System.out.println("1000원="+cnt+"장");
			money = money-(cnt*1000);
		}	
		if((cnt = money/500)>0){
			System.out.println("500원="+cnt+"개");
		}
	}
}
