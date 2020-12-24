import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DigitalClock3 extends JPanel implements Runnable{
	JLabel lbl = new JLabel("11:50:10");
	Font fnt = new Font("Arial", Font.BOLD, 100); 
	int x=1;
	public DigitalClock3() {
		setLayout(new BorderLayout());
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image icon = kit.getImage("img/2.png");

		lbl.setHorizontalAlignment(JLabel.CENTER);//JLabel 문자열 가운데 정렬
		lbl.setFont(fnt);
		add(lbl);			
	}
	//시간 설정
	public void run() {
		do {
			Calendar now = Calendar.getInstance();//현재시간
			//문자열 11:50:10
			SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
			String nowStr = fmt.format(now.getTime());
			//라벨에 셋팅
			lbl.setText(nowStr);
			//일시정지
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}while(true);
	}	
}













