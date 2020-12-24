class ArraySelectionSort 
{
	public static void main(String[] args) 
	{
		int ran[] = new int[10];
		//난수 생성
		System.out.println("-------정렬전----------");
		for(int i=0; i<ran.length; i++){
			ran[i] =  (int)(Math.random()*(100-1+1))+1;
			System.out.print(ran[i]+"\t");
		}
		//             10-1
		for(int i=0; i<ran.length-1; i++){//0, 1,2, .....8
			//      1
			for(int j=i+1; j<ran.length; j++){
				if(ran[i] < ran[j]){
					int temp = ran[j];
					ran[j] = ran[i];
					ran[i] = temp;
				}
			}
		}
		System.out.println("\n-----정렬후-----");
		for(int i=0; i<ran.length; i++){
			System.out.print(ran[i]+"\t");
		}
	}
}
