class ForTest2 
{
	public static void main(String[] args) 
	{
		int sum=0;//초기화
		int i=0;
		for(i=1; i<=100; i++){
			sum = sum + i; // sum += i;
		}
		System.out.println("1~"+(i-1)+"까지의 합은 "+ sum);
	}
}
/*
1 ~ 100 까지 합은 5050
*/