class ArrayBubbleSort 
{
	public static void main(String[] args) 
	{
		int data[] = new int[10];

		for(int i=0; i<data.length; i++){
			data[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("================정렬전==============");
		for(int i=0; i<data.length; i++){
			System.out.print(data[i]+"\t");
		}
		for(int j=0; j<data.length-1; j++){//0,1,2,3,4,5,6,7,8,9
			//정렬     0       9   
			//        0       8
			for(int i=0; i< data.length-1-j;i++){//0,1,2,.....8
				if(data[i] > data[i+1]){
					//교환
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
				}
			}			
		}	
		System.out.println("\n===============정렬후=============");
		for(int t : data){
			System.out.print(t+"\t");
		}
	}
}
