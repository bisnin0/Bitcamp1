import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

import java08_swing.RGB2;

public class JTabbedPaneTest extends JFrame {
	JTabbedPane pane = new JTabbedPane();
	JButton btn =new JButton("탭패널 테스트 중");
	ImageIcon ii = new ImageIcon("img/2.png");
	ImageIcon ii2 = new ImageIcon("img/5_s.jpg");
	JLabel lbl = new JLabel(ii);
	RGB2 rgb = new RGB2();
	CalculatorSwing2 cs2 = new CalculatorSwing2();//계산기
	CalendarSwing2 calendar = new CalendarSwing2();//달력
	public JTabbedPaneTest() {
		super("탭메뉴");
		//       제목,내용
		pane.add("버튼", btn);
		pane.add("이미지", lbl);
		pane.add("색상표",  rgb);
		
		pane.insertTab("", ii2, cs2, "계산기", 1);//탭메뉴 삽입
		pane.insertTab("달력",null, calendar,"달력",3);
		
		add(pane);
		setSize(700, 700);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		
		//탭메뉴의 활성화(true), 비활성화(fasle) 
		// setEnabled() : 첫번째 탭만 활성화 나머지 탭은 비활성화한다.
		//pane.setEnabled(false);
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		//원하는 탭만 활성화, 비활성화
		pane.setEnabledAt(3, false);
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		//원하는 탭만 활성화, 비활성화
		pane.setEnabledAt(3, true);
		
		//탭메뉴 위치 이동
		pane.setTabPlacement(JTabbedPane.LEFT);
		
	}
	public static void main(String[] args) {
		new JTabbedPaneTest();
	}
}











