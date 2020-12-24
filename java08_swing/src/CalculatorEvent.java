import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CalculatorEvent implements ActionListener{
	JTextField tf;
	String oper = "";//연산자 저장
	double result = 0.0;
	public CalculatorEvent() {
		
	}
	public CalculatorEvent(JTextField tf) {
		this.tf = tf;
	}
	public void actionPerformed(ActionEvent ae) {
		String eventTxt = ae.getActionCommand();
		switch(eventTxt) {
		case "End":			
			System.exit(0);break;
		case "BackSpace":
			setBackSpace();
			break;
		case ".":
			setPoint();
			break;
		case "+":
		case "-":
		case "*":
		case "/":
			setOperator(eventTxt);
			break;
		case "=":
			setCalculator();
			break;
		case "Clear":
			setClear();
			break;
		default://숫자버튼일 경우
			setNumber(eventTxt);
		}
	}
	public void setClear() {
		result = 0.0;
		oper = "";
		tf.setText("0.0");
	}
	public void setCalculator() {
		double secondNum = Double.parseDouble(tf.getText());
		switch(oper) {
			case "+": result = result + secondNum;break;
			case "-": result = result - secondNum;break;
			case "*": result = result * secondNum;break;
			case "/": result = result / secondNum;break;
		}
		tf.setText(Double.toString(result));//계산결과  tf표시   String.valueOf(result)
		oper = "";//연산자 지우기
	}
	public void setOperator(String eventTxt) {
		oper = eventTxt;//연산자
		result = Double.parseDouble(tf.getText());
		tf.setText("");// tf초기화
	}
	public void setPoint() {
		//소숫점 있는지 확인한다.
		String txt = tf.getText();//  898.89   798
		if(txt.indexOf(".") == -1) {
			tf.setText(txt+".");
		}		
	}
	public void setNumber(String eventTxt) {
		String tfTxt = tf.getText();
		if(tfTxt.equals("0.0")) {
			tf.setText(eventTxt);
		}else {
			tf.setText(tfTxt+eventTxt);
		}
	}
	public void setBackSpace() {
		try {
			String txt = tf.getText();
			String cutTxt = txt.substring(0, txt.length()-1);
			tf.setText(cutTxt);
		}catch(StringIndexOutOfBoundsException sioobe) {
			System.out.println("에러발생함.");
		}
	}
}
















