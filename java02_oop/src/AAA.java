
public class AAA {
	static int num=100;
}//class

class BBB{
	int num=200;
	BBB(){}
	static BBB getInstance() {
		return new BBB();
	}
	void setNum(int num) { 
		this.num = num;
	}
}//class

class CCC{
	static int num=300;
	static String name="홍길동";
	static String addr ="서울시 마포구";
	
	//상수만들기
	static final int MAX = 100;
	static final int MIN = 1;
	CCC(){}
	static void print() {
		// final 변수의 값은 수정불가
		//MAX = 200;
		System.out.println("번호="+num);
		System.out.println("이름="+name);
		System.out.println("주소="+addr);
		System.out.println("MIN="+MIN+", MAX="+MAX);
		
	}
}

