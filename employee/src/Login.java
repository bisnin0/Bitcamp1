import java.util.HashMap;

public class Login {
	private String userid="admin";
	private String userpwd="1234";
	public Login() {
		
	}
	public boolean empCheck(String userid, String userpwd) {
		if(this.userid.equals(userid) && this.userpwd.equals(userpwd)) {
			return true;//�α��� ����
		}else {
			 return false; 
		}
	}
	public static HashMap<String, EmployeeVO> setEmp() {
		HashMap<String, EmployeeVO> hm = new HashMap<String, EmployeeVO>();
		hm.put("ȫ�浿", new EmployeeVO(100,"ȫ�浿","010-1111-2222","��ȹ��","����"));
		hm.put("�̼���", new EmployeeVO(200,"�̼���","010-5555-5555","�λ��","���"));
		hm.put("������", new EmployeeVO(500,"������","010-9999-9999","�ѹ���","����"));
		hm.put("�念��", new EmployeeVO(300,"�念��","010-7777-7777","������","�븮"));
		hm.put("���·�", new EmployeeVO(700,"���·�","010-8888-8888","�ѹ���","���"));
		return hm;
	}
}
