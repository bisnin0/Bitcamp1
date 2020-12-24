class ForTest6 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5 ; i++){//1
			//5
			for(int j=1; j<=5 ; j++){//1,2,3,4,5
				System.out.print("*");//25
			}
			System.out.println();//줄변경
		}
		/*

		*
		**
		***
		****
		*****

		*/
		for(int i=1; i<=5; i++){//1, 2,3
			
			for(int j=1; j<=i ; j++){// 1-1,   1-2, 1-3, 1-4, 1-5
				System.out.print("A");
			}
			System.out.println();
		}
		/*

		*****     1~5
		****      1~4
		***       1~3
		**        1~2
		*         1~1

		*/
		for(int i=5; i>=1; i--){//5,4,3,2,1
			for(int j=1; j<=i; j++){
				System.out.print("B");
			}
			System.out.println();
		}

		/*

			*
		   **
		  ***
		 ****
		*****

		*/
		for(int i=1; i<=5; i++){// 1,2,3,4,5
			//공백                  4,3,2,1,0 
			for(int space=1; space<=5-i; space++){
				System.out.print(" ");
			}

			//별
			for(int j=1; j<=i; j++){
				System.out.print("@");
			}
			System.out.println();
		}
		/*

		*****
		 ****
		  ***
		   **
            *
		
		*/
		for(int i=5; i>=1; i--){// 5, 4, 3, 2, 1
			//공백
			for(int s=1; s<=5-i; s++){
				System.out.print(" ");
			}
			//별
			for(int j=1; j<=i; j++){
				System.out.print("%");
			}
			System.out.println();
		}
		/*
				*
			   ***
			  *****
			 *******
			*********

		*/
		for(int i=1; i<=9; i+=2){// 1,3,5,7,9
			//공백                   4,3,2,1,0 
			for(int s=1;s<=(9-i)/2 ; s++){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("$");
			}
			System.out.println();
		}
		/*
			*********
			 *******
			  *****
			   ***
			    *
		*/
	}
}
/*
중첩반복문 :  반복문내의 반복문

실행
1    2    3    4     5
1    2    3    4     5
1    2    3    4     5
1    2    3    4     5
1    2    3    4     5

*/