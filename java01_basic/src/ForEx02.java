class ForEx02 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=100; i++){//1,2,3,4,5,6,7,8,9.....
			if(i%3!=0  &&  i%5!=0){
				System.out.println(i);
			}
		}
	}
}

/*
1~100사이의 값을 다음 결과와 같이 출력하라.

실행
1
2
4
7
8
11
13
14
16
17
19
22
:

*/