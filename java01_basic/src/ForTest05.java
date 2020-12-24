class ForTest05 
{
	public static void main(String[] args) 
	{
		// break : 반복문 종료
		// continue : 반복문 한번 건너뛰기
		int sum = 0;
		for(int i=1; i<=1000; i++){
			sum += i;
			if(sum>1000){
				System.out.println(i+"-->"+ sum);
				//break;
				continue;
			}
			System.out.println("aaaaaaaaa");
		}
		System.out.println("end...");
	}
}
