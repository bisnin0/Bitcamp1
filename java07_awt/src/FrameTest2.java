import java.awt.Button;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class FrameTest2 {
	Frame frm  = new Frame("창제목");
	Button btn = new Button("OK");
	public FrameTest2() {
		frm.setTitle("수정된 창제목");
		
		frm.add(btn);
		
		//컨테이너 아이콘 설정
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image icon = tk.getImage("img/5.jpg");
		frm.setIconImage(icon);		
		
		frm.setSize(500,500);
		frm.setVisible(true);
	}

	public static void main(String[] args) {
		new FrameTest2();
	}
}
