class Array4 
{
	public static void main(String[] args) 
	{
		//배열의 복사

		//배열은 생성후 배열의 크기를 변경할수 없다.
		int arr[] = {56, 15, 78, 69, 86, 41, 99};//0~6

		int arr2[] = new int[20];

		
        //          원본배열, 복사시작index, 타겟배열, 시작, 갯수
		System.arraycopy(arr,2,arr2,0,4);

		for(int i=0; i<arr2.length; i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("====================================");
		
		//확장된   for문
		// 배열의 데이터 타입변수 : 배열명
		for(int data : arr ){
			System.out.println(data);
		}//for
	}
}
