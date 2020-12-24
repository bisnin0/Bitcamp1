class Array5 
{
	public static void main(String[] args) 
	{
		//2차원배열 : 행과열이 배열을 선언할때
		int arr[][] = new int[5][3]; //초기값 0
		
		int arr2[][];
		arr2 = new int[5][5];	

		//2차원 배열이 데이터 저장하기
		arr[0][1] = 30;
		arr[2][0] = 10;
		arr[3][2] = 20;
        //             행의수
		for(int r=0; r<arr.length; r++){//행  0, 1,2,3,4
			for(int c=0; c<arr[r].length; c++){//열  0,1,2
				System.out.print(arr[r][c]+"\t");	
			}
			System.out.println();
		}

		//2차원 배열의 초기값 설정
		//int num[][] = new int[][]{}
		int num[][] = { {30,40,50},
						{40,60,10},
						{40,50,80}};
		System.out.println("--------------------------------");
		for(int i=0; i<num.length; i++){
			for(int j=0; j<num[i].length; j++){
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
