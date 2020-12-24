import java.util.Scanner;

class ForEx08 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("홀수=");
		int max = scan.nextInt(); // 11
		if(max%2==0){//짝수면 홀수로 변경
			max++;
		}
		char txt = 'A';//출력할 데이터의 초기값
		int step =2;
		for(int i=1; i>=1; i+=step){//1, 3, 5, 7, 9,11,9,7,5,3,1 
			//공백
			for(int s=1; s<=(max-i)/2; s++){
				System.out.print(" ");
			}
			//문자
			for(int j=1; j<=i; j++){// 1

				System.out.print(txt++);
				if(txt>'Z')	txt='A';
			}
			System.out.println();
			if(i>=max) step=-2; 
		}
	}
}

/*
실행
홀수입력=11
          A
         BCD
		EFGHI
	   JKLMNOP
	  QRSTUVWXY
	 ZABCDEFGHIJ
	  LMNOPQRST
	   UVWXYZA
	    BCDEF
		 GHI
		  J

*/

