
public class MethodTestMain {
	public MethodTestMain() {
		MethodTest mt = new MethodTest();
		//mt.getDan();//단입력받는 기능이 있는 메소드 호출
		//mt.danOutput();//입력받은 dan을 이용하여 해당 구구단 출력하는 메소드 호출
		mt.startDan();
	}
	public static void main(String[] args) {
		new MethodTestMain();
	}
}
