import java.util.Scanner;
import java.util.TreeSet;

public class LottoCollection {
	Scanner scan = new Scanner(System.in);
	public LottoCollection() {}
	//콘솔에서 문자열 입력 ->게임수, 계속여부
	public String conInput(String msg) {
		System.out.print(msg+"=");
		return scan.nextLine();
	}
	//1게임 생성 : 중복검사, 정렬
	public void createLotto(int cnt) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		do {
			int lotto = (int)(Math.random()*45)+1;// 1~45  마지막으로 생성한 번호
			ts.add(lotto);
			if(ts.size()>=7) { //7개의 번호가 있음
				ts.remove(lotto);//마지막 생성된 번호 지우기
				lottoNumPrint(ts, lotto, cnt);
				break;
			}			
		}while(true);		
	}	
	//출력
	public void lottoNumPrint(TreeSet<Integer> ts, int lotto, int cnt) {
		System.out.print(cnt+"게임=");
		System.out.print(ts.toString());
		System.out.println(", bonus="+lotto);
	}
	//생성시작
	public void createStart() {
		do {
			try {
				int gameCnt = Integer.parseInt(conInput("게임수")); //게임수입력  "6"   "A"
				for(int i=1; i<=gameCnt; i++) {
					createLotto(i);
				}
				//계속여부
				do {
					String qna = conInput("계속하시겠습니까(Y:예, N:아니오)?");
					if(qna.equalsIgnoreCase("Y")) {//Y
						break;
					}else if(qna.equalsIgnoreCase("N")) {//N
						//프로그램종료
						System.out.println("프로그램이 종료되었습니다.");
						System.exit(0);
					}
				}while(true);
				//
			}catch(NumberFormatException nfe) {
				System.out.println("양의 정수를 입력하세요....");
			}
			
		}while(true);
	
	}	
	public static void main(String[] args) {
		new LottoCollection().createStart();
		
	}
}
