class Array1 
{
	public static void main(String[] args) 
	{
		//배열이란 같은 데이터형의 변수가 여러개 필요할 때 생성한다.
		//배열로 선택 각각 변수는 index을 이용하여 접근할수 있다.

		//배열선언방법 -  정수형10개를 저장할 공간
		int num[] = new int[11]; //0으로 초기값, 
		double num2[] = new double[5]; // 0.0으로 초기값
		String name[] = new String[10]; // null으로 초기 상태

		num[1] = 90;
		num[3] = 100;
		num[7] = 80;

		//int sum=0;         배열의 길이=변수의 갯수
		//                  idx< num.length-1,idx<= num.length-2
		for(int idx=0; idx< num.length-1 ; idx++){//1,2,3,4,5,6,7,8,9
			num[10] += num[idx];
			System.out.println("num["+idx+"]="+ num[idx]);
		}
		System.out.println("sum="+num[10]);
	}
}
