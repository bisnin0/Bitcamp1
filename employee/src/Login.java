import java.util.HashMap;

public class Login {
	private String userid="admin";
	private String userpwd="1234";
	public Login() {
		
	}
	public boolean empCheck(String userid, String userpwd) {
		if(this.userid.equals(userid) && this.userpwd.equals(userpwd)) {
			return true;//로그인 성공
		}else {
			 return false; 
		}
	}
	public static HashMap<String, EmployeeVO> setEmp() {
		HashMap<String, EmployeeVO> hm = new HashMap<String, EmployeeVO>();
		hm.put("홍길동", new EmployeeVO(100,"홍길동","010-1111-2222","기획부","과장"));
		hm.put("이순신", new EmployeeVO(200,"이순신","010-5555-5555","인사부","사원"));
		hm.put("강감찬", new EmployeeVO(500,"강감찬","010-9999-9999","총무부","부장"));
		hm.put("장영실", new EmployeeVO(300,"장영실","010-7777-7777","영업무","대리"));
		hm.put("유승룡", new EmployeeVO(700,"유승룡","010-8888-8888","총무부","사원"));
		return hm;
	}
}
