public class WhileTest2 
{
	public static void main(String[] args) 
	{
		int row=1;
		while(row<=5){//줄  1
			
			int col=1;
			while(col<=5){// 1,2,3
				System.out.print(col);
				col++;
			}
			System.out.println();
			row++;
		}
		System.out.println("The End......");
	}
}
/*
while문으로 만들기

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
12345
12345
*/
