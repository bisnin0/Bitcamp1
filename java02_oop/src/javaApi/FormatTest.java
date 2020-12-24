package javaApi;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public FormatTest() {
		try {
			//화폐단위 표시
			int money = 51284; //  51,274,284원
			DecimalFormat fmt = new DecimalFormat("#,###원");
			
			String moneyStr = fmt.format(money); // 51,284원
			System.out.println("moneyStr="+ moneyStr);
			
			//화폐단위 문자를 숫자로 변환
			NumberFormat fmt2 = NumberFormat.getNumberInstance();
		
			Number num = fmt2.parse(moneyStr);
			int numInt = num.intValue();
			System.out.println("numInt="+ numInt);			
		}catch(Exception e) {}
		
		//날짜을 이용한 포멧
		Calendar now = Calendar.getInstance();
		SimpleDateFormat dateFmt = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss");
		String dateStr = dateFmt.format(now.getTime());
		System.out.println("dateStr="+ dateStr);
	}

	public static void main(String[] args) {
		new FormatTest();		
	}
}
