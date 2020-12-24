import java.util.Scanner;

public class EmailCheck {
	Scanner scan = new Scanner(System.in);
	final String EMAIL_MSG = "이메일입력";
	final String QNA_MSG = "계속하시겠습니까(Y:예, N:아니오)?";
	
	public EmailCheck() {		
	}
	//
	public void emailCheckStart() {
		lbl:
		do {
			String email = getInput(EMAIL_MSG);//이메일입력
			//유효성 검사
			if(emailCheck(email)) {
				//정상메일
				emailOutput(email);//도메인, 아이디분리 출력
				//계속유무확인
				do {
					String qna = getInput(QNA_MSG);					
					if(qna.equalsIgnoreCase("Y")) {
						break;
					}else if(qna.equalsIgnoreCase("N")){
						break lbl;
					}	
				}while(true);
			}else {
				System.out.println("잘못된 이메일 주소 입니다. 다시 입력하세요..");
			}			
		}while(true);
	    System.out.println("프로그램이 종료되었습니다.");
	}
	public void emailOutput(String email) {
		String emailCut[] = email.split("@");
		System.out.println("아이디="+ emailCut[0]);
		System.out.println("도메인="+ emailCut[1]);
	}
	// @, .검사
	public boolean emailCheck(String email) {
		int atMark = email.indexOf("@");// @위치의  index를 구하고 없을경우 -1;
		int point = email.indexOf(".");//. 위치구하기
		
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
	//문자열 입력
	public String getInput(String msg) {
		System.out.print(msg+"=");
		return scan.nextLine();
	}
	public static void main(String[] args) {		
		new EmailCheck().emailCheckStart();
	}
}
/*
실행
        012345678
이메일입력=gogfyy.gde@han@magil.com
잘못된 이메일주소입니다.
이메일입력=jjj@nate.com
아이디=goguma
도메일=nate.com
계속하시겠습니까(Y:예, N:아니오)?=Y
*/
