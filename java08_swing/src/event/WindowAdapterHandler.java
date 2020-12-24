package event;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowAdapterHandler extends JFrame{
    JFrame frm ;
	public WindowAdapterHandler() {
		frm = this;
		setSize(500,500);
		setVisible(true);
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		// �߻�޼ҵ尡 �������̵� �Ǿ��ִ�  AdapterŬ������ �� �������̵��Ѵ�.
		// �͸��� ���� Ŭ����
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				int status = JOptionPane.showConfirmDialog(frm, "���� �����Ͻðڽ��ϱ�?");
				if(status==JOptionPane.OK_OPTION) {
					dispose();
					System.exit(0);
				}
			}
		});
	}

	public static void main(String[] args) {
		new WindowAdapterHandler();
	}
}