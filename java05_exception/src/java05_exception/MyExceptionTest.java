package java05_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {
	Scanner scan = new Scanner(System.in);
	public MyExceptionTest() {
		
	}
	public void start() {
		System.out.println(true & false);
		do {			
			try {
				System.out.print("�����Է�(1~100)=");
				String max1 = scan.nextLine();
			    int max = Integer.parseInt(max1); 
				if(max<1 || max>100) {//1~100���̰� �ƴѰ��
					throw new MyException("abcde");//������ ���ܹ߻���Ű��
				}
				//1~100 �����ΰ��
				sum(max);				
			}catch(InputMismatchException e) {
				System.out.println("������ �Է��Ͽ����ϴ�.");
			}catch(MyException me) {
				System.out.println(me.getMessage());
			}catch(NumberFormatException nf) {
				System.out.println(nf.getMessage());
			}			
		}while(true);
	}
	public void sum(int max) {
		int s =0;
		for(int i=1; i<=max; i++) {
			s += i;
		}
		System.out.println("1~"+max+"������ ���� "+s);
	}
	public static void main(String[] args) {
		new MyExceptionTest().start();
	}
}
