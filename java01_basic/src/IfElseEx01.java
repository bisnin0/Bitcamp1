import java.util.Scanner;
class IfElseEx01 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴(1:사각형의 넓이, 2:원의 넓이)->");
		int menu = scan.nextInt();

		if(menu==1){//1
			System.out.print("밑변=");
			int w = scan.nextInt();
			System.out.print("높이=");
			int h = scan.nextInt();
			int result = w * h;
			System.out.println("사각형의 넓이는 "+result+"입니다.");
		}else{//1외의 값
			 if(menu==2){//2
				System.out.print("반지름=");
				int radius = scan.nextInt();
				double result = radius*radius*Math.PI; // 78.5398
				System.out.println("원의 넓이는 "+result+"입니다.");
			 }else{//1,2를 제외한 메뉴일때..
				System.out.println("메뉴를 잘못선택하였습니다..");
			 }
		}
	}
}
/*
실행
메뉴(1:사각형의 넓이, 2:원의 넓이)-> 1
밑변=
높이=
사각형의 넓이는 ____입니다.

메뉴(1:사각형의 넓이, 2:원의 넓이)-> 2
반지름=
원의의 넓이는 ____입니다.

*/
