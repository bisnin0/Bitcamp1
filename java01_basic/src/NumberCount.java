import java.util.Scanner;
class NumberCount 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ���� �Է�=");
		int max = scan.nextInt();

		int cnt[] = new int[10];//�����ڸ� ī��Ʈ�� �迭
		for(int i=1; i<=max; i++){//1    ,2,3   .... 1000
			cnt[i%10]++;//���ڸ�      1
			if(i>=10) cnt[i/10%10]++;//���ڸ� 
			if(i>=100) cnt[i/100%10]++;//���� �ڸ�
			if(i>=1000) cnt[i/1000%10]++;//õ�� �ڸ�
		}
		for(int idx=0; idx<cnt.length; idx++){
			System.out.println(idx+"->"+cnt[idx]);
		}
	}
}
