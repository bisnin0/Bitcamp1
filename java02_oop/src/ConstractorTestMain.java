
public class ConstractorTestMain {

	public static void main(String[] args) {
		
		ConstractorTest ct1 = new ConstractorTest();
		ConstractorTest ct2 = new ConstractorTest(999);
		ConstractorTest ct3 = new ConstractorTest(555, "ȫ�浿","010-7777-8888");
		ct1.prn();
		ct2.prn();
		ct3.prn();
		ConstractorTest ct4 = new ConstractorTest("�������","010-5656-7878", 333);
		ct4.prn();
		
		byte data[] = {65, 69, 70, 78, 66};
		String dataObj = new String(data);
		System.out.println("dataObj="+ dataObj);
	}
}
