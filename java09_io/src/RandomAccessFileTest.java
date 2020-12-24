import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public RandomAccessFileTest() {
		//file의 정보를 입출력할수 있으며, index를 이용해 이동할수 있다.
		try {
			String txt = "java input output stream test....";
			File f = new File("D://javaFolder/access.txt");
			
			// w:쓰기전용, rw:쓰기읽기, r:읽기전용
			RandomAccessFile raf = new RandomAccessFile(f, "rw");
			raf.writeBytes(txt);
			
			//위치이동
			raf.seek(5);
			raf.writeBytes("ABCD");
			
			raf.seek(10);
			raf.writeInt(1234);
			
			// 읽기
			raf.seek(10);
			int intData = raf.readInt();
			System.out.println("int="+ intData);
			raf.close();			
			
		}catch(Exception e) {
			
		}
	}
	public static void main(String[] args) {
		new RandomAccessFileTest();
	}
}





