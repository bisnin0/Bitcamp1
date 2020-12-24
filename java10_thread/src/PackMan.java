import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PackMan extends JPanel implements Runnable{
	Image img;
	int x, y;
	int p=0;
	MyCanvas canvas;
	public PackMan() {
		setLayout(new BorderLayout());
		img = Toolkit.getDefaultToolkit().getImage("img/packman.jpg");
		
		canvas = new MyCanvas();
		add(canvas);
		x = this.getWidth() / 2 - 25;
		y = this.getHeight() / 2 - 25;
		System.out.println(this.getWidth()+","+this.getHeight());		
		//KeyEvent
		canvas.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent k) {
				//����Ű,asdw
				int key = k.getKeyCode();
				if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
					p=0;  // 1
				}else if(key==KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
					p=2;  // 3
				}else if(key==KeyEvent.VK_UP || key==KeyEvent.VK_W) {
					p=4;  // 5
				}else if(key==KeyEvent.VK_DOWN || key==KeyEvent.VK_S) {
					p=6;  // 7
				}else if(key==KeyEvent.VK_ESCAPE) {
					System.exit(0);
				}
			}			
		});		
	}
	public void run() {
		//
		while(true) {
			canvas.repaint();			
			//������ȯ
			if(p%2==0) p++;
			else p--;			
			//��ǥ�̵�
			if(p==0 || p==1) {//��������
				x-=5;
				if(x<=-50) {
					x=canvas.getWidth();
				}
			}else if(p==2 || p==3) {//����������
				x+=5;
				if(x>=canvas.getWidth()) {
					x=-50;
				}
			}else if(p==4 || p==5) {//��������
				y-=5;
				if(y<=-50) {
					y = canvas.getHeight();
				}
			}else if(p==6 || p==7) {
				y+=5;
				if(y>=canvas.getHeight()) {
					y = -50;
				}				
			}				
			try {
				Thread.sleep(200);
			}catch(Exception e) {}
		}
	}
	class MyCanvas extends Canvas{		
		MyCanvas(){			
		}
		public void paint(Graphics g) {
			g.drawImage(img, x, y, x+50, y+50,   p*50, 0, p*50+50, 50, this);
		}
	}
}