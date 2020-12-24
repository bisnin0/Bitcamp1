import java.util.Scanner;
import java.util.TreeSet;

public class LottoCollection {
	Scanner scan = new Scanner(System.in);
	public LottoCollection() {}
	//�ֿܼ��� ���ڿ� �Է� ->���Ӽ�, ��ӿ���
	public String conInput(String msg) {
		System.out.print(msg+"=");
		return scan.nextLine();
	}
	//1���� ���� : �ߺ��˻�, ����
	public void createLotto(int cnt) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		do {
			int lotto = (int)(Math.random()*45)+1;// 1~45  ���������� ������ ��ȣ
			ts.add(lotto);
			if(ts.size()>=7) { //7���� ��ȣ�� ����
				ts.remove(lotto);//������ ������ ��ȣ �����
				lottoNumPrint(ts, lotto, cnt);
				break;
			}			
		}while(true);		
	}	
	//���
	public void lottoNumPrint(TreeSet<Integer> ts, int lotto, int cnt) {
		System.out.print(cnt+"����=");
		System.out.print(ts.toString());
		System.out.println(", bonus="+lotto);
	}
	//��������
	public void createStart() {
		do {
			try {
				int gameCnt = Integer.parseInt(conInput("���Ӽ�")); //���Ӽ��Է�  "6"   "A"
				for(int i=1; i<=gameCnt; i++) {
					createLotto(i);
				}
				//��ӿ���
				do {
					String qna = conInput("����Ͻðڽ��ϱ�(Y:��, N:�ƴϿ�)?");
					if(qna.equalsIgnoreCase("Y")) {//Y
						break;
					}else if(qna.equalsIgnoreCase("N")) {//N
						//���α׷�����
						System.out.println("���α׷��� ����Ǿ����ϴ�.");
						System.exit(0);
					}
				}while(true);
				//
			}catch(NumberFormatException nfe) {
				System.out.println("���� ������ �Է��ϼ���....");
			}
			
		}while(true);
	
	}	
	public static void main(String[] args) {
		new LottoCollection().createStart();
		
	}
}
