class Array4 
{
	public static void main(String[] args) 
	{
		//�迭�� ����

		//�迭�� ������ �迭�� ũ�⸦ �����Ҽ� ����.
		int arr[] = {56, 15, 78, 69, 86, 41, 99};//0~6

		int arr2[] = new int[20];

		
        //          �����迭, �������index, Ÿ�ٹ迭, ����, ����
		System.arraycopy(arr,2,arr2,0,4);

		for(int i=0; i<arr2.length; i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("====================================");
		
		//Ȯ���   for��
		// �迭�� ������ Ÿ�Ժ��� : �迭��
		for(int data : arr ){
			System.out.println(data);
		}//for
	}
}
