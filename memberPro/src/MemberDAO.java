import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.proxy.annotation.GetDelegate;

public class MemberDAO extends DBConn {

	public MemberDAO() {
		
	}
	public static MemberDAO getInstance() {
		return new MemberDAO();
	}
	//레코드추가
	public int insertRecord(MemberVO vo) {
		int result = 0;
		try {
			getConn();
			
			String sql = "insert into member(num, username, tel, email, addr, writedate) "
					+ "values(?,?,?,?,?,sysdate)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getNum());
			pstmt.setString(2, vo.getUsername());
			pstmt.setString(3, vo.getTel());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getAddr());
			
			result = pstmt.executeUpdate(); 
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			getClose();
		}		
		return result;
	}
	//레코드수정
	public int updateRecord(MemberVO vo) {
		int result=0;
		try {
			getConn();
			String sql = "update member set username=?, tel=?, email=?, addr=? "
					+ "where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUsername());
			pstmt.setString(2, vo.getTel());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getAddr());
			pstmt.setInt(5, vo.getNum());
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			
		}finally {
			getClose();
		}
		return result;
	}
	//레코드삭제
	public int deleteRecord(int num) {
		int result=0;
		try {
			getConn();
			String sql = "delete from member where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			getClose();
		}
		return result;
	}
	//레코드전체 선택
	public List<MemberVO> getAllMember() {
		List<MemberVO> list= new ArrayList<MemberVO>();
		try {
			getConn();
			
			String sql = "select num, username, tel, email, addr, writedate from member order by num";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
//				MemberVO vo = new MemberVO();
//				vo.setNum(rs.getInt(1));
//				vo.setUsername(rs.getString(2));
//				vo.setTel(rs.getString(3));
//				vo.setEmail(rs.getString(4));
//				vo.setAddr(rs.getString(5));
//				vo.setWritedate(rs.getString(6));
				
				MemberVO vo = new MemberVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				list.add(vo);
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			getClose();
		}
		return list;
	}
	//검색어가 있는 경우 레코드 검색
	public List<MemberVO> getSearchSelect(String searchKey, String searchWord){
		List<MemberVO> lst = new ArrayList<MemberVO>();
		try {
			getConn();
			String sql = "select num, username, tel, email, addr, writedate "
					+ " from member where ";
			if(searchKey.equals("이름")) {
				sql += " username like ? ";
			}else if(searchKey.equals("연락처")) {
				sql +=" tel like ? ";
			}
			sql += " order by num";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+searchWord+"%");
			
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setNum(rs.getInt(1));
				vo.setUsername(rs.getString(2));
				vo.setTel(rs.getString(3));
				vo.setEmail(rs.getString(4));
				vo.setAddr(rs.getString(5));
				vo.setWritedate(rs.getString(6));
				lst.add(vo);
			}
			
		}catch(Exception e) {
			
		}finally {
			getClose();
		}
		return lst;
	}
}
