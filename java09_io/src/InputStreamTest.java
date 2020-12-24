import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public InputStreamTest() {
		try {
			// input, output : byte
			// reader, writer : char
			
			//byte단위로 콘솔에서 데이터 입력받는 클래스
			InputStream in = System.in;
			
			System.out.print("입력=");
			while(true) {
				int data = in.read();	
				if(data==13)break;
				System.out.println("data="+(char)data);				
			}
			//byte배열을 이용한 데이터 입력
//			byte data[] = new byte[10];
//			int cnt = in.read(data);
//			System.out.println(cnt+"-->"+ new String(data,0,cnt-2)+"===");
			
//			byte data[] = new byte[10];
//			int cnt = in.read(data, 3, 5);
//			System.out.println(cnt+"-->"+ new String(data)+"---");
			
			System.out.println("end...");
		}catch(IOException io) {
			io.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new InputStreamTest();
	}
}
