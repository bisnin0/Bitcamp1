//package p1.p2.p3;

import java.lang.String;
import java.util.Scanner;
import java.io.*;

public class BasicOOP {
	//전역변수(멤버변수)
	int a=1234; //0
	String name;//null
	
	//생성자 메소드 : 객체를 생성할때 한번 실행한다.
	//            메소드명이 반드시 클래스명과 같아야 한다.
	//            생성자 메소드 반환형이 없다.
	public BasicOOP() {	
		System.out.println("생성자 ="+ a);
	}
	public BasicOOP(int a) {		
	}
	//메소드   반환형
	//      메소드은 소문자시작, 합성어일 경우 두번째단어의 첫번째문자를 대문자.. 숫자사용가능
	//      첫번째문자 영어 소문자이여야 한다.
	public void sum() {
		//기능구현
		int s=0;
		for(int i=1; i<=10; i++) {
			s += i;
		}
		System.out.println("s="+s);
		System.out.println("sum->a="+a);
	}
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("c="+c);
		//내부클래스 - 메소드내의 내부클래스
		class BBB{
			
		}
	}
	public String getName() {
		return "홍길동";
	}
	//내부클래스
	class AAAA{
		
	} 

}//class





