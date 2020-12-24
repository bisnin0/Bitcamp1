import java.util.Scanner;

public class EmailCheck {
	Scanner scan = new Scanner(System.in);
	final String EMAIL_MSG = "�̸����Է�";
	final String QNA_MSG = "����Ͻðڽ��ϱ�(Y:��, N:�ƴϿ�)?";
	
	public EmailCheck() {		
	}
	//
	public void emailCheckStart() {
		lbl:
		do {
			String email = getInput(EMAIL_MSG);//�̸����Է�
			//��ȿ�� �˻�
			if(emailCheck(email)) {
				//�������
				emailOutput(email);//������, ���̵�и� ���
				//�������Ȯ��
				do {
					String qna = getInput(QNA_MSG);					
					if(qna.equalsIgnoreCase("Y")) {
						break;
					}else if(qna.equalsIgnoreCase("N")){
						break lbl;
					}	
				}while(true);
			}else {
				System.out.println("�߸��� �̸��� �ּ� �Դϴ�. �ٽ� �Է��ϼ���..");
			}			
		}while(true);
	    System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
	public void emailOutput(String email) {
		String emailCut[] = email.split("@");
		System.out.println("���̵�="+ emailCut[0]);
		System.out.println("������="+ emailCut[1]);
	}
	// @, .�˻�
	public boolean emailCheck(String email) {
		int atMark = email.indexOf("@");// @��ġ��  index�� ���ϰ� ������� -1;
		int point = email.indexOf(".");//. ��ġ���ϱ�
		
		if(atMark<4 || point<6 || point<atMark || point-atMark<2 
		   || atMarkCount(email,'@')!=1 || atMarkCount(email,'.')>2 ) {
			return false;
		}else {
			return true;
		}
	}
	public int atMarkCount(String email, char str) {
		int cnt=0;
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i)==str) {
				cnt++;
			}
		}
		return cnt; 
	}
	//���ڿ� �Է�
	public String getInput(String msg) {
		System.out.print(msg+"=");
		return scan.nextLine();
	}
	public static void main(String[] args) {		
		new EmailCheck().emailCheckStart();
	}
}
/*
����
        012345678
�̸����Է�=gogfyy.gde@han@magil.com
�߸��� �̸����ּ��Դϴ�.
�̸����Է�=jjj@nate.com
���̵�=goguma
������=nate.com
����Ͻðڽ��ϱ�(Y:��, N:�ƴϿ�)?=Y
*/
