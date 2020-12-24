import java.sql.SQLException;

public class TransactionTest extends DBConn {

	public TransactionTest() {
		
	}
	//�ڹٿ��� �����ͺ��̽� ���ڵ� �߰�, ����, ������ �ڵ�commit�� ����ȴ�.
	//�ڵ� commit�� �����ϰ� �۾��� �Ϸ�Ǹ�  commit�� �����ϰ�
	//    �����߻���   rollback����
	
	public void start() {
		try {
			getConn();
			conn.setAutoCommit(false);//�ڵ�Ŀ�� ����
			//1.
			String sql = "insert into member(num, username, tel, email, addr) "
					+ "values(15,'XXXX', '010-1111-1111','abcd@nate.com','����� ���ı�')";
			pstmt = conn.prepareStatement(sql);
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println("ù��°���ڵ� �߰� ����");
			}else {
				System.out.println("ù��° ���ڵ� �߰� ����");
			}
			//2.
			sql = "insert into member(num, username, tel, email, addr) "
					+ "values(16,'YYYY', '010-2222-2222-555555555555','yyyyyy@nate.com','����� ������')";
			pstmt = conn.prepareStatement(sql);
			cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println("�ι�°���ڵ� �߰� ����");
			}else {
				System.out.println("�ι�°���ڵ� �߰� ����");
			}			
			conn.commit();//Ŀ�Լ���
		}catch(Exception e) {
			try {
				conn.rollback();
			}catch(SQLException se) {}
			e.printStackTrace();
		}finally {
			getClose();
		}
	}
	public static void main(String[] args) {
		new TransactionTest().start();
	}
}
