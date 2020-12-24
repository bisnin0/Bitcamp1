import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		
	}
	public void start() {
		// TreeMap : key, value를 가진다.
		//           key를 기준으로 정렬되어 있다.
		
		TreeMap<String, MemberVO> tm = new TreeMap<String, MemberVO>();
		
		MemberVO vo = new MemberVO(50, "홍길동", "010-7899-2121", "abcd@nate.com");
		tm.put("홍길동", vo);
		tm.put("강감찬", new MemberVO(10, "강감찬", "010-9999-4444", "great@naver.com"));
		tm.put("세종대왕", new MemberVO(30, "세종대왕", "010-1212-1212", "best1234@hanmail.net"));
		tm.put("이순신", new MemberVO(25,"이순신", "010-7412-1111", "asdf@nate.com"));
		tm.put("김삿갓", new MemberVO(40,"김삿갓", "101-2222-5555", "hhhhhh@naver.com"));
		
		MemberVO vo2 = tm.get("이순신");
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
