import java.util.Scanner;
class StandardWeight 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("����=");
		int age = scan.nextInt();
		System.out.print("����(1:����,2:����)=");
		int gender = scan.nextInt();
		System.out.print("Ű=");
		int height = scan.nextInt();
		System.out.print("����ü��=");
		int weight = scan.nextInt();

		//ǥ��ü��
		double standard=0.90;
		if(age<=35 &&  gender==2){
			standard = 0.85;
		}else if(age>=36 && gender==1){
			standard = 0.95;
		}
		double standardWeight = (height-100)*standard;

		//ǥ��ü������
		double standardIndex = (weight/standardWeight)*100;
		//ü��
		String standardName = "";
		if(standardIndex<=85){
			standardName = "������";
		}else if(standardIndex<=95){
			standardName = "���ݸ�����";
		}else if(standardIndex<=115){
			standardName = "ǥ����";
		}else if(standardIndex<=125){
			standardName = "���� ����";
	    }else{
			standardName = "����";
	    }
		////
		System.out.println("ǥ��ü��="+standardWeight);
		System.out.printf("����� ǥ��ü�������� %f���� %s�Դϴ�.\n", standardIndex, standardName);
		System.out.printf("����� ǥ��ü�������� "+standardIndex+"���� "+standardName+"�Դϴ�.");
	}
}
