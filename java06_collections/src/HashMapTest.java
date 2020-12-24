import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public HashMapTest() {
		
	}
	public void start() {
		// HashMap : ����ȭ���� �ʴ´�.   Hashtable : ����ȭ�Ѵ�.
		//HashMap<String, MemberVO> map = new HashMap<String, MemberVO>();
		
		Hashtable<String, MemberVO> map = new Hashtable<String, MemberVO>();
		
	
		map.put("ȫ�浿", new MemberVO(50, "ȫ�浿", "010-7899-2121", "abcd@nate.com"));
		map.put("������", new MemberVO(10, "������", "010-9999-4444", "great@naver.com"));
		map.put("�������", new MemberVO(30, "�������", "010-1212-1212", "best1234@hanmail.net"));
		map.put("�̼���", new MemberVO(25,"�̼���", "010-7412-1111", "asdf@nate.com"));
		map.put("���", new MemberVO(40,"���", "101-2222-5555", "hhhhhh@naver.com"));
		
		//key�� �̿��� ���� ������
		MemberVO vo2 = map.get("�������");
		vo2.print();
		System.out.println("============================");
		//key�� ��� ���ϱ�
		Set<String> keyList = map.keySet();
		Iterator<String> key = keyList.iterator();
		
		while(key.hasNext()) {
			MemberVO vo3 = map.get(key.next());
			vo3.print();
		}	
		System.out.println("-----------------------------");
		//value��� ���ϱ�
		Collection<MemberVO> value =  map.values();
		
		Iterator<MemberVO> v = value.iterator();
		while(v.hasNext()) {
			MemberVO vo4= v.next();
			vo4.print();
		}		
	}
	public static void main(String[] args) {
		new HashMapTest().start();
	}
}


