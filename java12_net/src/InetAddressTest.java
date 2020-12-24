

import java.net.InetAddress;

public class InetAddressTest {

	public InetAddressTest() {
		
	}
	public void start() {
		try {
			//ip, domain을 이용하여  InetAddress객체를 생성하여 통신한다.
		
			//내컴퓨터의 아이피의 얻어오기
			InetAddress ia1 = InetAddress.getLocalHost();
			String hostName = ia1.getHostName();//domain, domain이 없을경우 컴퓨터이름을 구한다.
			String address = ia1.getHostAddress();//ip
			System.out.println(hostName+", "+address);
			
			//url주소를 이용한 InetAddress객체 구하기
			InetAddress ia2 = InetAddress.getByName("www.naver.com");
			System.out.println("ia2.address="+ ia2.getHostAddress());//ip
			System.out.println("ia2.name="+ ia2.getHostName());//도메인
			
			//210.89.160.88 
			//ip를 이용한 InetAddress객체생성
			InetAddress ia3 = InetAddress.getByName("210.89.160.88");
			System.out.println("ia3.address="+ ia3.getHostAddress());
			System.out.println("ia3.name="+ ia3.getHostName());
			
			//ip가 여러개일때 
			InetAddress ia4[] = InetAddress.getAllByName("www.nate.com");
			
			System.out.println("--------------------------------------");
			for( InetAddress ia : ia4) {
				System.out.println("ia.name="+ ia.getHostName());
				System.out.println("ia.address="+ ia.getHostAddress());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	public static void main(String[] args) {
		new InetAddressTest().start();
	}
}








