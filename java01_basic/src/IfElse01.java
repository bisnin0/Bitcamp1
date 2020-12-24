import java.util.Scanner;
class IfElse01 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//정수를 입력받아 양수일때는 양수에 100을 곱하여 출력하고
		//            음수일때는 입력받은 값을 양수로 변경한 다음 200을 곱하여 출력하라.
		System.out.print("정수입력=");
		int inData = scan.nextInt();
		int result=0;
		
		if(inData<0){//-			
			result = -inData * 200;			
		}else{//0, +
			result = inData * 100;
		}
		
		System.out.println("result="+result);
	}
}
/*
if(조건식){// 참일때
	실행문;
	:
}else{// 거짓일때
	실행문;
	:
}
*/
