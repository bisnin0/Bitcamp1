import test.CCC;
public class ModifyTest {

	public ModifyTest() {
		//public : � Ŭ���������� ������ ����Ѵ�.(Ŭ����,�������,�����ڸ޼ҵ�,�޼ҵ�)
		//default : ���������� �����Ѱ��� ���Ѵ�. ���� ��Ű�� �������� ������ �����ϴ�.
		//private : �ٸ� Ŭ�������� �����Ҽ� ����. ���� Ŭ���� �������� ������ �����ϴ�. 
		//          ��������� private�� ��� ��ü�� ���� ������ �Ұ����ϴ�.
		AAA a = new AAA();
		System.out.println("a.name="+ a.name);
		a.print();
		
		//CCC c = new CCC();
		CCC c = CCC.getInstance();
		
		//System.out.println("c.tel="+ c.tel);
		//c.sum();
		
		//������ �޼ҵ� private �̸� ��ü�� �����Ҽ� ����.
		BBBB b = new BBBB();
		// private������� �����ϱ� : �Ұ���
		//System.out.println("addr="+ b.addr);
		b.output();
	}

	public static void main(String[] args) {
		new ModifyTest();
	}

}
