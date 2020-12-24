import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class FileUnicasteReceive {
	DatagramSocket ds;
	DatagramPacket dp;
	FileOutputStream os = null;
	public FileUnicasteReceive() {
		
	}
	public void start() {
		try {
			DatagramSocket ds = new DatagramSocket(15000);
			
			byte data[] = new byte[512];
			DatagramPacket dp = new DatagramPacket(data, 0, data.length);
			
			while(true) {
				System.out.println("전송받기 대기중...");
				ds.receive(dp);
				
				byte receiveData[] = dp.getData();
				int length = dp.getLength();
				
				String dataStr = new String(receiveData, 0, length);
				
				if(length>12) {
					//파일명   [*filename*]aaaa.png
					if(dataStr.substring(0,12).equals("[*filename*]")) {
						//outstream
						os = new FileOutputStream(new File("D://javaFolder", dataStr.substring(12)));
					}else if(dataStr.substring(0, 12).equals("[*lastdata*]")) {					
						//마지막
						os.close();
						System.out.println("파일전송완료..");
					}else {//파일내용
						fileWrite(receiveData, length);
					}					
				}else {
					//파일내용
					fileWrite(receiveData, length);
				}
			}			
		}catch(Exception e) {}
	}
	public void fileWrite(byte data[], int len) {
		try {
			os.write(data, 0, len);
		}catch(Exception e) {}
	}
	public static void main(String[] args) {
		new FileUnicasteReceive().start();
	}
}
