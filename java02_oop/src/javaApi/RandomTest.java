package javaApi;
class RandomTest 
{
	public static void main(StringTokenizerTest[] args) 
	{
		//���� ����
		// 0.0~1.0������ ���� �������ش�.
		for(int i=1; i<=1000; i++){
			double ran = Math.random();
			//1~100            (����)(����*(ū��-������+1)) + ������
			//51~100                      100-51+1
			int ranInt =(int)(ran*50)+51;// 100 -->  0~99 ,  50--> 0~49
			//System.out.println(ranInt+"<-"+ran);
			System.out.print(ranInt+"\t");
		}
	}
}
