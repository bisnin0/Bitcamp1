import test.CCC;
public class ModifyTest {

	public ModifyTest() {
		//public : 어떤 클래스에서든 접근을 허용한다.(클래스,멤버변수,생성자메소드,메소드)
		//default : 접근제한자 생략한것을 말한다. 같은 팩키지 내에서만 접근이 가능하다.
		//private : 다른 클래스에서 접근할수 없다. 같은 클래스 내에서만 접근이 가능하다. 
		//          멤버변수가 private일 경우 객체를 통한 접근이 불가능하다.
		AAA a = new AAA();
		System.out.println("a.name="+ a.name);
		a.print();
		
		//CCC c = new CCC();
		CCC c = CCC.getInstance();
		
		//System.out.println("c.tel="+ c.tel);
		//c.sum();
		
		//생성자 메소드 private 이면 객체를 생성할수 없다.
		BBBB b = new BBBB();
		// private멤버변수 접근하기 : 불가능
		//System.out.println("addr="+ b.addr);
		b.output();
	}

	public static void main(String[] args) {
		new ModifyTest();
	}

}
