import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest {
	Scanner scan = new Scanner(System.in);
	public SocketTest() {
		try {
			InetAddress ia = InetAddress.getByName("192.168.0.209");
			int port = 20000;
			Socket socket = new Socket(ia, port);//접속
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr= new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String msg = br.readLine();
			System.out.println("서버로부터 받은 문자->"+ msg);
		
			//클라언트가 서버로 문자보내기
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			pw.println("나 클라언트 문자를 서버로 보냄..");
			pw.flush();
			
			while(true) {
				System.out.print("보낼문자입력=");
				String data = scan.nextLine();
				socket = new Socket(ia, port);
				os = socket.getOutputStream();
				osw = new OutputStreamWriter(os);
				pw = new PrintWriter(osw);
				
				pw.println(data);
				pw.flush();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("클라이언트 프로그램이 종료되었습니다.");
	}

	public static void main(String[] args) {
		new SocketTest();
	}
}



