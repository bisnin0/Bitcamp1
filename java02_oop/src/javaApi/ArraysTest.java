package javaApi;
import java.util.Arrays;
class ArraysTest
{
	public static void main(StringTokenizerTest[] args) 
	{
		//Arrays : 배열관련 클래스
		//                   2              6
		int data[] = {90,49,20,40, 50, 20, 40,91,5};

		//Arrays.sort(data); // 배열의 값을 정렬
		Arrays.sort(data,2,6);//index기준으로 정렬범위를 지정한다.  2부터 6앞 index까지 정렬한다.
		System.out.println( Arrays.toString(data));  //배열의 값을  문자열로 만들어준다.

		//배열의 복사
		int dataCopy[] = Arrays.copyOfRange(data,2,6);
		System.out.println(Arrays.toString(dataCopy));
 
		String name[] = {"홍길동","이순신","세종대왕", "강감찬",  "김삿갓"}; 
		Arrays.sort(name);
		String nameStr = Arrays.toString(name);
		System.out.println(nameStr);

		int data2[] = {90,49,20,40, 50, 20, 40,91,5};
		int data3[] = data;
		boolean boo = Arrays.equals(data, data3);//객체의 주소를 비교하여 같은지 확인해준다.
		System.out.println(boo);
	}
}
