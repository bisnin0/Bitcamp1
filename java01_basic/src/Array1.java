class Array1 
{
	public static void main(String[] args) 
	{
		//�迭�̶� ���� ���������� ������ ������ �ʿ��� �� �����Ѵ�.
		//�迭�� ���� ���� ������ index�� �̿��Ͽ� �����Ҽ� �ִ�.

		//�迭������ -  ������10���� ������ ����
		int num[] = new int[11]; //0���� �ʱⰪ, 
		double num2[] = new double[5]; // 0.0���� �ʱⰪ
		String name[] = new String[10]; // null���� �ʱ� ����

		num[1] = 90;
		num[3] = 100;
		num[7] = 80;

		//int sum=0;         �迭�� ����=������ ����
		//                  idx< num.length-1,idx<= num.length-2
		for(int idx=0; idx< num.length-1 ; idx++){//1,2,3,4,5,6,7,8,9
			num[10] += num[idx];
			System.out.println("num["+idx+"]="+ num[idx]);
		}
		System.out.println("sum="+num[10]);
	}
}
