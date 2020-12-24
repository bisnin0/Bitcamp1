import java.util.Scanner;
class NumberCount 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("양의 정수 입력=");
		int max = scan.nextInt();

		int cnt[] = new int[10];//각숫자를 카운트할 배열
		for(int i=1; i<=max; i++){//1    ,2,3   .... 1000
			cnt[i%10]++;//단자리      1
			if(i>=10) cnt[i/10%10]++;//십자리 
			if(i>=100) cnt[i/100%10]++;//백의 자리
			if(i>=1000) cnt[i/1000%10]++;//천의 자리
		}
		for(int idx=0; idx<cnt.length; idx++){
			System.out.println(idx+"->"+cnt[idx]);
		}
	}
}
