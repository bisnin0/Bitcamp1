import java.util.Scanner;
class StandardWeight 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("나이=");
		int age = scan.nextInt();
		System.out.print("성별(1:남성,2:여성)=");
		int gender = scan.nextInt();
		System.out.print("키=");
		int height = scan.nextInt();
		System.out.print("현재체중=");
		int weight = scan.nextInt();

		//표준체중
		double standard=0.90;
		if(age<=35 &&  gender==2){
			standard = 0.85;
		}else if(age>=36 && gender==1){
			standard = 0.95;
		}
		double standardWeight = (height-100)*standard;

		//표준체중지수
		double standardIndex = (weight/standardWeight)*100;
		//체형
		String standardName = "";
		if(standardIndex<=85){
			standardName = "마른형";
		}else if(standardIndex<=95){
			standardName = "조금마른형";
		}else if(standardIndex<=115){
			standardName = "표준형";
		}else if(standardIndex<=125){
			standardName = "조금 비만형";
	    }else{
			standardName = "비만형";
	    }
		////
		System.out.println("표준체중="+standardWeight);
		System.out.printf("당신은 표준체중지수는 %f으로 %s입니다.\n", standardIndex, standardName);
		System.out.printf("당신은 표준체중지수는 "+standardIndex+"으로 "+standardName+"입니다.");
	}
}
