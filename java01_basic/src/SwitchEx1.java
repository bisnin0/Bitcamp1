import java.util.Scanner;
class SwitchEx1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("월입력=");
		int month = scan.nextInt();
		if(month>=1 && month<=12){
			String season="";
			switch(month){
				case 11:case 12:case 1:case 2:
					season = "겨울";
					break;
				case 3:case 4:case 5:
					season = "봄";
					break;
				case 6: case 7: case 8:
					season = "여름";
					break;
				case 9: case 10:
					season ="겨울";
					break;
			}//switch
			System.out.println(month+"는 "+season+"입니다.");
		}else{
			System.out.println("월을 잘못입력하였습니다.");
		}//if
	}
}
/*

월을 입력받아
11, 12, 1, 2 은 겨울
3,4,5 봄
6,7,8 여름
9, 10 가을
 
실행
월=12
12월은 겨울입니다.
*/
