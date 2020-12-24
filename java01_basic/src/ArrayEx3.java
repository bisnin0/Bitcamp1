class ArrayEx3 
{
	public static void main(String[] args) 
	{
		int data[][] = new int[15][15];
		
		for(int r=0; r<data.length; r++){
			for(int c=0; c<data[r].length; c++){
				if(r==c || r+c==data.length-1 ) data[r][c]=100;
			}
		}

		for(int r=0; r<data.length; r++){
			for(int c=0; c<data[r].length; c++){
				System.out.printf("%5d", data[r][c]);
			}
			System.out.println();
		}
	}
}
