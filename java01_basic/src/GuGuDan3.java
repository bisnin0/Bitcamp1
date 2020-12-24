class GuGuDan3 
{
	public static void main(String[] args) 
	{
		System.out.println("\t=备备窜=");

		for(int dan=1; dan<=9; dan+=3){// 1, 4, 7
			
			//header
			for(int i=dan; i<dan+3; i++){//1,2,3    4,5,6     7,8,9
				System.out.print("="+i+"窜=\t");
			}
			System.out.println();

			//备备窜
			for(int j=2; j<=9; j++){//1,2,3   4,5,6      7,8,9
				for(int i=dan; i<dan+3; i++){//2,3,4,5,6,7,8,9
					int result = i*j;
					System.out.print(i+"*"+j+"="+result+"\t");
				}
				System.out.println();
			}
		}
	}
}
