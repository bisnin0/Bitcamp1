class Array3
{
	public static void main(String[] args) 
	{
		System.out.println(args);
		//arguments - �ƱԸ�Ʈ, �Ű�����, �Ķ����
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		//System.out.println(args[2]);

		// id:admin,  password:1234
		//  args[0].equals("admin") && args[1].equals("1234")
		if( "admin".equals(args[0]) && "1234".equals(args[1]) ){
			int sum = 0;
			for(int i=1; i<=100; i++){
				sum += i;
			}
			System.out.println("1~100������ ���� "+ sum);
		}else{//�α��� ���н�
			System.out.println("���̵�� ��й�ȣ�� �߸��Է��Ͽ����ϴ�...");
		}		
	}
}
