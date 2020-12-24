import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class ThreadEx extends JFrame {
	DigitalClock3 dc = new DigitalClock3();
	CalendarSwing2 cal = new CalendarSwing2();
	PackMan pm =new PackMan();
	public ThreadEx() {
	
		JSplitPane sp1 = new JSplitPane();
		sp1.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		sp1.add(pm, JSplitPane.RIGHT);
		
		JSplitPane sp2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, dc, cal);
		sp2.setDividerLocation(200);
		sp1.add(sp2, JSplitPane.LEFT);
		
		
		Thread dcThread = new Thread(dc);
		Thread pmThread = new Thread(pm);
		dcThread.start();
		pmThread.start();
		
		add(sp1);
		
		setSize(1200, 800);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		pm.y = pm.getHeight()/2+25;
		System.out.println(pm.x+","+pm.y);
	}

	public static void main(String[] args) {
		new ThreadEx();
	}
}
