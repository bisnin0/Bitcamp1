import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/*
   224.0.0.0 ~ 239.255.255.255

   230.1.1.100
   230.1.1.
   
*/
public class MulticasteSend {
	InetAddress ia;
	MulticastSocket ms;
	DatagramPacket dp;
	public MulticasteSend() {
		
	}
	public void start() {
		try {
			ia = InetAddress.getByName("230.1.1.100");
			ms = new MulticastSocket();
			
			//����������
			String data = "Java ��Ʈ��ũ �׽�Ʈ��....";
			dp = new DatagramPacket(data.getBytes(), data.getBytes().length, ia, 20000);
			
			ms.send(dp);//������
			ms.close();
			System.out.println("���ۿϷ�...��");
		}catch(Exception e) {}
	}
	public static void main(String[] args) {
		new MulticasteSend().start();
	}

}







