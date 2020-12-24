import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		
	}
	public void start() {
		// TreeMap : key, value�� ������.
		//           key�� �������� ���ĵǾ� �ִ�.
		
		TreeMap<String, MemberVO> tm = new TreeMap<String, MemberVO>();
		
		MemberVO vo = new MemberVO(50, "ȫ�浿", "010-7899-2121", "abcd@nate.com");
		tm.put("ȫ�浿", vo);
		tm.put("������", new MemberVO(10, "������", "010-9999-4444", "great@naver.com"));
		tm.put("�������", new MemberVO(30, "�������", "010-1212-1212", "best1234@hanmail.net"));
		tm.put("�̼���", new MemberVO(25,"�̼���", "010-7412-1111", "asdf@nate.com"));
		tm.put("���", new MemberVO(40,"���", "101-2222-5555", "hhhhhh@naver.com"));
		
		MemberVO vo2 = tm.get("�̼���");
		vo2.print();
		System.out.println("*********key**************");
		Set<String> keyList = tm.keySet();
		Iterator<String> i = keyList.iterator();
		while(i.hasNext()) {
			MemberVO vo3 = tm.get(i.next());
			vo3.print();
		}		
		System.out.println("*********value**************");
		Collection<MemberVO> valueList= tm.values();
		Iterator<MemberVO> value = valueList.iterator();
		while(value.hasNext()) {
			MemberVO vo4 = value.next();
			vo4.print();
		}
		
	}
	public static void main(String[] args) {
		TreeMapTest tmt = new TreeMapTest();
		tmt.start();
	}
}
