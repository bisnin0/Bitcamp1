package javaApi;
import java.util.Random;
class RandomTest2 
{
	public static void main(StringTokenizerTest[] args) 
	{
		// Random클래스를 이용한 난수 만들기
		Random ran = new Random();

		for(int i=1; i<=500;i++){
			// int 데이터범위내의 임의의 수 
			// nextDouble(), nextFloat() 
			// nextBoolean(),
			// 0~99,   0~49
			// 51~100  ,           큰-작+1
			int ranInt = ran.nextInt(50) + 51;//int형정수를 생성하여준다., nextLong()
			//boolean ranInt = ran.nextBoolean();
			System.out.print(ranInt+"\t");
		}
	}
}
