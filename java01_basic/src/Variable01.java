class Variable01{
	public static void main(String[] args) 
	{	//1�ּ� : ���� 
		/*
			������ �ּ���
			������ �ּ���
		*/
		//���� ���� = �⺻��������, ���۷�����(��ü��)
		// ���� :  byte(1byte), short(2byte), int(4byte:�⺻Ÿ��), long(8byte)
		// ��� :  100,  50
		//��������  ����    ���
		byte  korJumsu = 100;
		int  engJumsu = 50;

		int hap = korJumsu + engJumsu;
		//Ŭ����.����.�޼ҵ�  print():����� �� �ȹٲ�, println():����� �ٹٲ�, printf()  
		System.out.println("����="+korJumsu);
		System.out.println("����="+engJumsu);
		System.out.println("�հ�="+hap);

		System.out.println(korJumsu+"+"+engJumsu+"="+hap);
		
		//         typecasting
		byte num = (byte)130;
		System.out.println("num="+num);

		int num2 = num;
		System.out.println("num2="+num2);
	}
}
/*
���� ���� ��Ģ
1. �ҹ��� �����Ѵ�.
2. ù��° ���ڴ� ����, _, $�� ����
3. Ư������(_, $����)�� ����Ҽ� ����.
4. �ռ����� ��� �ι�° �ܾ��� ù��° ���ڴ� �빮�ڷ� �����Ѵ�.
*/