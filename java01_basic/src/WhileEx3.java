class WhileEx3 
{
	public static void main(String[] args) 
	{
		int i=1;
		while(i<=9){//1
			
			int j=0;
			while(j<9){
				j++; //1	
				System.out.print(i*j+"\t");				
			}
			i++;
			System.out.println();
		}
	}
}
