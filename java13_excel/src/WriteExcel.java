import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/*
 POI다운로드
 jakarta.apache.org에서 poi-bin-4.1.2-20200217.zip다운로드
 
 poi-4.1.2.jar, commons-math3-3.6.1.jar BuildPath 설정한다. 
*/
public class WriteExcel {

	public WriteExcel() {
		
	}
	public void start() {
		//엑셀로 쓰기
		//1. workbook객체 생성
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		//2. sheet객체 생성
		HSSFSheet sheet1 = workbook.createSheet("회원목록");
		HSSFSheet sheet2 = workbook.createSheet();
		
		//3. row객체
		HSSFRow row1 = sheet1.createRow(0);
		
		HSSFCell cell = row1.createCell(0);
		cell.setCellValue("번호");
		
		row1.createCell(1).setCellValue("이름");
		row1.createCell(2).setCellValue("연락처");
		
		String data[][] = {{"1", "홍길동", "010-1234-5678"},
				           {"2", "이순신", "010-1212-4444"},
				           {"3", "세종대왕", "010-9999-7777"}};
		//        1~           3
		for(int i=1;i<=data.length; i++) {
			HSSFRow row = sheet1.createRow(i);
			//        0~2
			for(int j=0; j<data[i-1].length; j++) {
				HSSFCell cell2 = row.createCell(j);
				if(j==0) {
					cell2.setCellValue(Integer.parseInt(data[i-1][j]));
				}else {
					cell2.setCellValue(data[i-1][j]);
				}				
			}
		}

		//5. 파일로 쓰기
		try {
			File f = new File("D://javaFolder/member.xls");
			FileOutputStream fos = new FileOutputStream(f);
			
			workbook.write(fos);
			workbook.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("엑셀로 쓰기가 완료되었습니다.");
	}
	public static void main(String[] args) {
		new WriteExcel().start();		
	}
}
